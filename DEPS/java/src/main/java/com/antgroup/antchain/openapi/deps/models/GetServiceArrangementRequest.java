// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetServiceArrangementRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // node_id
    @NameInMap("node_id")
    public String nodeId;

    // service_id
    @NameInMap("service_id")
    public String serviceId;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static GetServiceArrangementRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceArrangementRequest self = new GetServiceArrangementRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceArrangementRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetServiceArrangementRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetServiceArrangementRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public GetServiceArrangementRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
