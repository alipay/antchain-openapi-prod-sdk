// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class SetDatabaseAssignRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // app_service_ids
    @NameInMap("app_service_ids")
    public java.util.List<String> appServiceIds;

    // app_ids
    @NameInMap("app_ids")
    public java.util.List<String> appIds;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    // ids
    @NameInMap("ids")
    public java.util.List<String> ids;

    public static SetDatabaseAssignRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDatabaseAssignRequest self = new SetDatabaseAssignRequest();
        return TeaModel.build(map, self);
    }

    public SetDatabaseAssignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetDatabaseAssignRequest setAppServiceIds(java.util.List<String> appServiceIds) {
        this.appServiceIds = appServiceIds;
        return this;
    }
    public java.util.List<String> getAppServiceIds() {
        return this.appServiceIds;
    }

    public SetDatabaseAssignRequest setAppIds(java.util.List<String> appIds) {
        this.appIds = appIds;
        return this;
    }
    public java.util.List<String> getAppIds() {
        return this.appIds;
    }

    public SetDatabaseAssignRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public SetDatabaseAssignRequest setIds(java.util.List<String> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<String> getIds() {
        return this.ids;
    }

}
