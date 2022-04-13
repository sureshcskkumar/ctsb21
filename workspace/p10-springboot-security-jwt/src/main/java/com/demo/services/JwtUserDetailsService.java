package com.demo.services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    // entity -> user
    // repo.findById

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if ("admin".equals(username)) {

            Set<SimpleGrantedAuthority> authorities = new HashSet<>();
            authorities.add(new SimpleGrantedAuthority("ROLE_" + "ADMIN"));

			// return new User("admin", "{noop}hello@world",new ArrayList<>());
			// return new User("admin", "{bcrypt}$2a$10$Dwzu0xQK7eHkBMA67KjPpelsTuvajmYArw5ruHxWvSgboxmAjp9mu", new ArrayList<>());
			return new User("admin", "$2a$10$Dwzu0xQK7eHkBMA67KjPpelsTuvajmYArw5ruHxWvSgboxmAjp9mu", authorities);
		} else if ("user".equals(username)) {

            Set<SimpleGrantedAuthority> authorities = new HashSet<>();
            authorities.add(new SimpleGrantedAuthority("ROLE_" + "USER"));

			return new User("user", "$2a$10$Dwzu0xQK7eHkBMA67KjPpelsTuvajmYArw5ruHxWvSgboxmAjp9mu", authorities);
		}
        
        else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}
}