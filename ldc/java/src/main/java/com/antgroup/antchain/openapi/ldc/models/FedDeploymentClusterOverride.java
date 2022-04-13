// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class FedDeploymentClusterOverride extends TeaModel {
    // 集群名称
    @NameInMap("cluster")
    @Validation(required = true)
    public String cluster;

    // 集群Deployment replica数量
    @NameInMap("replica")
    @Validation(required = true)
    public Long replica;

    // 环境变量配置覆盖
    @NameInMap("env_var_override")
    @Validation(required = true)
    public java.util.List<EnvVarClusterOverride> envVarOverride;

    public static FedDeploymentClusterOverride build(java.util.Map<String, ?> map) throws Exception {
        FedDeploymentClusterOverride self = new FedDeploymentClusterOverride();
        return TeaModel.build(map, self);
    }

    public FedDeploymentClusterOverride setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public FedDeploymentClusterOverride setReplica(Long replica) {
        this.replica = replica;
        return this;
    }
    public Long getReplica() {
        return this.replica;
    }

    public FedDeploymentClusterOverride setEnvVarOverride(java.util.List<EnvVarClusterOverride> envVarOverride) {
        this.envVarOverride = envVarOverride;
        return this;
    }
    public java.util.List<EnvVarClusterOverride> getEnvVarOverride() {
        return this.envVarOverride;
    }

}
