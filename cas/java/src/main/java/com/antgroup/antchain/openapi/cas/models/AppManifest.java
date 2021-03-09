// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AppManifest extends TeaModel {
    // app_id
    @NameInMap("app_id")
    public String appId;

    // app_version
    @NameInMap("app_version")
    public String appVersion;

    // code_commit
    @NameInMap("code_commit")
    public CodeCommit codeCommit;

    // etag
    @NameInMap("etag")
    public String etag;

    // id
    @NameInMap("id")
    public String id;

    // location
    @NameInMap("location")
    public String location;

    // name
    @NameInMap("name")
    public String name;

    // remark
    @NameInMap("remark")
    public String remark;

    // store_location
    @NameInMap("store_location")
    public String storeLocation;

    // utc_create
    @NameInMap("utc_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String utcCreate;

    // utc_modified
    @NameInMap("utc_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String utcModified;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    public static AppManifest build(java.util.Map<String, ?> map) throws Exception {
        AppManifest self = new AppManifest();
        return TeaModel.build(map, self);
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

    public AppManifest setCodeCommit(CodeCommit codeCommit) {
        this.codeCommit = codeCommit;
        return this;
    }
    public CodeCommit getCodeCommit() {
        return this.codeCommit;
    }

    public AppManifest setEtag(String etag) {
        this.etag = etag;
        return this;
    }
    public String getEtag() {
        return this.etag;
    }

    public AppManifest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AppManifest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public AppManifest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AppManifest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public AppManifest setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
        return this;
    }
    public String getStoreLocation() {
        return this.storeLocation;
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

    public AppManifest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
