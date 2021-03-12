// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class PresignedUrlPolicy extends TeaModel {
    // oss访问的临时access id
    @NameInMap("access_id")
    @Validation(required = true)
    public String accessId;

    // 一个需要回调通知服务端的方法名，非必填
    @NameInMap("callback")
    public String callback;

    // oss上的文件存放路径
    @NameInMap("dir")
    @Validation(required = true)
    public String dir;

    // url超期的时间戳说明
    @NameInMap("expire")
    @Validation(required = true)
    public String expire;

    // oss的地址
    @NameInMap("host")
    @Validation(required = true)
    public String host;

    // 被base64编码的policy内容
    @NameInMap("policy")
    @Validation(required = true)
    public String policy;

    // 签名结果
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
