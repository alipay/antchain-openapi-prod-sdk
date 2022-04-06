// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryMiddlewareclusterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // workspace_id 和workspace_group_id至少要填一个
    @NameInMap("workspace_id")
    public String workspaceId;

    // cluster_id OSP上的ID
    @NameInMap("cluster_id")
    public String clusterId;

    // cluster_name
    @NameInMap("cluster_name")
    public String clusterName;

    // workspace_group_name和workspace_id必须至少传入一个
    @NameInMap("workspace_group_name")
    public String workspaceGroupName;

    // app_service_id
    @NameInMap("app_service_id")
    public String appServiceId;

    public static QueryMiddlewareclusterRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMiddlewareclusterRequest self = new QueryMiddlewareclusterRequest();
        return TeaModel.build(map, self);
    }

    public QueryMiddlewareclusterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMiddlewareclusterRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public QueryMiddlewareclusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public QueryMiddlewareclusterRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public QueryMiddlewareclusterRequest setWorkspaceGroupName(String workspaceGroupName) {
        this.workspaceGroupName = workspaceGroupName;
        return this;
    }
    public String getWorkspaceGroupName() {
        return this.workspaceGroupName;
    }

    public QueryMiddlewareclusterRequest setAppServiceId(String appServiceId) {
        this.appServiceId = appServiceId;
        return this;
    }
    public String getAppServiceId() {
        return this.appServiceId;
    }

}
