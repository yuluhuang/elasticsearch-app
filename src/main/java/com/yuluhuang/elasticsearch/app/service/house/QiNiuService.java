/**
 * @Title
 * @Project elasticsearch-app
 * @Package com.yuluhuang.elasticsearch.app.service.house
 * @Description
 * @author ylh
 * @date 2018-10-19 14:48
 * @version
 */
package com.yuluhuang.elasticsearch.app.service.house;

import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;
import java.io.InputStream;

/**
 * 七牛云服务
 *
 * @author ylh
 * @Description
 * @date 2018-10-19 14:48
 */
public interface QiNiuService {
    Response uploadFile(File file) throws QiniuException;

    Response uploadFile(InputStream inputStream) throws QiniuException;

    Response delete(String key) throws QiniuException;

}
