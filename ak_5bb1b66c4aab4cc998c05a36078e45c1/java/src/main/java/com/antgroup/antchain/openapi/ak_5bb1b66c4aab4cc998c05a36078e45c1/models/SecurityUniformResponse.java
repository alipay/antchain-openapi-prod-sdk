// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_5bb1b66c4aab4cc998c05a36078e45c1.models;

import com.aliyun.tea.*;

public class SecurityUniformResponse extends TeaModel {
    // 是否成功
    @NameInMap("success")
    @Validation(required = true)
    public Boolean success;

    // 123
    @NameInMap("code")
    public String code;

    // 123
    @NameInMap("message")
    public String message;

    // 123
    @NameInMap("token")
    public String token;

    // 123
    @NameInMap("biz_id")
    public String bizId;

    // 123
    @NameInMap("data")
    public String data;

    public static SecurityUniformResponse build(java.util.Map<String, ?> map) throws Exception {
        SecurityUniformResponse self = new SecurityUniformResponse();
        return TeaModel.build(map, self);
    }

    public SecurityUniformResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SecurityUniformResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SecurityUniformResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SecurityUniformResponse setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public SecurityUniformResponse setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SecurityUniformResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
