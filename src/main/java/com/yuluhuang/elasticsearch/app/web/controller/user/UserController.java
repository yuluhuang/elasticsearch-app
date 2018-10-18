/**
 * @Title
 * @Project elasticsearch-app
 * @Package com.yuluhuang.elasticsearch.app.web.controller.user
 * @Description
 * @author ylh
 * @date 2018-10-18 20:35
 * @version
 */
package com.yuluhuang.elasticsearch.app.web.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ylh
 * @Description
 * @date 2018-10-18 20:35
 */
@Controller
public class UserController {
    @GetMapping("/user/login")
    public String loginPage() {
        return "user/login";
    }

    @GetMapping("/user/center")
    public String centerPage() {
        return "user/center";
    }
}
