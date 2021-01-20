// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class MountWeight extends TeaModel {
    // 挂载目标 ID
    @NameInMap("mount_target_id")
    public String mountTargetId;

    // 端口
    @NameInMap("port")
    public Long port;

    // 权重
    @NameInMap("weight")
    public Long weight;

    public static MountWeight build(java.util.Map<String, ?> map) throws Exception {
        MountWeight self = new MountWeight();
        return TeaModel.build(map, self);
    }

    public MountWeight setMountTargetId(String mountTargetId) {
        this.mountTargetId = mountTargetId;
        return this;
    }
    public String getMountTargetId() {
        return this.mountTargetId;
    }

    public MountWeight setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

    public MountWeight setWeight(Long weight) {
        this.weight = weight;
        return this;
    }
    public Long getWeight() {
        return this.weight;
    }

}
