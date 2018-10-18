/**
 * @Title
 * @Project elasticsearch-app
 * @Package com.yuluhuang.elasticsearch.app.security
 * @Description
 * @author ylh
 * @date 2018-10-18 18:31
 * @version
 */
package com.yuluhuang.elasticsearch.app.security;

import com.yuluhuang.elasticsearch.app.entity.User;
import com.yuluhuang.elasticsearch.app.service.user.UserService;
import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.MessageDigestPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author ylh
 * @Description 自定义认证
 * @date 2018-10-18 18:31
 */
public class AuthProvider implements AuthenticationProvider {

    @Autowired
    private UserService userService;


    private final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String userName = authentication.getName();
        String inputPassword = (String) authentication.getCredentials();
        User user = userService.findUserByName(userName);
        if (user == null) {
            throw new AuthenticationCredentialsNotFoundException("authError");
        }

        String encoded = passwordEncoder.encode(inputPassword);
        if (user.getPassword().equals(encoded)) {
            return new UsernamePasswordAuthenticationToken();
        }
        throw new BadCredentialsException("authError");
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }
}
