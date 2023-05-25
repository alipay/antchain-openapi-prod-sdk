// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class QueryClusterScanRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群id
    @NameInMap("cluster_id")
    public String clusterId;

    // 扫描id
    @NameInMap("scan_id")
    public String scanId;

    public static QueryClusterScanRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryClusterScanRequest self = new QueryClusterScanRequest();
        return TeaModel.build(map, self);
    }

    public QueryClusterScanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryClusterScanRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public QueryClusterScanRequest setScanId(String scanId) {
        this.scanId = scanId;
        return this;
    }
    public String getScanId() {
        return this.scanId;
    }

}
