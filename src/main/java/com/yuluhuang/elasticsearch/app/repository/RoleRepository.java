/**
 * @Title
 * @Project elasticsearch-app
 * @Package com.yuluhuang.elasticsearch.app.repository
 * @Description
 * @author ylh
 * @date 2018-10-18 20:18
 * @version
 */
package com.yuluhuang.elasticsearch.app.repository;

import com.yuluhuang.elasticsearch.app.entity.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author ylh
 * @Description
 * @date 2018-10-18 20:18
 */
public interface RoleRepository extends CrudRepository<Role, Long> {
    List<Role> findRolesByUserId(Long id);
}
