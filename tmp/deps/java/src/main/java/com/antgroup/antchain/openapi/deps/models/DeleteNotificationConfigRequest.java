// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class DeleteNotificationConfigRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static DeleteNotificationConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNotificationConfigRequest self = new DeleteNotificationConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNotificationConfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteNotificationConfigRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public DeleteNotificationConfigRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteNotificationConfigRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
