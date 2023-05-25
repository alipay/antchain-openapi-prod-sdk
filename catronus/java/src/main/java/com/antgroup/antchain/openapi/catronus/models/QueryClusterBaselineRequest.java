// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class QueryClusterBaselineRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群id
    @NameInMap("cluster_id")
    @Validation(required = true)
    public String clusterId;

    // 扫描id，不填默认最近一次
    @NameInMap("scan_id")
    public String scanId;

    // 页码
    @NameInMap("page")
    public Long page;

    // 分页大小
    @NameInMap("page_size")
    public Long pageSize;

    public static QueryClusterBaselineRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryClusterBaselineRequest self = new QueryClusterBaselineRequest();
        return TeaModel.build(map, self);
    }

    public QueryClusterBaselineRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryClusterBaselineRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public QueryClusterBaselineRequest setScanId(String scanId) {
        this.scanId = scanId;
        return this;
    }
    public String getScanId() {
        return this.scanId;
    }

    public QueryClusterBaselineRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public QueryClusterBaselineRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
