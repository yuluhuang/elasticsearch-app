/**
 * @Title
 * @Project elasticsearch-app
 * @Package com.yuluhuang.elasticsearch.app.web.dto
 * @Description
 * @author ylh
 * @date 2018-10-19 17:26
 * @version
 */
package com.yuluhuang.elasticsearch.app.web.dto;

/**
 * @author ylh
 * @Description
 * @date 2018-10-19 17:26
 */
public final class QiNiuPutRet {
    public String key;
    public String hash;
    public String bucket;
    public int width;
    public int height;

    @Override
    public String toString() {
        return "QiNiuPutRet{" +
                "key='" + key + '\'' +
                ", hash='" + hash + '\'' +
                ", bucket='" + bucket + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
