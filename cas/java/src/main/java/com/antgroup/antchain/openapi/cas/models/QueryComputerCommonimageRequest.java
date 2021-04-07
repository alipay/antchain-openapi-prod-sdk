// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryComputerCommonimageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // providerIds
    @NameInMap("provider_ids")
    @Validation(required = true)
    public java.util.List<String> providerIds;

    // regionIds
    @NameInMap("region_ids")
    @Validation(required = true)
    public java.util.List<String> regionIds;

    public static QueryComputerCommonimageRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryComputerCommonimageRequest self = new QueryComputerCommonimageRequest();
        return TeaModel.build(map, self);
    }

    public QueryComputerCommonimageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryComputerCommonimageRequest setProviderIds(java.util.List<String> providerIds) {
        this.providerIds = providerIds;
        return this;
    }
    public java.util.List<String> getProviderIds() {
        return this.providerIds;
    }

    public QueryComputerCommonimageRequest setRegionIds(java.util.List<String> regionIds) {
        this.regionIds = regionIds;
        return this;
    }
    public java.util.List<String> getRegionIds() {
        return this.regionIds;
    }

}
