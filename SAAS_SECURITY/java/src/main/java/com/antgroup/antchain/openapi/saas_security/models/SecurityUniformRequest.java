// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas_security.models;

import com.aliyun.tea.*;

public class SecurityUniformRequest extends TeaModel {
    // 123
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("token")
    @Validation(required = true)
    public String token;

    // 123
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 132
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
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
