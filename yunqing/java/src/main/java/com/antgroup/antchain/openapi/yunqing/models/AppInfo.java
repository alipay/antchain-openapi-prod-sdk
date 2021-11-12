// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class AppInfo extends TeaModel {
    // 集群里面该app的namespace
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // pod信息列表
    @NameInMap("pod_list")
    @Validation(required = true)
    public java.util.List<PodInfo> podList;

    // 应用名称
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // ap version
    @NameInMap("app_version")
    @Validation(required = true)
    public String appVersion;

    public static AppInfo build(java.util.Map<String, ?> map) throws Exception {
        AppInfo self = new AppInfo();
        return TeaModel.build(map, self);
    }

    public AppInfo setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public AppInfo setPodList(java.util.List<PodInfo> podList) {
        this.podList = podList;
        return this;
    }
    public java.util.List<PodInfo> getPodList() {
        return this.podList;
    }

    public AppInfo setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AppInfo setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

}
