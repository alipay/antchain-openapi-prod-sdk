// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryDigitalkeyUserinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 联合登录token
    @NameInMap("token")
    @Validation(required = true)
    public String token;

    public static QueryDigitalkeyUserinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDigitalkeyUserinfoRequest self = new QueryDigitalkeyUserinfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryDigitalkeyUserinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDigitalkeyUserinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDigitalkeyUserinfoRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
