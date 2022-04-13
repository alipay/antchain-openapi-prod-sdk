// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ElasticConfig extends TeaModel {
    // 固定副本数配置。
    @NameInMap("fixed_replica")
    public FixedReplicaElasticConfig fixedReplica;

    // 弹性伸缩配置
    @NameInMap("hpa")
    public HPABasedElasticConfig hpa;

    // 弹性配置模式：
    // FIXED 固定副本数
    // HPA 弹性伸缩
    @NameInMap("mode")
    public String mode;

    public static ElasticConfig build(java.util.Map<String, ?> map) throws Exception {
        ElasticConfig self = new ElasticConfig();
        return TeaModel.build(map, self);
    }

    public ElasticConfig setFixedReplica(FixedReplicaElasticConfig fixedReplica) {
        this.fixedReplica = fixedReplica;
        return this;
    }
    public FixedReplicaElasticConfig getFixedReplica() {
        return this.fixedReplica;
    }

    public ElasticConfig setHpa(HPABasedElasticConfig hpa) {
        this.hpa = hpa;
        return this;
    }
    public HPABasedElasticConfig getHpa() {
        return this.hpa;
    }

    public ElasticConfig setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

}
