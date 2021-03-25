// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class AliyunAuthenticateBatchEvent extends TeaModel {
    // 金融云用户ID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 阿里云鉴权列表
    @NameInMap("ram_auth_contexts")
    @Validation(required = true)
    public java.util.List<AliyunRamAuthContext> ramAuthContexts;

    // BSB透传下来的阿里云信息
    @NameInMap("request_info")
    @Validation(required = true)
    public AliyunPopRequestInfo requestInfo;

    public static AliyunAuthenticateBatchEvent build(java.util.Map<String, ?> map) throws Exception {
        AliyunAuthenticateBatchEvent self = new AliyunAuthenticateBatchEvent();
        return TeaModel.build(map, self);
    }

    public AliyunAuthenticateBatchEvent setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public AliyunAuthenticateBatchEvent setRamAuthContexts(java.util.List<AliyunRamAuthContext> ramAuthContexts) {
        this.ramAuthContexts = ramAuthContexts;
        return this;
    }
    public java.util.List<AliyunRamAuthContext> getRamAuthContexts() {
        return this.ramAuthContexts;
    }

    public AliyunAuthenticateBatchEvent setRequestInfo(AliyunPopRequestInfo requestInfo) {
        this.requestInfo = requestInfo;
        return this;
    }
    public AliyunPopRequestInfo getRequestInfo() {
        return this.requestInfo;
    }

}
