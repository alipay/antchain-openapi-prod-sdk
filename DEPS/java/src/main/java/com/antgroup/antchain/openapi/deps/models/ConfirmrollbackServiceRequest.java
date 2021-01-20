// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ConfirmrollbackServiceRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // id
    @NameInMap("id")
    public String id;

    // retry_rollbacked
    @NameInMap("retry_rollbacked")
    public Boolean retryRollbacked;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static ConfirmrollbackServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmrollbackServiceRequest self = new ConfirmrollbackServiceRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmrollbackServiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConfirmrollbackServiceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ConfirmrollbackServiceRequest setRetryRollbacked(Boolean retryRollbacked) {
        this.retryRollbacked = retryRollbacked;
        return this;
    }
    public Boolean getRetryRollbacked() {
        return this.retryRollbacked;
    }

    public ConfirmrollbackServiceRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
