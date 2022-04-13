// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class PodStatus extends TeaModel {
    // 节点ip
    @NameInMap("host_ip")
    public String hostIp;

    // pod状态
    @NameInMap("phase")
    @Validation(required = true)
    public String phase;

    // podip
    @NameInMap("pod_ip")
    public String podIp;

    // pod container status
    @NameInMap("container_statuses")
    @Validation(required = true)
    public java.util.List<ContainerStatus> containerStatuses;

    public static PodStatus build(java.util.Map<String, ?> map) throws Exception {
        PodStatus self = new PodStatus();
        return TeaModel.build(map, self);
    }

    public PodStatus setHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }
    public String getHostIp() {
        return this.hostIp;
    }

    public PodStatus setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public PodStatus setPodIp(String podIp) {
        this.podIp = podIp;
        return this;
    }
    public String getPodIp() {
        return this.podIp;
    }

    public PodStatus setContainerStatuses(java.util.List<ContainerStatus> containerStatuses) {
        this.containerStatuses = containerStatuses;
        return this;
    }
    public java.util.List<ContainerStatus> getContainerStatuses() {
        return this.containerStatuses;
    }

}
