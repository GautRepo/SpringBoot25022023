Spring Boot Scheduling

Scheduling : It is process of executing same task multiple times
             based on 'Period of Time' or 'Point of Time'

=> Period of Time : It is a time gap
   10 Sec.
   8 mins. 
   21 hrs.
   4 days.
   6 months.

=> Point of Time : Exact Date/Time
  11:00 AM.
  1:45:36 PM.
  26th Jan.
  OCT-2020

Ex Task multiple times:
a. B'Day wishes
b. Report every day/week/month at the end of Business.
c. Stock Exchange (MON-FRI 4PM Final Report)
d. Weekly database backup
e. Bank statement/CC Stmt/Loan EMI for every month
f. Electicity Bill
g. Employee PaySlips

 **  **  **  **  **  **  **  **  (coding steps)  **  **  **  **  **  **  **  **  ** 
<> Define one public class with any name
<> Apply StereoType Annotation (ex: @Component) over class
<> Define one method for Task Scheduling with void Return and zero params
<> Apply @Scheduled with fixedDelay/fixedRate/cron expression input
<> Enable this process, by adding : @EnableScheduling At starter class level.
______________________________________________________________________________________
Concept#1 fixedDelay (int value in mill sec)

<> @Scheduled(initialDelay = 5000,fixedDelay = 2000)
   Above line indicates Start scheduling after 5 sec gap of App Start.
   Repeate Same task(method call) after 2 sec gap.

<> This concept comes under Period of Time.    
  
----Example----------------------
a) Service Code
package in.nit.service;
import java.util.Date;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyReportsService {

	//1000 mill sec = 1 sec
	@Scheduled(initialDelay = 5000,fixedDelay = 2000)
	public void genRepo() {
		System.out.println("Hello"+new Date());
	}
}
b) Starter class level add:  @EnableScheduling
  and Run Starter.

++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Concept#2 fixedRate (int value in mill sec)

<> @Scheduled(fixedRate = 2000) // @Scheduled(initialDelay = 3000,fixedRate = 2000)
   Above Line of Code indicates Max Wait time including method execution time
   is 2Sec.

<> This concept comes under Period of Time.   

--Example code----
package in.nit.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyReportsService {
	
	@Scheduled(initialDelay = 3000,fixedRate = 2000)
	public void genRepo() {
		System.out.println("Hello"+new Date());
	}
}

=================================================================================
*** Concept#3 cron ****

https://docs.spring.io/spring/docs/current/javadoc-api
/org/springframework/scheduling/support/CronSequenceGenerator.html


<> It is Expression used to indicate time (Point of Time and Period of Time),
   Unix/Linux based OS.

<> Same concept is used in Spring Boot to execute Schedulers based on Expressions.

<> It follow below format :
     
      SEC      MIN     HRS      DAY       MONTH       WEEKDAY
      0-59     0-59    0-23     1-31      1-12        MON-SUN

<> We can also use symbols like
   *   any/all
   -   range
   ,   Possible set values
   /   period of time
   ?   any (used for DAY and WEEK DAY when Month is specified)

--cron Expressions with Meaning : Ponit of Time--------------------------
1.   0  0  8  *  *  *
=> Repeate task/method every day 8:00:00 AM

2.   0   30   9  *  *  *
=>  Repeate task/method every day 9:30 AM
      

3.   0   30  8,9,10   *  *  *
=> Repeate task/method every day 
    8:30:00 AM
    9:30:00 AM
    10:30:00 AM

3.   0   30  8-11   *  *  *
=> Repeate task/method every day 
    8:30:00 AM
    9:30:00 AM
    10:30:00 AM
    11:30:00 AM

4. 0   15,30   8   *  *  *
=> Repeate task/method every day
     8:15:00 AM and 8:30:00AM


5. 0   10    6,18   *  *  * 
=> Repeate task/method every day
   6:10:00 AM
   6:10:00 PM

6.  0    30   *   *   *   *
=> Repeate task/method every hour 30th min
   7:30:00
   8:30:00
   9:30:00

7. 10   *   *   *   *   *
=> Repeate task/method every Minute 10th Sec
    7:21:10 
    7:22:10
    7:23:10

--cron Expressions with Meaning : Period of Time-------------------------- 
8.  */10   *   *   *   *   *

=> Repeate task/method every 10 sec gap

9.  0   0/15   8  *  * *
=> Repeate task/method every day 
    8:00:00 AM and with 15 min time gap
    8:15:00 AM
    8:30:00 AM
    8:45:00 AM

10. 0/20  30  8  *  * *
> Repeate task/method every day 
    8:30:00 AM and with 20 sec time gap
    8:30:20
    8:30:40

Rule: Position Left side values can never be */unknown  For Time

Ex:   *  *  8  *  * *  //Invaild
Ex:   *  6  *  *  * *  //Invaild

=> If we provide hrs , them must specify any one value(not *)
   at Mins and Sec position.

=> If we provide mins , them must specify any one value(not *)
   at Sec position.    

----------cron with dates ----------------------
11.   0  0  10   12  1  MON-FRI
=> Jan 12 if date is MON-FRI only
    at 10:00:00 AM (next Year)

12.   0  0  9    *   12   *    //Invaild
 When month is specified then DAY and WEEK DAY must be specified.
   To give any DAY or WEEK DAY while month exist use symbol ?

    0   0   9   ?  12  ?  //vaild

13.  0   0  9   5  12  ?  //Vaild

14. Print Message every year Mid night Dec before next Year Starts.
=>  59  59 23 31  12  ?   //BYE BYE OLD YEAR

15. Welcome to new year
=> 0  0  0  1  1 ?

16. Your Date of birth one day before mid night


17. 

Example patterns:

"0 0 * * * *" = the top of every hour of every day.
"*/10 * * * * *" = every ten seconds.
"0 0 8-10 * * *" = 8, 9 and 10 o'clock of every day.
"0 0 6,19 * * *" = 6:00 AM and 7:00 PM every day.
"0 0/30 8-10 * * *" = 8:00, 8:30, 9:00, 9:30, 10:00 and 10:30 every day.
"0 0 9-17 * * MON-FRI" = on the hour nine-to-five weekdays
"0 0 0 25 12 ?" = every Christmas Day at midnight


*)Possible: SAT-SUN, THR-FRI, FRI-MON

---Example------------
package in.nit.service;
import java.util.Date;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component
public class MyReportsService {
	
	@Scheduled(cron = "*/10 * * * * *")
	public void genRepo() {
		System.out.println("Hello"+new Date());
	}
}
