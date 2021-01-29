// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryBuildpackFindavailablebyappserviceidsRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // appServiceIds
    @NameInMap("app_service_ids")
    public java.util.List<String> appServiceIds;

    public static QueryBuildpackFindavailablebyappserviceidsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBuildpackFindavailablebyappserviceidsRequest self = new QueryBuildpackFindavailablebyappserviceidsRequest();
        return TeaModel.build(map, self);
    }

    public QueryBuildpackFindavailablebyappserviceidsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBuildpackFindavailablebyappserviceidsRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public QueryBuildpackFindavailablebyappserviceidsRequest setAppServiceIds(java.util.List<String> appServiceIds) {
        this.appServiceIds = appServiceIds;
        return this;
    }
    public java.util.List<String> getAppServiceIds() {
        return this.appServiceIds;
    }

}
