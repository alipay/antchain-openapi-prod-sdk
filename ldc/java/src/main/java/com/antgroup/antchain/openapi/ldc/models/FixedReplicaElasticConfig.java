// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class FixedReplicaElasticConfig extends TeaModel {
    // 各部署单元/集群的副本数配置。
    @NameInMap("replicas")
    @Validation(required = true)
    public java.util.List<ReplicaCount> replicas;

    public static FixedReplicaElasticConfig build(java.util.Map<String, ?> map) throws Exception {
        FixedReplicaElasticConfig self = new FixedReplicaElasticConfig();
        return TeaModel.build(map, self);
    }

    public FixedReplicaElasticConfig setReplicas(java.util.List<ReplicaCount> replicas) {
        this.replicas = replicas;
        return this;
    }
    public java.util.List<ReplicaCount> getReplicas() {
        return this.replicas;
    }

}
