// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class TransparentProxyNodeVo extends TeaModel {
    // 应用名
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 节点 ID
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 应用实例 ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // IP 地址
    @NameInMap("ip")
    @Validation(required = true)
    public String ip;

    // mosn 版本
    @NameInMap("mosn_version")
    @Validation(required = true)
    public String mosnVersion;

    // 节点状态
    @NameInMap("node_status")
    @Validation(required = true)
    public String nodeStatus;

    // 节点集群类型
    @NameInMap("node_type")
    @Validation(required = true)
    public String nodeType;

    // 节点是否在运行透明劫持
    @NameInMap("real_run")
    @Validation(required = true)
    public String realRun;

    // Sidecar 状态
    @NameInMap("sidecar_status")
    @Validation(required = true)
    public String sidecarStatus;

    // 透明劫持开关
    @NameInMap("transparent_proxy_switch")
    @Validation(required = true)
    public Long transparentProxySwitch;

    public static TransparentProxyNodeVo build(java.util.Map<String, ?> map) throws Exception {
        TransparentProxyNodeVo self = new TransparentProxyNodeVo();
        return TeaModel.build(map, self);
    }

    public TransparentProxyNodeVo setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public TransparentProxyNodeVo setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public TransparentProxyNodeVo setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public TransparentProxyNodeVo setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public TransparentProxyNodeVo setMosnVersion(String mosnVersion) {
        this.mosnVersion = mosnVersion;
        return this;
    }
    public String getMosnVersion() {
        return this.mosnVersion;
    }

    public TransparentProxyNodeVo setNodeStatus(String nodeStatus) {
        this.nodeStatus = nodeStatus;
        return this;
    }
    public String getNodeStatus() {
        return this.nodeStatus;
    }

    public TransparentProxyNodeVo setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public TransparentProxyNodeVo setRealRun(String realRun) {
        this.realRun = realRun;
        return this;
    }
    public String getRealRun() {
        return this.realRun;
    }

    public TransparentProxyNodeVo setSidecarStatus(String sidecarStatus) {
        this.sidecarStatus = sidecarStatus;
        return this;
    }
    public String getSidecarStatus() {
        return this.sidecarStatus;
    }

    public TransparentProxyNodeVo setTransparentProxySwitch(Long transparentProxySwitch) {
        this.transparentProxySwitch = transparentProxySwitch;
        return this;
    }
    public Long getTransparentProxySwitch() {
        return this.transparentProxySwitch;
    }

}
