// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class ResourceSpec extends TeaModel {
    // cpu规格
    @NameInMap("cpu")
    @Validation(required = true)
    public String cpu;

    // gpu规格
    @NameInMap("gpu")
    public String gpu;

    // memory
    @NameInMap("memory")
    @Validation(required = true)
    public String memory;

    // 规格名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 应用副本数
    @NameInMap("replicas")
    @Validation(required = true)
    public Long replicas;

    // 数据卷规格
    @NameInMap("volumes")
    @Validation(required = true)
    public java.util.List<VolumeSpec> volumes;

    public static ResourceSpec build(java.util.Map<String, ?> map) throws Exception {
        ResourceSpec self = new ResourceSpec();
        return TeaModel.build(map, self);
    }

    public ResourceSpec setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }
    public String getCpu() {
        return this.cpu;
    }

    public ResourceSpec setGpu(String gpu) {
        this.gpu = gpu;
        return this;
    }
    public String getGpu() {
        return this.gpu;
    }

    public ResourceSpec setMemory(String memory) {
        this.memory = memory;
        return this;
    }
    public String getMemory() {
        return this.memory;
    }

    public ResourceSpec setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ResourceSpec setReplicas(Long replicas) {
        this.replicas = replicas;
        return this;
    }
    public Long getReplicas() {
        return this.replicas;
    }

    public ResourceSpec setVolumes(java.util.List<VolumeSpec> volumes) {
        this.volumes = volumes;
        return this;
    }
    public java.util.List<VolumeSpec> getVolumes() {
        return this.volumes;
    }

}
