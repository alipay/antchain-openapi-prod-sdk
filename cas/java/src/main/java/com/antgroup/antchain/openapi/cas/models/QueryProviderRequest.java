// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryProviderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // LB，COMPUTE，VPC,OBJECT_STORAGE等
    @NameInMap("resource_type")
    @Validation(required = true)
    public String resourceType;

    // paas_region_id
    @NameInMap("paas_region_id")
    @Validation(required = true)
    public String paasRegionId;

    public static QueryProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryProviderRequest self = new QueryProviderRequest();
        return TeaModel.build(map, self);
    }

    public QueryProviderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryProviderRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public QueryProviderRequest setPaasRegionId(String paasRegionId) {
        this.paasRegionId = paasRegionId;
        return this;
    }
    public String getPaasRegionId() {
        return this.paasRegionId;
    }

}
