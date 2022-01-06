// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AddSgMeshclusterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 集群配置信息，yaml格式
    @NameInMap("cluster_config")
    @Validation(required = true)
    public String clusterConfig;

    // 集群名称
    @NameInMap("cluster_name")
    @Validation(required = true)
    public String clusterName;

    // 租户实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static AddSgMeshclusterRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSgMeshclusterRequest self = new AddSgMeshclusterRequest();
        return TeaModel.build(map, self);
    }

    public AddSgMeshclusterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddSgMeshclusterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddSgMeshclusterRequest setClusterConfig(String clusterConfig) {
        this.clusterConfig = clusterConfig;
        return this;
    }
    public String getClusterConfig() {
        return this.clusterConfig;
    }

    public AddSgMeshclusterRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public AddSgMeshclusterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
