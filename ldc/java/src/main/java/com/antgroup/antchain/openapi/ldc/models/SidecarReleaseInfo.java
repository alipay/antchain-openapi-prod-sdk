// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class SidecarReleaseInfo extends TeaModel {
    // sidecar类型名称
    @NameInMap("sidecar_name")
    @Validation(required = true)
    public String sidecarName;

    // sidecar的发布版本
    @NameInMap("sidecar_version")
    @Validation(required = true)
    public String sidecarVersion;

    // mosn对应打开的feature-gates配置。
    @NameInMap("feature_gates")
    public String featureGates;

    // 所用的image
    @NameInMap("image")
    @Validation(required = true)
    public String image;

    // 应用基线当前所用的自定义env
    @NameInMap("change_envs")
    public String changeEnvs;

    // sidecar的发布版本号
    @NameInMap("release_version")
    @Validation(required = true)
    public String releaseVersion;

    //  上一次的发布版本号
    @NameInMap("last_release_version")
    public String lastReleaseVersion;

    public static SidecarReleaseInfo build(java.util.Map<String, ?> map) throws Exception {
        SidecarReleaseInfo self = new SidecarReleaseInfo();
        return TeaModel.build(map, self);
    }

    public SidecarReleaseInfo setSidecarName(String sidecarName) {
        this.sidecarName = sidecarName;
        return this;
    }
    public String getSidecarName() {
        return this.sidecarName;
    }

    public SidecarReleaseInfo setSidecarVersion(String sidecarVersion) {
        this.sidecarVersion = sidecarVersion;
        return this;
    }
    public String getSidecarVersion() {
        return this.sidecarVersion;
    }

    public SidecarReleaseInfo setFeatureGates(String featureGates) {
        this.featureGates = featureGates;
        return this;
    }
    public String getFeatureGates() {
        return this.featureGates;
    }

    public SidecarReleaseInfo setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public SidecarReleaseInfo setChangeEnvs(String changeEnvs) {
        this.changeEnvs = changeEnvs;
        return this;
    }
    public String getChangeEnvs() {
        return this.changeEnvs;
    }

    public SidecarReleaseInfo setReleaseVersion(String releaseVersion) {
        this.releaseVersion = releaseVersion;
        return this;
    }
    public String getReleaseVersion() {
        return this.releaseVersion;
    }

    public SidecarReleaseInfo setLastReleaseVersion(String lastReleaseVersion) {
        this.lastReleaseVersion = lastReleaseVersion;
        return this;
    }
    public String getLastReleaseVersion() {
        return this.lastReleaseVersion;
    }

}
