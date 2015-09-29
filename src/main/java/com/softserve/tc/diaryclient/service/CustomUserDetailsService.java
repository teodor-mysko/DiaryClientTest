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
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        if (user.getUsername().equals("admin")) {
            authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        }
        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
        return new User(user.getUsername(), user.getPassword(), true, true, true, true, authorities);
    }

    // buildUserForAuthentication(com.softserve.tc.diaryclient.entity.User user,
    // List<GrantedAuthority> authorities) {
    // return new User(user.getUsername(), user.getPassword(), true, true, true,
    // true, authorities);
    // }
    //
    // private List<GrantedAuthority> buildUserAuthority() {
    //
    // Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();
    //
    // setAuths.add(new SimpleGrantedAuthority("ROLE_USER"));
    // setAuths.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
    //
    // List<GrantedAuthority> Result = new
    // ArrayList<GrantedAuthority>(setAuths);
    //
    // return Result;
    // }
    //
    // public UserDAO getUserDAO() {
    // return userDAO;
    // }
    //
    // public void setUserDAO(UserDAO userDAO) {
    // this.userDAO = userDAO;
    // }
}
