// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_122342269ba34053ab6e5304d82e7358.models;

import com.aliyun.tea.*;

public class QueryBaasOdatsDomaincertRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链域名
    @NameInMap("domain")
    @Validation(required = true)
    public String domain;

    public static QueryBaasOdatsDomaincertRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBaasOdatsDomaincertRequest self = new QueryBaasOdatsDomaincertRequest();
        return TeaModel.build(map, self);
    }

    public QueryBaasOdatsDomaincertRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBaasOdatsDomaincertRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBaasOdatsDomaincertRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

}
