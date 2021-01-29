// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryAppserviceenvparamQuerywithdiffRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // appServiceId
    @NameInMap("app_service_id")
    public String appServiceId;

    // buildpackId
    @NameInMap("buildpack_id")
    public String buildpackId;

    public static QueryAppserviceenvparamQuerywithdiffRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAppserviceenvparamQuerywithdiffRequest self = new QueryAppserviceenvparamQuerywithdiffRequest();
        return TeaModel.build(map, self);
    }

    public QueryAppserviceenvparamQuerywithdiffRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAppserviceenvparamQuerywithdiffRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public QueryAppserviceenvparamQuerywithdiffRequest setAppServiceId(String appServiceId) {
        this.appServiceId = appServiceId;
        return this;
    }
    public String getAppServiceId() {
        return this.appServiceId;
    }

    public QueryAppserviceenvparamQuerywithdiffRequest setBuildpackId(String buildpackId) {
        this.buildpackId = buildpackId;
        return this;
    }
    public String getBuildpackId() {
        return this.buildpackId;
    }

}
