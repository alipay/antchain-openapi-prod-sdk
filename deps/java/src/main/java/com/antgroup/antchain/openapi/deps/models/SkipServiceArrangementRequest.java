// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class SkipServiceArrangementRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // arrangement_id
    @NameInMap("arrangement_id")
    @Validation(required = true)
    public String arrangementId;

    // service_id
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static SkipServiceArrangementRequest build(java.util.Map<String, ?> map) throws Exception {
        SkipServiceArrangementRequest self = new SkipServiceArrangementRequest();
        return TeaModel.build(map, self);
    }

    public SkipServiceArrangementRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SkipServiceArrangementRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public SkipServiceArrangementRequest setArrangementId(String arrangementId) {
        this.arrangementId = arrangementId;
        return this;
    }
    public String getArrangementId() {
        return this.arrangementId;
    }

    public SkipServiceArrangementRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public SkipServiceArrangementRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
