// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class PresignedUrlPolicy extends TeaModel {
    // oss访问的临时access id
    /**
     * <strong>example:</strong>
     * <p>LTAIR4HVnajwxdUK</p>
     */
    @NameInMap("access_id")
    @Validation(required = true)
    public String accessId;

    // 一个需要回调通知服务端的方法名，非必填
    /**
     * <strong>example:</strong>
     * <p>callBackFunction</p>
     */
    @NameInMap("callback")
    public String callback;

    // oss上的文件存放路径
    /**
     * <strong>example:</strong>
     * <p>contract/abi/lP9v5bJsvY1566977941329</p>
     */
    @NameInMap("dir")
    @Validation(required = true)
    public String dir;

    // url超期的时间戳说明
    /**
     * <strong>example:</strong>
     * <p>1566977971</p>
     */
    @NameInMap("expire")
    @Validation(required = true)
    public String expire;

    // oss的地址
    /**
     * <strong>example:</strong>
     * <p><a href="https://baas-XXX.oss-cn-shanghai.aliyuncs.com">https://baas-XXX.oss-cn-shanghai.aliyuncs.com</a></p>
     */
    @NameInMap("host")
    @Validation(required = true)
    public String host;

    // 被base64编码的policy内容
    /**
     * <strong>example:</strong>
     * <p>eyJleHBpcmF0aW9uIjoiMjAxOS0wOC0yOFQwNzozOTozMS4zMjlaIiwiY29uZGl0aW9ucyI6W1siY29udGVudC1sZW5ndGgtcmFuZ2UiLDAsMTA0ODU3NjBdLFsic3RhcnRzLXdpdGgiLCIka2V5IiwiY29udHJhY3QvYWJpL2xQOXY1YkpzdlkxNTY2OTc3OTQxMzI5Il1dfQ==</p>
     */
    @NameInMap("policy")
    @Validation(required = true)
    public String policy;

    // 签名结果
    /**
     * <strong>example:</strong>
     * <p>sQEa/Q8F/e5jqDWPvTVYtZ5Ysbw=</p>
     */
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    public static PresignedUrlPolicy build(java.util.Map<String, ?> map) throws Exception {
        PresignedUrlPolicy self = new PresignedUrlPolicy();
        return TeaModel.build(map, self);
    }

    public PresignedUrlPolicy setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public PresignedUrlPolicy setCallback(String callback) {
        this.callback = callback;
        return this;
    }
    public String getCallback() {
        return this.callback;
    }

    public PresignedUrlPolicy setDir(String dir) {
        this.dir = dir;
        return this;
    }
    public String getDir() {
        return this.dir;
    }

    public PresignedUrlPolicy setExpire(String expire) {
        this.expire = expire;
        return this;
    }
    public String getExpire() {
        return this.expire;
    }

    public PresignedUrlPolicy setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public PresignedUrlPolicy setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public PresignedUrlPolicy setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
