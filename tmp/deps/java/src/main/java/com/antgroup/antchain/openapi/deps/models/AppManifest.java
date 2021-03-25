// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class AppManifest extends TeaModel {
    // id
    @NameInMap("id")
    public String id;

    // workspaceId
    @NameInMap("workspace_id")
    public String workspaceId;

    // appId
    @NameInMap("app_id")
    public String appId;

    // version
    @NameInMap("app_version")
    public String appVersion;

    // name
    @NameInMap("name")
    public String name;

    // storeLocation
    @NameInMap("store_location")
    public String storeLocation;

    // location
    @NameInMap("location")
    public String location;

    // etag
    @NameInMap("etag")
    public String etag;

    // remark
    @NameInMap("remark")
    public String remark;

    // 代码提交
    @NameInMap("code_commit")
    public CodeCommit codeCommit;

    // 创建时间
    @NameInMap("utc_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String utcCreate;

    // 修改时间
    @NameInMap("utc_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String utcModified;

    public static AppManifest build(java.util.Map<String, ?> map) throws Exception {
        AppManifest self = new AppManifest();
        return TeaModel.build(map, self);
    }

    public AppManifest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AppManifest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public AppManifest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AppManifest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public AppManifest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AppManifest setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
        return this;
    }
    public String getStoreLocation() {
        return this.storeLocation;
    }

    public AppManifest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public AppManifest setEtag(String etag) {
        this.etag = etag;
        return this;
    }
    public String getEtag() {
        return this.etag;
    }

    public AppManifest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public AppManifest setCodeCommit(CodeCommit codeCommit) {
        this.codeCommit = codeCommit;
        return this;
    }
    public CodeCommit getCodeCommit() {
        return this.codeCommit;
    }

    public AppManifest setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public AppManifest setUtcModified(String utcModified) {
        this.utcModified = utcModified;
        return this;
    }
    public String getUtcModified() {
        return this.utcModified;
    }

}
