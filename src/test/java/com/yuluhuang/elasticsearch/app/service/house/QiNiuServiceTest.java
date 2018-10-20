/**
 * @Title
 * @Project elasticsearch-app
 * @Package com.yuluhuang.elasticsearch.app.service.house
 * @Description
 * @author ylh
 * @date 2018-10-19 15:05
 * @version
 */
package com.yuluhuang.elasticsearch.app.service.house;

import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.yuluhuang.elasticsearch.app.AppApplicationTests;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;

/**
 * @author ylh
 * @Description
 * @date 2018-10-19 15:05
 */
public class QiNiuServiceTest extends AppApplicationTests {

    @Autowired
    private QiNiuService qiNiuService;

    @Test
    public void testUploadFile() {
        String fileName = "/Users/ylh/Desktop/bg2018091413.jpg";
        File file = new File(fileName);
        Assert.assertTrue(file.exists());
        try {

            Response response = qiNiuService.uploadFile(file);
            Assert.assertTrue(response.isOK());
        } catch (QiniuException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void textDelate() {
        String key = "FnVNEjBGKYy0GsdBfvUL-ysaP89V";
        try {
            Response response = qiNiuService.delete(key);
            Assert.assertTrue(response.isOK());
        } catch (QiniuException e) {
            e.printStackTrace();
        }
    }
}
