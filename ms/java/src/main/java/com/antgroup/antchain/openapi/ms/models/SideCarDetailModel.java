// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class SideCarDetailModel extends TeaModel {
    // 应用服务名
    @NameInMap("app_service_name")
    @Validation(required = true)
    public String appServiceName;

    // 集群名
    @NameInMap("clustername")
    @Validation(required = true)
    public String clustername;

    // pod创建时间
    @NameInMap("created_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createdTime;

    // 命名空间
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // pod ip
    @NameInMap("pod_ip")
    @Validation(required = true)
    public String podIp;

    // pod实例名
    @NameInMap("pod_name")
    @Validation(required = true)
    public String podName;

    // pod状态
    @NameInMap("pod_status")
    @Validation(required = true)
    public String podStatus;

    // sidecar状态
    @NameInMap("sidecar_status")
    @Validation(required = true)
    public String sidecarStatus;

    // sidecar类型(mosn/odp/mist)
    @NameInMap("sidecar_type")
    @Validation(required = true)
    public String sidecarType;

    // sidecar版本
    @NameInMap("sidecar_version")
    @Validation(required = true)
    public String sidecarVersion;

    public static SideCarDetailModel build(java.util.Map<String, ?> map) throws Exception {
        SideCarDetailModel self = new SideCarDetailModel();
        return TeaModel.build(map, self);
    }

    public SideCarDetailModel setAppServiceName(String appServiceName) {
        this.appServiceName = appServiceName;
        return this;
    }
    public String getAppServiceName() {
        return this.appServiceName;
    }

    public SideCarDetailModel setClustername(String clustername) {
        this.clustername = clustername;
        return this;
    }
    public String getClustername() {
        return this.clustername;
    }

    public SideCarDetailModel setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public SideCarDetailModel setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SideCarDetailModel setPodIp(String podIp) {
        this.podIp = podIp;
        return this;
    }
    public String getPodIp() {
        return this.podIp;
    }

    public SideCarDetailModel setPodName(String podName) {
        this.podName = podName;
        return this;
    }
    public String getPodName() {
        return this.podName;
    }

    public SideCarDetailModel setPodStatus(String podStatus) {
        this.podStatus = podStatus;
        return this;
    }
    public String getPodStatus() {
        return this.podStatus;
    }

    public SideCarDetailModel setSidecarStatus(String sidecarStatus) {
        this.sidecarStatus = sidecarStatus;
        return this;
    }
    public String getSidecarStatus() {
        return this.sidecarStatus;
    }

    public SideCarDetailModel setSidecarType(String sidecarType) {
        this.sidecarType = sidecarType;
        return this;
    }
    public String getSidecarType() {
        return this.sidecarType;
    }

    public SideCarDetailModel setSidecarVersion(String sidecarVersion) {
        this.sidecarVersion = sidecarVersion;
        return this;
    }
    public String getSidecarVersion() {
        return this.sidecarVersion;
    }

}
