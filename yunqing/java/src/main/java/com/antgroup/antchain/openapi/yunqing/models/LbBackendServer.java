// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class LbBackendServer extends TeaModel {
    // 应用容器名称
    @NameInMap("container_name")
    @Validation(required = true)
    public String containerName;

    // lb backendServer权值
    @NameInMap("weight")
    @Validation(required = true)
    public Long weight;

    // lb和backendServer关系
    @NameInMap("relation_type")
    @Validation(required = true)
    public String relationType;

    // 环境id
    @NameInMap("env_id")
    @Validation(required = true)
    public String envId;

    public static LbBackendServer build(java.util.Map<String, ?> map) throws Exception {
        LbBackendServer self = new LbBackendServer();
        return TeaModel.build(map, self);
    }

    public LbBackendServer setContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }
    public String getContainerName() {
        return this.containerName;
    }

    public LbBackendServer setWeight(Long weight) {
        this.weight = weight;
        return this;
    }
    public Long getWeight() {
        return this.weight;
    }

    public LbBackendServer setRelationType(String relationType) {
        this.relationType = relationType;
        return this;
    }
    public String getRelationType() {
        return this.relationType;
    }

    public LbBackendServer setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

}
