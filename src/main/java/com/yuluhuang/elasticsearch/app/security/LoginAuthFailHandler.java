/**
 * @Title
 * @Project elasticsearch-app
 * @Package com.yuluhuang.elasticsearch.app.security
 * @Description
 * @author ylh
 * @date 2018-10-18 20:53
 * @version
 */
package com.yuluhuang.elasticsearch.app.security;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 登录验证失败处理验证器
 * @author ylh
 * @Description
 * @date 2018-10-18 20:53
 */
public class LoginAuthFailHandler extends SimpleUrlAuthenticationFailureHandler {
    private final LoginUrlEntryPoint urlEntryPoint;

    public LoginAuthFailHandler(LoginUrlEntryPoint urlEntryPoint) {
        this.urlEntryPoint = urlEntryPoint;
    }

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        String targerUrl = this.urlEntryPoint.determineUrlToUseForThisRequest(request, response, exception);
        targerUrl += "?" + exception.getMessage();
        super.setDefaultFailureUrl(targerUrl);
        super.onAuthenticationFailure(request, response, exception);

    }
}
