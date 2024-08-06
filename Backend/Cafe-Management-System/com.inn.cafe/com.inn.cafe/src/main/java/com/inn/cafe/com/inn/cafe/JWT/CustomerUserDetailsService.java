package com.inn.cafe.com.inn.cafe.JWT;

import com.inn.cafe.com.inn.cafe.dao.UserDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.Objects;

@Slf4j
public class CustomerUserDetailsService implements UserDetailsService {

    @Autowired
    UserDao userDao;

    private com.inn.cafe.com.inn.cafe.POJO.User userDetails;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        log.info("Inside loadUserByUsername {}",email);
        userDetails = userDao.findByEmailId(email);
        if(!Objects.isNull(userDetails))
            return new
            org.springframework.security.core.userdetails.User(userDetails.getEmail(),userDetails.getPassword(),new ArrayList<>());
        else
            throw new UsernameNotFoundException("User not found");
    }

    public com.inn.cafe.com.inn.cafe.POJO.User getUserDetail(){
        return userDetails;
    }
}
