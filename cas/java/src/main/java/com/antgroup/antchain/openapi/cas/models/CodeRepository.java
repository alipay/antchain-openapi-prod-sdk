// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CodeRepository extends TeaModel {
    // 代码仓库ID
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // VCS源代码管理系统
    @NameInMap("type")
    public String type;

    // 负责人
    @NameInMap("owner")
    public String owner;

    // 源代码地址
    @NameInMap("source_location")
    public String sourceLocation;

    // 被SCM管理的远程仓库ID
    @NameInMap("remote_repo_id")
    public String remoteRepoId;

    // 流程标记id(可选参数)
    @NameInMap("instance_id")
    public String instanceId;

    // 是否初始化目录(可选参数，目前金融云传与不传都不初始化)
    @NameInMap("is_init_standard_path")
    public Boolean isInitStandardPath;

    // 代码库是否可复用(默认为不复用 0)
    @NameInMap("repo_reuse")
    public String repoReuse;

    // 父代码库名称(reposReuse为0时可以不传)
    @NameInMap("parent_repos_name")
    public String parentReposName;

    // 代码仓库状态
    @NameInMap("status")
    public String status;

    // 扩展参数，JSON字符串
    @NameInMap("extra_params")
    public String extraParams;

    // 是否使用已有仓库
    @NameInMap("use_exist")
    public Boolean useExist;

    // 分组名称
    @NameInMap("group_name")
    public String groupName;

    public static CodeRepository build(java.util.Map<String, ?> map) throws Exception {
        CodeRepository self = new CodeRepository();
        return TeaModel.build(map, self);
    }

    public CodeRepository setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CodeRepository setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CodeRepository setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CodeRepository setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public CodeRepository setSourceLocation(String sourceLocation) {
        this.sourceLocation = sourceLocation;
        return this;
    }
    public String getSourceLocation() {
        return this.sourceLocation;
    }

    public CodeRepository setRemoteRepoId(String remoteRepoId) {
        this.remoteRepoId = remoteRepoId;
        return this;
    }
    public String getRemoteRepoId() {
        return this.remoteRepoId;
    }

    public CodeRepository setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CodeRepository setIsInitStandardPath(Boolean isInitStandardPath) {
        this.isInitStandardPath = isInitStandardPath;
        return this;
    }
    public Boolean getIsInitStandardPath() {
        return this.isInitStandardPath;
    }

    public CodeRepository setRepoReuse(String repoReuse) {
        this.repoReuse = repoReuse;
        return this;
    }
    public String getRepoReuse() {
        return this.repoReuse;
    }

    public CodeRepository setParentReposName(String parentReposName) {
        this.parentReposName = parentReposName;
        return this;
    }
    public String getParentReposName() {
        return this.parentReposName;
    }

    public CodeRepository setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CodeRepository setExtraParams(String extraParams) {
        this.extraParams = extraParams;
        return this;
    }
    public String getExtraParams() {
        return this.extraParams;
    }

    public CodeRepository setUseExist(Boolean useExist) {
        this.useExist = useExist;
        return this;
    }
    public Boolean getUseExist() {
        return this.useExist;
    }

    public CodeRepository setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

}
