// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class QueryApiOwnerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 网关产品码
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // api方法信息
    @NameInMap("api")
    @Validation(required = true)
    public String api;

    public static QueryApiOwnerRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApiOwnerRequest self = new QueryApiOwnerRequest();
        return TeaModel.build(map, self);
    }

    public QueryApiOwnerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryApiOwnerRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public QueryApiOwnerRequest setApi(String api) {
        this.api = api;
        return this;
    }
    public String getApi() {
        return this.api;
    }

}
