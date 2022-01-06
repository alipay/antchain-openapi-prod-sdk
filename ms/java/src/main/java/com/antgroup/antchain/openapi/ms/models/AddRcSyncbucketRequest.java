// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AddRcSyncbucketRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 是否自动开启数据同步任务(默认不开启同步任务)
    @NameInMap("auto_start")
    @Validation(required = true)
    public Boolean autoStart;

    // 自己指定的生成集群任务的唯一 key，针对聚石塔的情况，与用户的环境一一映射(查询时使用)
    @NameInMap("cluster_task_unique_key")
    @Validation(required = true)
    public String clusterTaskUniqueKey;

    // {  // 商户当前注册中心集群信息
    //     "type": "EUREKA",   // 集群类型
    //     "name": "xx_eureka", // 集群名字
    //     "vip": "11.22.33.44;12.33.44.1",   // 集群入口地址，可以是 vip；也可以是 ip 列表(多个用分号 ; 间隔)
    //     "extraParams": [{   //扩展参数，比如涉及到鉴权
    //       "key": "user",
    //       "value": "xx"
    //     }, {
    //       "key": "password",
    //       "value": "xx"
    //     }]
    //   }
    @NameInMap("source_cluster")
    @Validation(required = true)
    public String sourceCluster;

    // {  // 商户当前注册中心集群信息
    //     "type": "EUREKA",   // 集群类型
    //     "name": "xx_eureka", // 集群名字
    //     "vip": "11.22.33.44;12.33.44.1",   // 集群入口地址，可以是 vip；也可以是 ip 列表(多个用分号 ; 间隔)
    //     "extraParams": [{   //扩展参数，比如涉及到鉴权
    //       "key": "user",
    //       "value": "xx"
    //     }, {
    //       "key": "password",
    //       "value": "xx"
    //     }]
    //   }
    @NameInMap("target_cluster")
    @Validation(required = true)
    public String targetCluster;

    // 是否开启双向同步(默认单向：从 source_cluster -> target_cluster)，聚石塔中传为 true
    @NameInMap("two_way_sync")
    @Validation(required = true)
    public Boolean twoWaySync;

    // 租户实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static AddRcSyncbucketRequest build(java.util.Map<String, ?> map) throws Exception {
        AddRcSyncbucketRequest self = new AddRcSyncbucketRequest();
        return TeaModel.build(map, self);
    }

    public AddRcSyncbucketRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddRcSyncbucketRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddRcSyncbucketRequest setAutoStart(Boolean autoStart) {
        this.autoStart = autoStart;
        return this;
    }
    public Boolean getAutoStart() {
        return this.autoStart;
    }

    public AddRcSyncbucketRequest setClusterTaskUniqueKey(String clusterTaskUniqueKey) {
        this.clusterTaskUniqueKey = clusterTaskUniqueKey;
        return this;
    }
    public String getClusterTaskUniqueKey() {
        return this.clusterTaskUniqueKey;
    }

    public AddRcSyncbucketRequest setSourceCluster(String sourceCluster) {
        this.sourceCluster = sourceCluster;
        return this;
    }
    public String getSourceCluster() {
        return this.sourceCluster;
    }

    public AddRcSyncbucketRequest setTargetCluster(String targetCluster) {
        this.targetCluster = targetCluster;
        return this;
    }
    public String getTargetCluster() {
        return this.targetCluster;
    }

    public AddRcSyncbucketRequest setTwoWaySync(Boolean twoWaySync) {
        this.twoWaySync = twoWaySync;
        return this;
    }
    public Boolean getTwoWaySync() {
        return this.twoWaySync;
    }

    public AddRcSyncbucketRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
