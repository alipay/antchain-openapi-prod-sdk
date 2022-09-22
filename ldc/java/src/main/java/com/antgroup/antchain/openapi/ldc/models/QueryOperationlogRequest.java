// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryOperationlogRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 页码。起始值：1。默认值：1。
    @NameInMap("page_no")
    public Long pageNo;

    // 分页查询时设置的每页行数。最大值：100，默认值：10。
    @NameInMap("page_size")
    public Long pageSize;

    // 实体类型。LDC_PLAN/LDC_SERVICE/POD_CONTAINER
    @NameInMap("entity_type")
    public String entityType;

    // 目标id。发布单plan_id或者lks_service_id。
    @NameInMap("target_id")
    public String targetId;

    // 当前工作空间组名称
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 集群id，entity_type==POD_CONTAINER 时有用
    @NameInMap("cluster_id")
    public String clusterId;

    // pod名称，entity_type==POD_CONTAINER 时有用
    @NameInMap("pod_name")
    public String podName;

    // 命名空间，entity_type==POD_CONTAINER 时必传
    @NameInMap("namespace")
    public String namespace;

    public static QueryOperationlogRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOperationlogRequest self = new QueryOperationlogRequest();
        return TeaModel.build(map, self);
    }

    public QueryOperationlogRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryOperationlogRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryOperationlogRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryOperationlogRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public QueryOperationlogRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public QueryOperationlogRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public QueryOperationlogRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public QueryOperationlogRequest setPodName(String podName) {
        this.podName = podName;
        return this;
    }
    public String getPodName() {
        return this.podName;
    }

    public QueryOperationlogRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
