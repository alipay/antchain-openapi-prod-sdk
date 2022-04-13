// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class SidecarConfig extends TeaModel {
    // Sidercar 名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 表达是否修改feature
    @NameInMap("change_feature")
    @Validation(required = true)
    public Boolean changeFeature;

    // FEATURE_GATES
    @NameInMap("feature_gates")
    public String featureGates;

    // 镜像地址
    @NameInMap("image")
    @Validation(required = true)
    public String image;

    // 需要修改或自定义新增的sidecar环境变量。
    @NameInMap("change_envs")
    public String changeEnvs;

    // sidecar的pvc挂载配置
    @NameInMap("volume_mounts")
    public java.util.List<VolumeMount> volumeMounts;

    // 扩展字段
    @NameInMap("ext")
    public String ext;

    public static SidecarConfig build(java.util.Map<String, ?> map) throws Exception {
        SidecarConfig self = new SidecarConfig();
        return TeaModel.build(map, self);
    }

    public SidecarConfig setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SidecarConfig setChangeFeature(Boolean changeFeature) {
        this.changeFeature = changeFeature;
        return this;
    }
    public Boolean getChangeFeature() {
        return this.changeFeature;
    }

    public SidecarConfig setFeatureGates(String featureGates) {
        this.featureGates = featureGates;
        return this;
    }
    public String getFeatureGates() {
        return this.featureGates;
    }

    public SidecarConfig setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public SidecarConfig setChangeEnvs(String changeEnvs) {
        this.changeEnvs = changeEnvs;
        return this;
    }
    public String getChangeEnvs() {
        return this.changeEnvs;
    }

    public SidecarConfig setVolumeMounts(java.util.List<VolumeMount> volumeMounts) {
        this.volumeMounts = volumeMounts;
        return this;
    }
    public java.util.List<VolumeMount> getVolumeMounts() {
        return this.volumeMounts;
    }

    public SidecarConfig setExt(String ext) {
        this.ext = ext;
        return this;
    }
    public String getExt() {
        return this.ext;
    }

}
