// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CancelServiceRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // id
    @NameInMap("id")
    public String id;

    // reason
    @NameInMap("reason")
    public String reason;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static CancelServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelServiceRequest self = new CancelServiceRequest();
        return TeaModel.build(map, self);
    }

    public CancelServiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelServiceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CancelServiceRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public CancelServiceRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
