// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryVpcVroutertableRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // vpc id
    @NameInMap("vpc_id")
    @Validation(required = true)
    public String vpcId;

    // 路由器id
    @NameInMap("v_router_id")
    @Validation(required = true)
    public String vRouterId;

    // workspace name
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static QueryVpcVroutertableRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryVpcVroutertableRequest self = new QueryVpcVroutertableRequest();
        return TeaModel.build(map, self);
    }

    public QueryVpcVroutertableRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryVpcVroutertableRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public QueryVpcVroutertableRequest setVRouterId(String vRouterId) {
        this.vRouterId = vRouterId;
        return this;
    }
    public String getVRouterId() {
        return this.vRouterId;
    }

    public QueryVpcVroutertableRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
