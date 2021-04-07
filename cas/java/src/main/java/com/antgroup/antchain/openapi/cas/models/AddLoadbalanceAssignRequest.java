// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AddLoadbalanceAssignRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // app_id
    @NameInMap("app_id")
    public String appId;

    // appServiceId
    @NameInMap("app_service_id")
    public String appServiceId;

    // ids
    @NameInMap("ids")
    @Validation(required = true)
    public java.util.List<String> ids;

    public static AddLoadbalanceAssignRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLoadbalanceAssignRequest self = new AddLoadbalanceAssignRequest();
        return TeaModel.build(map, self);
    }

    public AddLoadbalanceAssignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddLoadbalanceAssignRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AddLoadbalanceAssignRequest setAppServiceId(String appServiceId) {
        this.appServiceId = appServiceId;
        return this;
    }
    public String getAppServiceId() {
        return this.appServiceId;
    }

    public AddLoadbalanceAssignRequest setIds(java.util.List<String> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<String> getIds() {
        return this.ids;
    }

}
