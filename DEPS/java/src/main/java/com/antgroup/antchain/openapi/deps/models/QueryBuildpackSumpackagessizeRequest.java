// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryBuildpackSumpackagessizeRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // regionIds
    @NameInMap("region_ids")
    public java.util.List<String> regionIds;

    public static QueryBuildpackSumpackagessizeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBuildpackSumpackagessizeRequest self = new QueryBuildpackSumpackagessizeRequest();
        return TeaModel.build(map, self);
    }

    public QueryBuildpackSumpackagessizeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBuildpackSumpackagessizeRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public QueryBuildpackSumpackagessizeRequest setRegionIds(java.util.List<String> regionIds) {
        this.regionIds = regionIds;
        return this;
    }
    public java.util.List<String> getRegionIds() {
        return this.regionIds;
    }

}
