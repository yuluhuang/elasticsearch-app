/**
 * @Title
 * @Project elasticsearch-app
 * @Package com.yuluhuang.elasticsearch.app.repository
 * @Description
 * @author ylh
 * @date 2018-10-17 20:22
 * @version
 */
package com.yuluhuang.elasticsearch.app.repository;

import com.yuluhuang.elasticsearch.app.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @Description
 * @author ylh
 * @date 2018-10-17 20:22
 */
public interface UserRepository extends CrudRepository<User, Long> {
    User findByName(String userName);


}
