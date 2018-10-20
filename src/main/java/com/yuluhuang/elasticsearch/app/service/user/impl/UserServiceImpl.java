/**
 * @Title
 * @Project elasticsearch-app
 * @Package com.yuluhuang.elasticsearch.app.service.user.impl
 * @Description
 * @author ylh
 * @date 2018-10-18 18:36
 * @version
 */
package com.yuluhuang.elasticsearch.app.service.user.impl;

import com.yuluhuang.elasticsearch.app.entity.Role;
import com.yuluhuang.elasticsearch.app.entity.User;
import com.yuluhuang.elasticsearch.app.repository.RoleRepository;
import com.yuluhuang.elasticsearch.app.repository.UserRepository;
import com.yuluhuang.elasticsearch.app.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ylh
 * @Description
 * @date 2018-10-18 18:36
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;
    @Override
    public User findUserByName(String userName) {
        User user =  userRepository.findByName(userName);
        if (user == null) {
            return null;
        }
        List<Role> roles = roleRepository.findRolesByUserId(user.getId());
        if (roles == null || roles.isEmpty()) {
            throw new DisabledException("权限非法");
        }

        final List<GrantedAuthority> authorities = new ArrayList<>();
        roles.forEach(role -> authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getName())));
        user.setAuthorityList(authorities);
        return  user;



















    }
}
