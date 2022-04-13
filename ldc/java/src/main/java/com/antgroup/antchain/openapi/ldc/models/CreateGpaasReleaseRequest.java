// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CreateGpaasReleaseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // aig
    @NameInMap("app_instance_group")
    @Validation(required = true)
    public String appInstanceGroup;

    // 应用名字
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 发布批次分组
    @NameInMap("batches")
    @Validation(required = true)
    public java.util.List<ReleaseBatchObj> batches;

    // 是否是第一次发布
    @NameInMap("is_first_release")
    @Validation(required = true)
    public Boolean isFirstRelease;

    // operator
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 发布单名字，或者说标题
    @NameInMap("release_name")
    @Validation(required = true)
    public String releaseName;

    // 发布版本信息，包括镜像等
    @NameInMap("release_version")
    @Validation(required = true)
    public ReleaseVersion releaseVersion;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    public static CreateGpaasReleaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGpaasReleaseRequest self = new CreateGpaasReleaseRequest();
        return TeaModel.build(map, self);
    }

    public CreateGpaasReleaseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateGpaasReleaseRequest setAppInstanceGroup(String appInstanceGroup) {
        this.appInstanceGroup = appInstanceGroup;
        return this;
    }
    public String getAppInstanceGroup() {
        return this.appInstanceGroup;
    }

    public CreateGpaasReleaseRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateGpaasReleaseRequest setBatches(java.util.List<ReleaseBatchObj> batches) {
        this.batches = batches;
        return this;
    }
    public java.util.List<ReleaseBatchObj> getBatches() {
        return this.batches;
    }

    public CreateGpaasReleaseRequest setIsFirstRelease(Boolean isFirstRelease) {
        this.isFirstRelease = isFirstRelease;
        return this;
    }
    public Boolean getIsFirstRelease() {
        return this.isFirstRelease;
    }

    public CreateGpaasReleaseRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public CreateGpaasReleaseRequest setReleaseName(String releaseName) {
        this.releaseName = releaseName;
        return this;
    }
    public String getReleaseName() {
        return this.releaseName;
    }

    public CreateGpaasReleaseRequest setReleaseVersion(ReleaseVersion releaseVersion) {
        this.releaseVersion = releaseVersion;
        return this;
    }
    public ReleaseVersion getReleaseVersion() {
        return this.releaseVersion;
    }

    public CreateGpaasReleaseRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
