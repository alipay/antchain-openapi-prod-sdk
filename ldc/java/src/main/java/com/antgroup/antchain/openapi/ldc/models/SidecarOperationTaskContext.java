// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class SidecarOperationTaskContext extends TeaModel {
    // sidecar开启特性
    @NameInMap("enabled_features")
    public String enabledFeatures;

    // sidecar类型
    @NameInMap("sidecar_types")
    @Validation(required = true)
    public java.util.List<String> sidecarTypes;

    // sidecar版本
    @NameInMap("sidecar_version_map")
    @Validation(required = true)
    public String sidecarVersionMap;

    // sidecar支持特性
    @NameInMap("supported_features")
    public String supportedFeatures;

    // 变更资源列表
    @NameInMap("change_instances")
    @Validation(required = true)
    public java.util.List<OperationChangeInstance> changeInstances;

    // 应用名称
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    public static SidecarOperationTaskContext build(java.util.Map<String, ?> map) throws Exception {
        SidecarOperationTaskContext self = new SidecarOperationTaskContext();
        return TeaModel.build(map, self);
    }

    public SidecarOperationTaskContext setEnabledFeatures(String enabledFeatures) {
        this.enabledFeatures = enabledFeatures;
        return this;
    }
    public String getEnabledFeatures() {
        return this.enabledFeatures;
    }

    public SidecarOperationTaskContext setSidecarTypes(java.util.List<String> sidecarTypes) {
        this.sidecarTypes = sidecarTypes;
        return this;
    }
    public java.util.List<String> getSidecarTypes() {
        return this.sidecarTypes;
    }

    public SidecarOperationTaskContext setSidecarVersionMap(String sidecarVersionMap) {
        this.sidecarVersionMap = sidecarVersionMap;
        return this;
    }
    public String getSidecarVersionMap() {
        return this.sidecarVersionMap;
    }

    public SidecarOperationTaskContext setSupportedFeatures(String supportedFeatures) {
        this.supportedFeatures = supportedFeatures;
        return this;
    }
    public String getSupportedFeatures() {
        return this.supportedFeatures;
    }

    public SidecarOperationTaskContext setChangeInstances(java.util.List<OperationChangeInstance> changeInstances) {
        this.changeInstances = changeInstances;
        return this;
    }
    public java.util.List<OperationChangeInstance> getChangeInstances() {
        return this.changeInstances;
    }

    public SidecarOperationTaskContext setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

}
