// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AppPackageListView extends TeaModel {
    // app_id
    @NameInMap("app_id")
    public String appId;

    // app_name
    @NameInMap("app_name")
    public String appName;

    // app_owner_id
    @NameInMap("app_owner_id")
    public String appOwnerId;

    // app_owner_name
    @NameInMap("app_owner_name")
    public String appOwnerName;

    // app_status
    @NameInMap("app_status")
    public String appStatus;

    // buildpack_id
    @NameInMap("buildpack_id")
    public String buildpackId;

    // buildpack_name
    @NameInMap("buildpack_name")
    public String buildpackName;

    // buildpack_version
    @NameInMap("buildpack_version")
    public String buildpackVersion;

    // latest_package
    @NameInMap("latest_package")
    public AppManifest latestPackage;

    // package_count
    @NameInMap("package_count")
    public Long packageCount;

    public static AppPackageListView build(java.util.Map<String, ?> map) throws Exception {
        AppPackageListView self = new AppPackageListView();
        return TeaModel.build(map, self);
    }

    public AppPackageListView setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AppPackageListView setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AppPackageListView setAppOwnerId(String appOwnerId) {
        this.appOwnerId = appOwnerId;
        return this;
    }
    public String getAppOwnerId() {
        return this.appOwnerId;
    }

    public AppPackageListView setAppOwnerName(String appOwnerName) {
        this.appOwnerName = appOwnerName;
        return this;
    }
    public String getAppOwnerName() {
        return this.appOwnerName;
    }

    public AppPackageListView setAppStatus(String appStatus) {
        this.appStatus = appStatus;
        return this;
    }
    public String getAppStatus() {
        return this.appStatus;
    }

    public AppPackageListView setBuildpackId(String buildpackId) {
        this.buildpackId = buildpackId;
        return this;
    }
    public String getBuildpackId() {
        return this.buildpackId;
    }

    public AppPackageListView setBuildpackName(String buildpackName) {
        this.buildpackName = buildpackName;
        return this;
    }
    public String getBuildpackName() {
        return this.buildpackName;
    }

    public AppPackageListView setBuildpackVersion(String buildpackVersion) {
        this.buildpackVersion = buildpackVersion;
        return this;
    }
    public String getBuildpackVersion() {
        return this.buildpackVersion;
    }

    public AppPackageListView setLatestPackage(AppManifest latestPackage) {
        this.latestPackage = latestPackage;
        return this;
    }
    public AppManifest getLatestPackage() {
        return this.latestPackage;
    }

    public AppPackageListView setPackageCount(Long packageCount) {
        this.packageCount = packageCount;
        return this;
    }
    public Long getPackageCount() {
        return this.packageCount;
    }

}
