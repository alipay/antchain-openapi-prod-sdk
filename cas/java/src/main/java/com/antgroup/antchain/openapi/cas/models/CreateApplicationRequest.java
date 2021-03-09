// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CreateApplicationRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 应用分组 id
    @NameInMap("app_domain_id")
    public String appDomainId;

    // 应用等级 id
    @NameInMap("app_level_id")
    public String appLevelId;

    // 页面请求用户无需自行填写此字段。此字段用于代码库的创建权限认证。为 iam 返回的 authorization 值。
    @NameInMap("authorization")
    public String authorization;

    // 技术栈版本
    @NameInMap("buildpack_version")
    public String buildpackVersion;

    // 应用中文名称
    @NameInMap("chinese_name")
    public String chineseName;

    // 使用已有的代码库。默认为否。
    @NameInMap("code_repository_existed")
    public Boolean codeRepositoryExisted;

    // 代码库 group 名称
    @NameInMap("code_repository_group_name")
    public String codeRepositoryGroupName;

    // 默认无需填写。代码库名称。默认无需关联代码库。
    @NameInMap("code_repository_name")
    public String codeRepositoryName;

    // 默认为 GITLAB。无代码库时，无需填写。
    @NameInMap("code_repository_type")
    public String codeRepositoryType;

    // 应用描述
    @NameInMap("description")
    public String description;

    // 应用名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 应用负责人 id
    @NameInMap("owner_id")
    public String ownerId;

    // 技术栈 id
    @NameInMap("stack_id")
    public String stackId;

    // 当设置代码库时，需设置此字段
    @NameInMap("workspace")
    public String workspace;

    public static CreateApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationRequest self = new CreateApplicationRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateApplicationRequest setAppDomainId(String appDomainId) {
        this.appDomainId = appDomainId;
        return this;
    }
    public String getAppDomainId() {
        return this.appDomainId;
    }

    public CreateApplicationRequest setAppLevelId(String appLevelId) {
        this.appLevelId = appLevelId;
        return this;
    }
    public String getAppLevelId() {
        return this.appLevelId;
    }

    public CreateApplicationRequest setAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
    public String getAuthorization() {
        return this.authorization;
    }

    public CreateApplicationRequest setBuildpackVersion(String buildpackVersion) {
        this.buildpackVersion = buildpackVersion;
        return this;
    }
    public String getBuildpackVersion() {
        return this.buildpackVersion;
    }

    public CreateApplicationRequest setChineseName(String chineseName) {
        this.chineseName = chineseName;
        return this;
    }
    public String getChineseName() {
        return this.chineseName;
    }

    public CreateApplicationRequest setCodeRepositoryExisted(Boolean codeRepositoryExisted) {
        this.codeRepositoryExisted = codeRepositoryExisted;
        return this;
    }
    public Boolean getCodeRepositoryExisted() {
        return this.codeRepositoryExisted;
    }

    public CreateApplicationRequest setCodeRepositoryGroupName(String codeRepositoryGroupName) {
        this.codeRepositoryGroupName = codeRepositoryGroupName;
        return this;
    }
    public String getCodeRepositoryGroupName() {
        return this.codeRepositoryGroupName;
    }

    public CreateApplicationRequest setCodeRepositoryName(String codeRepositoryName) {
        this.codeRepositoryName = codeRepositoryName;
        return this;
    }
    public String getCodeRepositoryName() {
        return this.codeRepositoryName;
    }

    public CreateApplicationRequest setCodeRepositoryType(String codeRepositoryType) {
        this.codeRepositoryType = codeRepositoryType;
        return this;
    }
    public String getCodeRepositoryType() {
        return this.codeRepositoryType;
    }

    public CreateApplicationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateApplicationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateApplicationRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public CreateApplicationRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public CreateApplicationRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
