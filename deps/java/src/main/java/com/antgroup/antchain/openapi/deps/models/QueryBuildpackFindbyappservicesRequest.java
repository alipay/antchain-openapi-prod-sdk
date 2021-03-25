// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryBuildpackFindbyappservicesRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // appServiceIds
    @NameInMap("app_service_ids")
    public java.util.List<String> appServiceIds;

    public static QueryBuildpackFindbyappservicesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBuildpackFindbyappservicesRequest self = new QueryBuildpackFindbyappservicesRequest();
        return TeaModel.build(map, self);
    }

    public QueryBuildpackFindbyappservicesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBuildpackFindbyappservicesRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public QueryBuildpackFindbyappservicesRequest setAppServiceIds(java.util.List<String> appServiceIds) {
        this.appServiceIds = appServiceIds;
        return this;
    }
    public java.util.List<String> getAppServiceIds() {
        return this.appServiceIds;
    }

}
