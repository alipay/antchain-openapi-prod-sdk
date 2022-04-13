// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryLoadbalancerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 负载均衡类型。
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 工作空间组名称。
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 所属namespace名称。
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    public static QueryLoadbalancerRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLoadbalancerRequest self = new QueryLoadbalancerRequest();
        return TeaModel.build(map, self);
    }

    public QueryLoadbalancerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryLoadbalancerRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public QueryLoadbalancerRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public QueryLoadbalancerRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
