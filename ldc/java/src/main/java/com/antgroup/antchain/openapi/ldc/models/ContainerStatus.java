// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ContainerStatus extends TeaModel {
    // container id
    @NameInMap("container_id")
    @Validation(required = true)
    public String containerId;

    // image
    @NameInMap("image")
    @Validation(required = true)
    public String image;

    // 上一次启动时间
    @NameInMap("last_start_time")
    @Validation(required = true)
    public String lastStartTime;

    // container name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 是否ready
    @NameInMap("ready")
    @Validation(required = true)
    public Boolean ready;

    // 重启次数
    @NameInMap("restart_count")
    @Validation(required = true)
    public Long restartCount;

    // container state
    @NameInMap("state")
    @Validation(required = true)
    public ContainerState state;

    public static ContainerStatus build(java.util.Map<String, ?> map) throws Exception {
        ContainerStatus self = new ContainerStatus();
        return TeaModel.build(map, self);
    }

    public ContainerStatus setContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }
    public String getContainerId() {
        return this.containerId;
    }

    public ContainerStatus setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public ContainerStatus setLastStartTime(String lastStartTime) {
        this.lastStartTime = lastStartTime;
        return this;
    }
    public String getLastStartTime() {
        return this.lastStartTime;
    }

    public ContainerStatus setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ContainerStatus setReady(Boolean ready) {
        this.ready = ready;
        return this;
    }
    public Boolean getReady() {
        return this.ready;
    }

    public ContainerStatus setRestartCount(Long restartCount) {
        this.restartCount = restartCount;
        return this;
    }
    public Long getRestartCount() {
        return this.restartCount;
    }

    public ContainerStatus setState(ContainerState state) {
        this.state = state;
        return this;
    }
    public ContainerState getState() {
        return this.state;
    }

}
