// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QueryMeshSidecarRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 查询指定应用服务的
    @NameInMap("app_service_name")
    public String appServiceName;

    // 查询指定集群的，如果未设置，则根据tenant + workspace获取
    @NameInMap("cluster_name")
    public String clusterName;

    // 查询指定命名空间的，如果未指定，默认值为default
    @NameInMap("namespace")
    public String namespace;

    // 分页查询索引页，默认0
    @NameInMap("page_index")
    public Long pageIndex;

    // 分页查询单页大小，默认10
    @NameInMap("page_size")
    public String pageSize;

    // 查询指定podIp(英文半角逗号分割)的
    @NameInMap("pod_ip")
    public String podIp;

    // 查询指定pod状态的
    @NameInMap("pod_status")
    public String podStatus;

    // 查询指定sidecar状态的
    @NameInMap("sidecar_status")
    public String sidecarStatus;

    // 查询注入指定版本sidecar的
    @NameInMap("sidecar_version")
    public String sidecarVersion;

    // 排序字段，默认pod创建时间
    @NameInMap("sort_field")
    public String sortField;

    // 升序(ascend) 或 降序(descend)
    @NameInMap("sort_order")
    public String sortOrder;

    // sidecar类型(mosn/odp/mist)
    @NameInMap("type")
    public String type;

    public static QueryMeshSidecarRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMeshSidecarRequest self = new QueryMeshSidecarRequest();
        return TeaModel.build(map, self);
    }

    public QueryMeshSidecarRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMeshSidecarRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMeshSidecarRequest setAppServiceName(String appServiceName) {
        this.appServiceName = appServiceName;
        return this;
    }
    public String getAppServiceName() {
        return this.appServiceName;
    }

    public QueryMeshSidecarRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public QueryMeshSidecarRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryMeshSidecarRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public QueryMeshSidecarRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public QueryMeshSidecarRequest setPodIp(String podIp) {
        this.podIp = podIp;
        return this;
    }
    public String getPodIp() {
        return this.podIp;
    }

    public QueryMeshSidecarRequest setPodStatus(String podStatus) {
        this.podStatus = podStatus;
        return this;
    }
    public String getPodStatus() {
        return this.podStatus;
    }

    public QueryMeshSidecarRequest setSidecarStatus(String sidecarStatus) {
        this.sidecarStatus = sidecarStatus;
        return this;
    }
    public String getSidecarStatus() {
        return this.sidecarStatus;
    }

    public QueryMeshSidecarRequest setSidecarVersion(String sidecarVersion) {
        this.sidecarVersion = sidecarVersion;
        return this;
    }
    public String getSidecarVersion() {
        return this.sidecarVersion;
    }

    public QueryMeshSidecarRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public QueryMeshSidecarRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public QueryMeshSidecarRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
