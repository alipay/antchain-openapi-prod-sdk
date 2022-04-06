// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListDnsProviderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // regionId
    @NameInMap("region_id")
    @Validation(required = true)
    public String regionId;

    // zone_id
    @NameInMap("zone_id")
    public String zoneId;

    public static ListDnsProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDnsProviderRequest self = new ListDnsProviderRequest();
        return TeaModel.build(map, self);
    }

    public ListDnsProviderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListDnsProviderRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDnsProviderRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
