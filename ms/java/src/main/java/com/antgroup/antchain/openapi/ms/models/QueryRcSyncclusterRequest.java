// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QueryRcSyncclusterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 集群同步唯一key
    @NameInMap("cluster_task_unique_key")
    @Validation(required = true)
    public String clusterTaskUniqueKey;

    // 租户实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static QueryRcSyncclusterRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRcSyncclusterRequest self = new QueryRcSyncclusterRequest();
        return TeaModel.build(map, self);
    }

    public QueryRcSyncclusterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRcSyncclusterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRcSyncclusterRequest setClusterTaskUniqueKey(String clusterTaskUniqueKey) {
        this.clusterTaskUniqueKey = clusterTaskUniqueKey;
        return this;
    }
    public String getClusterTaskUniqueKey() {
        return this.clusterTaskUniqueKey;
    }

    public QueryRcSyncclusterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
