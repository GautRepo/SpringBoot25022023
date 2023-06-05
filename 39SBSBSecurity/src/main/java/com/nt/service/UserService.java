package com.nt.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.nt.model.User;
import com.nt.repo.UserRepo;

@Service
public class UserService implements IUserService,UserDetailsService {
	
	@Autowired
	private UserRepo repo;
	
	@Autowired
	private BCryptPasswordEncoder encode;

	@Override
	public Integer saveUser(User user) {
		String pwd = user.getUserPassword();
		pwd =encode.encode(pwd);
		user.setUserPassword(pwd);
		return repo.save(user).getId();
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user =repo.findByUserEmail(username);
		
		List<String> roles =user.getRoles();
		
		Set<GrantedAuthority> authorities= new HashSet<>();
		
		roles.forEach(role -> authorities.add(new SimpleGrantedAuthority(role)));
		
		org.springframework.security.core.userdetails.User uob =
				new org.springframework.security.core.userdetails.User(
						username,user.getUserPassword(),authorities
						);
		
		return uob;
	}

}
