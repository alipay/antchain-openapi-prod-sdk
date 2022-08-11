// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_5bb1b66c4aab4cc998c05a36078e45c1.models;

import com.aliyun.tea.*;

public class SecurityUniformRequest extends TeaModel {
    // 123
    @NameInMap("token")
    @Validation(required = true)
    public String token;

    // 123
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 132
    @NameInMap("params")
    @Validation(required = true)
    public String params;

    public static SecurityUniformRequest build(java.util.Map<String, ?> map) throws Exception {
        SecurityUniformRequest self = new SecurityUniformRequest();
        return TeaModel.build(map, self);
    }

    public SecurityUniformRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public SecurityUniformRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SecurityUniformRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
