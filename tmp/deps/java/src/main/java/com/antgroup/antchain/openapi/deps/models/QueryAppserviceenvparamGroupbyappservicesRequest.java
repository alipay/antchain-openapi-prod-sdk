// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryAppserviceenvparamGroupbyappservicesRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // appServiceIds
    @NameInMap("app_service_ids")
    public java.util.List<String> appServiceIds;

    public static QueryAppserviceenvparamGroupbyappservicesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAppserviceenvparamGroupbyappservicesRequest self = new QueryAppserviceenvparamGroupbyappservicesRequest();
        return TeaModel.build(map, self);
    }

    public QueryAppserviceenvparamGroupbyappservicesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAppserviceenvparamGroupbyappservicesRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public QueryAppserviceenvparamGroupbyappservicesRequest setAppServiceIds(java.util.List<String> appServiceIds) {
        this.appServiceIds = appServiceIds;
        return this;
    }
    public java.util.List<String> getAppServiceIds() {
        return this.appServiceIds;
    }

}
