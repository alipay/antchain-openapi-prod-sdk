// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class Publisher extends TeaModel {
    // 订阅端是否存活，默认1-存活，订阅端下线标记为0，默认1
    @NameInMap("alive")
    public Boolean alive;

    // 应用名
    @NameInMap("app_name")
    public String appName;

    // appVersion
    @NameInMap("app_version")
    public String appVersion;

    // 校验值
    @NameInMap("check_sum")
    public String checkSum;

    // 注册的内容
    @NameInMap("content")
    public String content;

    // 服务id
    @NameInMap("data_id")
    public String dataId;

    // IP
    @NameInMap("host_ip")
    public String hostIp;

    // 服务id
    @NameInMap("id")
    public Long id;

    // 实例id
    @NameInMap("instance_id")
    public String instanceId;

    // mosn
    @NameInMap("mosn")
    public Boolean mosn;

    // 进程ID
    // 
    @NameInMap("process_id")
    public String processId;

    // 协议
    @NameInMap("protocol")
    public String protocol;

    // 服务ip
    @NameInMap("service_ip")
    public String serviceIp;

    // 服务端口
    @NameInMap("service_port")
    public Long servicePort;

    // 状态
    @NameInMap("status")
    public Boolean status;

    // 超时时间
    @NameInMap("timeout")
    public Long timeout;

    // 是否是虚拟机模式
    @NameInMap("vm_mode")
    public Boolean vmMode;

    // 权重
    @NameInMap("weight")
    public Long weight;

    // 逻辑机房
    // 
    @NameInMap("zone")
    public String zone;

    // 修改过的权重
    @NameInMap("config_weight")
    public String configWeight;

    public static Publisher build(java.util.Map<String, ?> map) throws Exception {
        Publisher self = new Publisher();
        return TeaModel.build(map, self);
    }

    public Publisher setAlive(Boolean alive) {
        this.alive = alive;
        return this;
    }
    public Boolean getAlive() {
        return this.alive;
    }

    public Publisher setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public Publisher setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public Publisher setCheckSum(String checkSum) {
        this.checkSum = checkSum;
        return this;
    }
    public String getCheckSum() {
        return this.checkSum;
    }

    public Publisher setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public Publisher setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public Publisher setHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }
    public String getHostIp() {
        return this.hostIp;
    }

    public Publisher setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public Publisher setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public Publisher setMosn(Boolean mosn) {
        this.mosn = mosn;
        return this;
    }
    public Boolean getMosn() {
        return this.mosn;
    }

    public Publisher setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

    public Publisher setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public Publisher setServiceIp(String serviceIp) {
        this.serviceIp = serviceIp;
        return this;
    }
    public String getServiceIp() {
        return this.serviceIp;
    }

    public Publisher setServicePort(Long servicePort) {
        this.servicePort = servicePort;
        return this;
    }
    public Long getServicePort() {
        return this.servicePort;
    }

    public Publisher setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public Publisher setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

    public Publisher setVmMode(Boolean vmMode) {
        this.vmMode = vmMode;
        return this;
    }
    public Boolean getVmMode() {
        return this.vmMode;
    }

    public Publisher setWeight(Long weight) {
        this.weight = weight;
        return this;
    }
    public Long getWeight() {
        return this.weight;
    }

    public Publisher setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

    public Publisher setConfigWeight(String configWeight) {
        this.configWeight = configWeight;
        return this;
    }
    public String getConfigWeight() {
        return this.configWeight;
    }

}
