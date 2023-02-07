// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryQuotaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    //  维度标识, 可选
    @NameInMap("dim_identity")
    public String dimIdentity;

    // resource_identity
    @NameInMap("resource_identity")
    public String resourceIdentity;

    public static QueryQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryQuotaRequest self = new QueryQuotaRequest();
        return TeaModel.build(map, self);
    }

    public QueryQuotaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryQuotaRequest setDimIdentity(String dimIdentity) {
        this.dimIdentity = dimIdentity;
        return this;
    }
    public String getDimIdentity() {
        return this.dimIdentity;
    }

    public QueryQuotaRequest setResourceIdentity(String resourceIdentity) {
        this.resourceIdentity = resourceIdentity;
        return this;
    }
    public String getResourceIdentity() {
        return this.resourceIdentity;
    }

}
