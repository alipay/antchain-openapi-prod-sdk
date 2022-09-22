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

    // diff基准版本，上一次最新发布的版本
    @NameInMap("last_revision_id")
    public String lastRevisionId;

    // 应用服务版本id
    @NameInMap("revision_id")
    public String revisionId;

    // 应用服务版本diff摘要信息
    @NameInMap("revision_diff")
    public String revisionDiff;

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

    public AppReleaseConfig setLastRevisionId(String lastRevisionId) {
        this.lastRevisionId = lastRevisionId;
        return this;
    }
    public String getLastRevisionId() {
        return this.lastRevisionId;
    }

    public AppReleaseConfig setRevisionId(String revisionId) {
        this.revisionId = revisionId;
        return this;
    }
    public String getRevisionId() {
        return this.revisionId;
    }

    public AppReleaseConfig setRevisionDiff(String revisionDiff) {
        this.revisionDiff = revisionDiff;
        return this;
    }
    public String getRevisionDiff() {
        return this.revisionDiff;
    }

}
