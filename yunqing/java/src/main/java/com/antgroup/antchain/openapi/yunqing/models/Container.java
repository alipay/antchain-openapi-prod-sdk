// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class Container extends TeaModel {
    // 应用版本
    @NameInMap("app_version")
    public String appVersion;

    // cpu核数，单位C。
    @NameInMap("cpu")
    public Long cpu;

    // 宿主机ip。
    @NameInMap("host_ip")
    public String hostIp;

    // 宿主机名称。
    @NameInMap("host_name")
    public String hostName;

    // 容器id。
    @NameInMap("id")
    public String id;

    // 容器镜像。
    @NameInMap("image")
    public String image;

    // 容器ip。
    @NameInMap("ip")
    public String ip;

    // 内存大小，单位M。
    @NameInMap("memory")
    public Long memory;

    // 容器名称。
    @NameInMap("name")
    public String name;

    // 容器所在的pod。
    @NameInMap("pod")
    public String pod;

    // 资源所属的资源池的唯一标识。
    @NameInMap("resource_pool_id")
    public String resourcePoolId;

    // 容器状态。
    @NameInMap("status")
    public String status;

    // 应用名
    @NameInMap("app_name")
    public String appName;

    public static Container build(java.util.Map<String, ?> map) throws Exception {
        Container self = new Container();
        return TeaModel.build(map, self);
    }

    public Container setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public Container setCpu(Long cpu) {
        this.cpu = cpu;
        return this;
    }
    public Long getCpu() {
        return this.cpu;
    }

    public Container setHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }
    public String getHostIp() {
        return this.hostIp;
    }

    public Container setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public Container setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Container setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public Container setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public Container setMemory(Long memory) {
        this.memory = memory;
        return this;
    }
    public Long getMemory() {
        return this.memory;
    }

    public Container setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Container setPod(String pod) {
        this.pod = pod;
        return this;
    }
    public String getPod() {
        return this.pod;
    }

    public Container setResourcePoolId(String resourcePoolId) {
        this.resourcePoolId = resourcePoolId;
        return this;
    }
    public String getResourcePoolId() {
        return this.resourcePoolId;
    }

    public Container setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Container setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

}
