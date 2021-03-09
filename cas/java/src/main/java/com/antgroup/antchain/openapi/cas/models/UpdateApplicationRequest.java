// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class UpdateApplicationRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // appDomainId
    @NameInMap("app_domain_id")
    public String appDomainId;

    // appExtraInfos
    @NameInMap("app_extra_infos")
    public java.util.List<AppExtraInfo> appExtraInfos;

    // 应用等级
    @NameInMap("app_level")
    public AppLevel appLevel;

    // appOwner
    @NameInMap("app_owner")
    public AppOwner appOwner;

    // archetype
    @NameInMap("archetype")
    public ScmSofaArchetype archetype;

    // buildpackVersion
    @NameInMap("buildpack_version")
    public String buildpackVersion;

    // 中文名称
    @NameInMap("chinese_name")
    public String chineseName;

    // 代码库
    @NameInMap("code_repository")
    public CodeRepository codeRepository;

    // 描述
    @NameInMap("description")
    public String description;

    // 额外信息
    @NameInMap("extra_params")
    public String extraParams;

    // id
    @NameInMap("id")
    public String id;

    // isService
    @NameInMap("is_service")
    public Boolean isService;

    // name
    @NameInMap("name")
    public String name;

    // ownerId
    @NameInMap("owner_id")
    public String ownerId;

    // stack_id
    @NameInMap("stack_id")
    public String stackId;

    // 状态
    @NameInMap("status")
    public String status;

    // tags
    @NameInMap("tags")
    public String tags;

    // 创建时间
    @NameInMap("utc_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String utcCreate;

    // 修改时间
    @NameInMap("utc_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String utcModified;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    public static UpdateApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationRequest self = new UpdateApplicationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateApplicationRequest setAppDomainId(String appDomainId) {
        this.appDomainId = appDomainId;
        return this;
    }
    public String getAppDomainId() {
        return this.appDomainId;
    }

    public UpdateApplicationRequest setAppExtraInfos(java.util.List<AppExtraInfo> appExtraInfos) {
        this.appExtraInfos = appExtraInfos;
        return this;
    }
    public java.util.List<AppExtraInfo> getAppExtraInfos() {
        return this.appExtraInfos;
    }

    public UpdateApplicationRequest setAppLevel(AppLevel appLevel) {
        this.appLevel = appLevel;
        return this;
    }
    public AppLevel getAppLevel() {
        return this.appLevel;
    }

    public UpdateApplicationRequest setAppOwner(AppOwner appOwner) {
        this.appOwner = appOwner;
        return this;
    }
    public AppOwner getAppOwner() {
        return this.appOwner;
    }

    public UpdateApplicationRequest setArchetype(ScmSofaArchetype archetype) {
        this.archetype = archetype;
        return this;
    }
    public ScmSofaArchetype getArchetype() {
        return this.archetype;
    }

    public UpdateApplicationRequest setBuildpackVersion(String buildpackVersion) {
        this.buildpackVersion = buildpackVersion;
        return this;
    }
    public String getBuildpackVersion() {
        return this.buildpackVersion;
    }

    public UpdateApplicationRequest setChineseName(String chineseName) {
        this.chineseName = chineseName;
        return this;
    }
    public String getChineseName() {
        return this.chineseName;
    }

    public UpdateApplicationRequest setCodeRepository(CodeRepository codeRepository) {
        this.codeRepository = codeRepository;
        return this;
    }
    public CodeRepository getCodeRepository() {
        return this.codeRepository;
    }

    public UpdateApplicationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateApplicationRequest setExtraParams(String extraParams) {
        this.extraParams = extraParams;
        return this;
    }
    public String getExtraParams() {
        return this.extraParams;
    }

    public UpdateApplicationRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateApplicationRequest setIsService(Boolean isService) {
        this.isService = isService;
        return this;
    }
    public Boolean getIsService() {
        return this.isService;
    }

    public UpdateApplicationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateApplicationRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public UpdateApplicationRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public UpdateApplicationRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateApplicationRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public UpdateApplicationRequest setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public UpdateApplicationRequest setUtcModified(String utcModified) {
        this.utcModified = utcModified;
        return this;
    }
    public String getUtcModified() {
        return this.utcModified;
    }

    public UpdateApplicationRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
