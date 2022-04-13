// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class AppReleaseConfig extends TeaModel {
    // 名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 应用镜像
    @NameInMap("image")
    @Validation(required = true)
    public String image;

    // commitID
    @NameInMap("commit_id")
    @Validation(required = true)
    public String commitId;

    // 代码分支
    @NameInMap("commit_branch")
    @Validation(required = true)
    public String commitBranch;

    public static AppReleaseConfig build(java.util.Map<String, ?> map) throws Exception {
        AppReleaseConfig self = new AppReleaseConfig();
        return TeaModel.build(map, self);
    }

    public AppReleaseConfig setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AppReleaseConfig setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public AppReleaseConfig setCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }
    public String getCommitId() {
        return this.commitId;
    }

    public AppReleaseConfig setCommitBranch(String commitBranch) {
        this.commitBranch = commitBranch;
        return this;
    }
    public String getCommitBranch() {
        return this.commitBranch;
    }

}
