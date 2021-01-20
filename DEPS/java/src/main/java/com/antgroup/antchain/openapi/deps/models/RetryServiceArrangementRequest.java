// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class RetryServiceArrangementRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // arrangement_id
    @NameInMap("arrangement_id")
    public String arrangementId;

    // service_id
    @NameInMap("service_id")
    public String serviceId;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static RetryServiceArrangementRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryServiceArrangementRequest self = new RetryServiceArrangementRequest();
        return TeaModel.build(map, self);
    }

    public RetryServiceArrangementRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RetryServiceArrangementRequest setArrangementId(String arrangementId) {
        this.arrangementId = arrangementId;
        return this;
    }
    public String getArrangementId() {
        return this.arrangementId;
    }

    public RetryServiceArrangementRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public RetryServiceArrangementRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
