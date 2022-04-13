// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ContainerInfo extends TeaModel {
    // 容器id
    @NameInMap("container_id")
    @Validation(required = true)
    public String containerId;

    // 容器镜像
    @NameInMap("image")
    @Validation(required = true)
    public String image;

    // 最后启动时间
    @NameInMap("last_start_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String lastStartTime;

    // 容器镜像
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 重启次数
    @NameInMap("restart_count")
    @Validation(required = true)
    public Long restartCount;

    // 容器运行状态
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    // 容器spec配置。
    @NameInMap("spec")
    @Validation(required = true)
    public ContainerSpec spec;

    public static ContainerInfo build(java.util.Map<String, ?> map) throws Exception {
        ContainerInfo self = new ContainerInfo();
        return TeaModel.build(map, self);
    }

    public ContainerInfo setContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }
    public String getContainerId() {
        return this.containerId;
    }

    public ContainerInfo setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public ContainerInfo setLastStartTime(String lastStartTime) {
        this.lastStartTime = lastStartTime;
        return this;
    }
    public String getLastStartTime() {
        return this.lastStartTime;
    }

    public ContainerInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ContainerInfo setRestartCount(Long restartCount) {
        this.restartCount = restartCount;
        return this;
    }
    public Long getRestartCount() {
        return this.restartCount;
    }

    public ContainerInfo setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public ContainerInfo setSpec(ContainerSpec spec) {
        this.spec = spec;
        return this;
    }
    public ContainerSpec getSpec() {
        return this.spec;
    }

}
