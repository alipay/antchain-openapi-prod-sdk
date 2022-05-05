// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRbbCompanyGuardRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 查询token
    @NameInMap("token")
    @Validation(required = true)
    public String token;

    public static QueryRbbCompanyGuardRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRbbCompanyGuardRequest self = new QueryRbbCompanyGuardRequest();
        return TeaModel.build(map, self);
    }

    public QueryRbbCompanyGuardRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRbbCompanyGuardRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRbbCompanyGuardRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
