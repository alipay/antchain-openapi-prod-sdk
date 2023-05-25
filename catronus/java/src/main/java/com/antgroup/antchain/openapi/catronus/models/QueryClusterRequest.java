// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class QueryClusterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群id
    @NameInMap("cluster_id")
    public String clusterId;

    // 集群名
    @NameInMap("cluster_name")
    public String clusterName;

    // 来源
    @NameInMap("source")
    public String source;

    // 状态
    @NameInMap("status")
    public String status;

    // 环境
    @NameInMap("env")
    public String env;

    // 当前页
    @NameInMap("page")
    @Validation(required = true)
    public Long page;

    // 页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static QueryClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryClusterRequest self = new QueryClusterRequest();
        return TeaModel.build(map, self);
    }

    public QueryClusterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public QueryClusterRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public QueryClusterRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public QueryClusterRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryClusterRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public QueryClusterRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public QueryClusterRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
