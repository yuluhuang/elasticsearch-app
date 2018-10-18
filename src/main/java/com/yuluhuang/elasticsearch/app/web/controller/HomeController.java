/**
 * @Title
 * @Project elasticsearch-app
 * @Package com.yuluhuang.elasticsearch.app.web.controller
 * @Description
 * @author ylh
 * @date 2018-10-17 20:42
 * @version
 */
package com.yuluhuang.elasticsearch.app.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @Description
 * @author ylh
 * @date 2018-10-17 20:42
 */
@Controller
public class HomeController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("name", "111");
        return "index";
    }

    @GetMapping("/404")
    @ResponseBody
    public String notFoundPage() {
        return "404";
    }

    @GetMapping("/403")
    @ResponseBody
    public String accessError() {
        return "403";
    }

    @GetMapping("/500")
    @ResponseBody
    public String internalError() {
        return "500";
    }

    @GetMapping("/logout/page")
    @ResponseBody
    public String logoutPage() {
        return "logout";
    }
}
