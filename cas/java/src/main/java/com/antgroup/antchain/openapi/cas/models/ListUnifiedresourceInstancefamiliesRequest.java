// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListUnifiedresourceInstancefamiliesRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // region id
    @NameInMap("region_id")
    @Validation(required = true)
    public String regionId;

    // 提供商类型
    @NameInMap("provider_type")
    @Validation(required = true)
    public String providerType;

    public static ListUnifiedresourceInstancefamiliesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUnifiedresourceInstancefamiliesRequest self = new ListUnifiedresourceInstancefamiliesRequest();
        return TeaModel.build(map, self);
    }

    public ListUnifiedresourceInstancefamiliesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListUnifiedresourceInstancefamiliesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListUnifiedresourceInstancefamiliesRequest setProviderType(String providerType) {
        this.providerType = providerType;
        return this;
    }
    public String getProviderType() {
        return this.providerType;
    }

}
