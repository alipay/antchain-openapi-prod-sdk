// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class AddContainerserviceLogpvRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // app名称
    @NameInMap("apps")
    @Validation(required = true)
    public java.util.List<String> apps;

    // 环境信息
    @NameInMap("env")
    @Validation(required = true)
    public String env;

    // PVC 名称
    @NameInMap("pvc_name")
    @Validation(required = true)
    public String pvcName;

    // StorageClass
    @NameInMap("storage_class")
    @Validation(required = true)
    public String storageClass;

    // 存储大小
    @NameInMap("storage_size")
    @Validation(required = true)
    public Long storageSize;

    // 挂载路径，默认/home/admin/logs
    @NameInMap("mount_path")
    public String mountPath;

    // addDefaultInitContainer, 默认值false
    @NameInMap("disable_init_container")
    public Boolean disableInitContainer;

    // Init Container名称
    @NameInMap("log_init_container_name")
    public String logInitContainerName;

    // 默认值添加Sidecar PV
    @NameInMap("disable_sidecar_pv")
    public Boolean disableSidecarPv;

    public static AddContainerserviceLogpvRequest build(java.util.Map<String, ?> map) throws Exception {
        AddContainerserviceLogpvRequest self = new AddContainerserviceLogpvRequest();
        return TeaModel.build(map, self);
    }

    public AddContainerserviceLogpvRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddContainerserviceLogpvRequest setApps(java.util.List<String> apps) {
        this.apps = apps;
        return this;
    }
    public java.util.List<String> getApps() {
        return this.apps;
    }

    public AddContainerserviceLogpvRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public AddContainerserviceLogpvRequest setPvcName(String pvcName) {
        this.pvcName = pvcName;
        return this;
    }
    public String getPvcName() {
        return this.pvcName;
    }

    public AddContainerserviceLogpvRequest setStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }
    public String getStorageClass() {
        return this.storageClass;
    }

    public AddContainerserviceLogpvRequest setStorageSize(Long storageSize) {
        this.storageSize = storageSize;
        return this;
    }
    public Long getStorageSize() {
        return this.storageSize;
    }

    public AddContainerserviceLogpvRequest setMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }
    public String getMountPath() {
        return this.mountPath;
    }

    public AddContainerserviceLogpvRequest setDisableInitContainer(Boolean disableInitContainer) {
        this.disableInitContainer = disableInitContainer;
        return this;
    }
    public Boolean getDisableInitContainer() {
        return this.disableInitContainer;
    }

    public AddContainerserviceLogpvRequest setLogInitContainerName(String logInitContainerName) {
        this.logInitContainerName = logInitContainerName;
        return this;
    }
    public String getLogInitContainerName() {
        return this.logInitContainerName;
    }

    public AddContainerserviceLogpvRequest setDisableSidecarPv(Boolean disableSidecarPv) {
        this.disableSidecarPv = disableSidecarPv;
        return this;
    }
    public Boolean getDisableSidecarPv() {
        return this.disableSidecarPv;
    }

}
