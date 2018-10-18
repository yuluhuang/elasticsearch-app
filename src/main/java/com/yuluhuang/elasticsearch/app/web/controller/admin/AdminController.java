/**
 * @Title
 * @Project elasticsearch-app
 * @Package com.yuluhuang.elasticsearch.app.web.controller.admin
 * @Description
 * @author ylh
 * @date 2018-10-18 18:05
 * @version
 */
package com.yuluhuang.elasticsearch.app.web.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * @author ylh
 * @Description
 * @date 2018-10-18 18:05
 */
@Controller
public class AdminController {

    @GetMapping("/admin/center")
    public String adminCenterPage() {
        return "admin/center";
    }

    @GetMapping("/admin/welcome")
    public String welcomePage() {
        return "admin/welcome";
    }

    @GetMapping("/admin/login")
    public String adninLoginPage() {
        return "admin/login";
    }
}
