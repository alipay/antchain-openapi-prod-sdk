// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ReinitRcSyncclusterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 集群唯一表示，大部分情况下等于 instanceId
    @NameInMap("cluster_task_unique_key")
    @Validation(required = true)
    public String clusterTaskUniqueKey;

    // 租户实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 新的集群信息.
    // { // 商户当前注册中心集群信息 "type": "EUREKA", // 集群类型 "name": "xx_eureka", // 集群名字 "vip": "11.22.33.44;12.33.44.1", // 集群入口地址，可以是 vip；也可以是 ip 列表(多个用分号 ; 间隔) "extraParams": [{ //扩展参数，比如涉及到鉴权 "key": "user", "value": "xx" }, { "key": "password", "value": "xx" }] }
    @NameInMap("new_cluster")
    @Validation(required = true)
    public String newCluster;

    // 是否允许集群切换
    @NameInMap("replace_cluster_enabled")
    @Validation(required = true)
    public String replaceClusterEnabled;

    public static ReinitRcSyncclusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ReinitRcSyncclusterRequest self = new ReinitRcSyncclusterRequest();
        return TeaModel.build(map, self);
    }

    public ReinitRcSyncclusterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReinitRcSyncclusterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ReinitRcSyncclusterRequest setClusterTaskUniqueKey(String clusterTaskUniqueKey) {
        this.clusterTaskUniqueKey = clusterTaskUniqueKey;
        return this;
    }
    public String getClusterTaskUniqueKey() {
        return this.clusterTaskUniqueKey;
    }

    public ReinitRcSyncclusterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ReinitRcSyncclusterRequest setNewCluster(String newCluster) {
        this.newCluster = newCluster;
        return this;
    }
    public String getNewCluster() {
        return this.newCluster;
    }

    public ReinitRcSyncclusterRequest setReplaceClusterEnabled(String replaceClusterEnabled) {
        this.replaceClusterEnabled = replaceClusterEnabled;
        return this;
    }
    public String getReplaceClusterEnabled() {
        return this.replaceClusterEnabled;
    }

}
