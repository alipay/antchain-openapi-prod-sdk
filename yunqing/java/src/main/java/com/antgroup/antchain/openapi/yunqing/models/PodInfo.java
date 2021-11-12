// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class PodInfo extends TeaModel {
    // podname
    @NameInMap("pod_name")
    @Validation(required = true)
    public String podName;

    // 容器name
    @NameInMap("container_name")
    @Validation(required = true)
    public String containerName;

    // ip
    @NameInMap("ip")
    @Validation(required = true)
    public String ip;

    // host ip
    @NameInMap("host_ip")
    @Validation(required = true)
    public String hostIp;

    // hostname
    @NameInMap("host_name")
    public String hostName;

    // cpu
    @NameInMap("cpu")
    public String cpu;

    // 内存
    @NameInMap("memory")
    public String memory;

    // status
    @NameInMap("status")
    public String status;

    public static PodInfo build(java.util.Map<String, ?> map) throws Exception {
        PodInfo self = new PodInfo();
        return TeaModel.build(map, self);
    }

    public PodInfo setPodName(String podName) {
        this.podName = podName;
        return this;
    }
    public String getPodName() {
        return this.podName;
    }

    public PodInfo setContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }
    public String getContainerName() {
        return this.containerName;
    }

    public PodInfo setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public PodInfo setHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }
    public String getHostIp() {
        return this.hostIp;
    }

    public PodInfo setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public PodInfo setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }
    public String getCpu() {
        return this.cpu;
    }

    public PodInfo setMemory(String memory) {
        this.memory = memory;
        return this;
    }
    public String getMemory() {
        return this.memory;
    }

    public PodInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
