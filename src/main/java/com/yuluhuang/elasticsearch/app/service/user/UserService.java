/**
 * @Title
 * @Project elasticsearch-app
 * @Package com.yuluhuang.elasticsearch.app.service
 * @Description
 * @author ylh
 * @date 2018-10-18 18:33
 * @version
 */
package com.yuluhuang.elasticsearch.app.service.user;

import com.yuluhuang.elasticsearch.app.entity.User;

/**
 *
 * @Description
 * @author ylh
 * @date 2018-10-18 18:33
 */
public interface UserService {
    User findUserByName(String userName);
}
