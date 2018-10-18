/**
 * @Title
 * @Project elasticsearch-app
 * @Package com.yuluhuang.elasticsearch.app.entity
 * @Description
 * @author ylh
 * @date 2018-10-18 20:15
 * @version
 */
package com.yuluhuang.elasticsearch.app.entity;

import javax.persistence.*;
import java.util.Date;

/**
 *
 * @Description
 * @author ylh
 * @date 2018-10-18 20:15
 */
@Entity
@Table(name="role")
public class Role {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
