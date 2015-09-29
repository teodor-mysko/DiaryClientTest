package com.softserve.tc.diaryclient.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("CustomUserDetailsService") 
public class CustomUserDetailsService implements UserDetailsService {
    
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
            
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        if (username.equals("admin")) {

            authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
            authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
            return new User("admin", "21232f297a57a5a743894a0e4a801fc3", authorities);

        } else if (username.equals("user")) {

            authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
            return new User("user", "ee11cbb19052e40b07aac0ca060c23ee", authorities);
        } else {
            throw new UsernameNotFoundException("User not found: " + username);
        }
    }
}
