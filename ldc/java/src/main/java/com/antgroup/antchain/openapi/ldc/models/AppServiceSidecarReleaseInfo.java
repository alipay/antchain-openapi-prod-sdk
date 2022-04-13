// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class AppServiceSidecarReleaseInfo extends TeaModel {
    // 服务所属app名称
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 应用服务名
    @NameInMap("container_service_name")
    @Validation(required = true)
    public String containerServiceName;

    // 应用服务所包含的sidecar配置信息，可以有mosn，odp等等不同sidecar类型的配置
    @NameInMap("release_infos")
    @Validation(required = true)
    public java.util.List<SidecarReleaseInfo> releaseInfos;

    public static AppServiceSidecarReleaseInfo build(java.util.Map<String, ?> map) throws Exception {
        AppServiceSidecarReleaseInfo self = new AppServiceSidecarReleaseInfo();
        return TeaModel.build(map, self);
    }

    public AppServiceSidecarReleaseInfo setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AppServiceSidecarReleaseInfo setContainerServiceName(String containerServiceName) {
        this.containerServiceName = containerServiceName;
        return this;
    }
    public String getContainerServiceName() {
        return this.containerServiceName;
    }

    public AppServiceSidecarReleaseInfo setReleaseInfos(java.util.List<SidecarReleaseInfo> releaseInfos) {
        this.releaseInfos = releaseInfos;
        return this;
    }
    public java.util.List<SidecarReleaseInfo> getReleaseInfos() {
        return this.releaseInfos;
    }

}
