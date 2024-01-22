// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class FileTokenForUpload extends TeaModel {
    // .
    @NameInMap("access_id")
    @Validation(required = true)
    public String accessId;

    // dir
    @NameInMap("dir")
    @Validation(required = true)
    public String dir;

    // expire
    @NameInMap("expire")
    @Validation(required = true)
    public String expire;

    // host
    @NameInMap("host")
    @Validation(required = true)
    public String host;

    // policy
    @NameInMap("policy")
    @Validation(required = true)
    public String policy;

    // signature
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    public static FileTokenForUpload build(java.util.Map<String, ?> map) throws Exception {
        FileTokenForUpload self = new FileTokenForUpload();
        return TeaModel.build(map, self);
    }

    public FileTokenForUpload setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public FileTokenForUpload setDir(String dir) {
        this.dir = dir;
        return this;
    }
    public String getDir() {
        return this.dir;
    }

    public FileTokenForUpload setExpire(String expire) {
        this.expire = expire;
        return this;
    }
    public String getExpire() {
        return this.expire;
    }

    public FileTokenForUpload setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public FileTokenForUpload setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public FileTokenForUpload setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
