// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DeleteCertificateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // workspace_id
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    // zone_id
    @NameInMap("zone_id")
    @Validation(required = true)
    public String zoneId;

    // 多provider时选填
    @NameInMap("provider_id")
    public String providerId;

    public static DeleteCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCertificateRequest self = new DeleteCertificateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCertificateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteCertificateRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteCertificateRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public DeleteCertificateRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public DeleteCertificateRequest setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

}
