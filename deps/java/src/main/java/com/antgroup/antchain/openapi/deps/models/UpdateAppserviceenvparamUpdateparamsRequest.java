// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class UpdateAppserviceenvparamUpdateparamsRequest extends TeaModel {
    // OAuth模式下的授权token
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

    // params
    @NameInMap("params")
    public java.util.List<AppServiceEnvParam> params;

    public static UpdateAppserviceenvparamUpdateparamsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppserviceenvparamUpdateparamsRequest self = new UpdateAppserviceenvparamUpdateparamsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppserviceenvparamUpdateparamsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateAppserviceenvparamUpdateparamsRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public UpdateAppserviceenvparamUpdateparamsRequest setAppServiceId(String appServiceId) {
        this.appServiceId = appServiceId;
        return this;
    }
    public String getAppServiceId() {
        return this.appServiceId;
    }

    public UpdateAppserviceenvparamUpdateparamsRequest setBuildpackId(String buildpackId) {
        this.buildpackId = buildpackId;
        return this;
    }
    public String getBuildpackId() {
        return this.buildpackId;
    }

    public UpdateAppserviceenvparamUpdateparamsRequest setParams(java.util.List<AppServiceEnvParam> params) {
        this.params = params;
        return this;
    }
    public java.util.List<AppServiceEnvParam> getParams() {
        return this.params;
    }

}
