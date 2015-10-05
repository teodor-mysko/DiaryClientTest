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

import com.softserve.tc.diaryclient.dao.impl.UserDAOImpl;

@Service("CustomUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService {

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        com.softserve.tc.diaryclient.entity.User user = UserDAOImpl.findByUserName(username);
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        System.out.println(user.getRole());
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        if (user.getRole().equals("ADMIN")) {
            authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        }
        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
        return new User(user.getUsername().trim(), user.getPassword().trim(), true, true, true, true, authorities);
    }
}
