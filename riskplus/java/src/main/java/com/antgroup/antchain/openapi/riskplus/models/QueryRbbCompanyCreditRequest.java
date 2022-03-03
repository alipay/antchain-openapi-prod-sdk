// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRbbCompanyCreditRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 查询token，从apply接口获得
    @NameInMap("token")
    @Validation(required = true)
    public String token;

    public static QueryRbbCompanyCreditRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRbbCompanyCreditRequest self = new QueryRbbCompanyCreditRequest();
        return TeaModel.build(map, self);
    }

    public QueryRbbCompanyCreditRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRbbCompanyCreditRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRbbCompanyCreditRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
