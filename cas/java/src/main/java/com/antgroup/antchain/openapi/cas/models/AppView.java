// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AppView extends TeaModel {
    // 应用组id
    @NameInMap("app_domain_id")
    public String appDomainId;

    // 应用扩展信息
    @NameInMap("app_extra_infos")
    public java.util.List<AppExtraInfo> appExtraInfos;

    // 应用等级
    @NameInMap("app_level")
    public AppLevel appLevel;

    // 应用负责人
    @NameInMap("app_owner")
    public AppOwner appOwner;

    // scm sofa archetype
    @NameInMap("archetype")
    public ScmSofaArchetype archetype;

    // 技术栈版本
    @NameInMap("buildpack_version")
    public String buildpackVersion;

    // 中文名称
    @NameInMap("chinese_name")
    public String chineseName;

    // 代码仓库
    @NameInMap("code_repository")
    public CodeRepository codeRepository;

    // 描述信息
    @NameInMap("description")
    public String description;

    // 扩展参数，JSOn字符串
    @NameInMap("extra_params")
    public String extraParams;

    // 应用ID
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 是否组件中心应用
    @NameInMap("is_service")
    public Boolean isService;

    // 应用名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 负责人ID
    @NameInMap("owner_id")
    public String ownerId;

    // 技术栈所属分类ID
    @NameInMap("stack_id")
    @Validation(required = true)
    public String stackId;

    // 应用状态
    @NameInMap("status")
    public String status;

    // 应用标签，JSOn字符串
    @NameInMap("tags")
    public String tags;

    // 租户ID
    @NameInMap("tenant_id")
    public String tenantId;

    // 创建时间
    @NameInMap("utc_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcCreate;

    // 修改时间
    @NameInMap("utc_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcModified;

    // 工作空间ID
    @NameInMap("workspace_id")
    public String workspaceId;

    // 负责人名称
    @NameInMap("owner_name")
    public String ownerName;

    // 应用负责人真实名称
    @NameInMap("real_owner_name")
    @Validation(required = true)
    public String realOwnerName;

    // 应用域路径名
    @NameInMap("domain_names")
    public java.util.List<String> domainNames;

    // 应用分组名称
    @NameInMap("app_domain_name")
    @Validation(required = true)
    public String appDomainName;

    // 应用等级名称
    @NameInMap("app_level_name")
    @Validation(required = true)
    public String appLevelName;

    // 技术栈名称
    @NameInMap("stack_name")
    public String stackName;

    // 技术栈版本
    @NameInMap("stack_version")
    public String stackVersion;

    // 服务器数量
    @NameInMap("container_count")
    public Long containerCount;

    // 数据库个数
    @NameInMap("database_count")
    public Long databaseCount;

    // SLB个数
    @NameInMap("slb_count")
    public Long slbCount;

    // ocs个数
    @NameInMap("ocs_count")
    public Long ocsCount;

    // 发布包个数
    @NameInMap("package_count")
    public Long packageCount;

    // 生命周期信息
    @NameInMap("life_cycle")
    public AppLifeCycle lifeCycle;

    public static AppView build(java.util.Map<String, ?> map) throws Exception {
        AppView self = new AppView();
        return TeaModel.build(map, self);
    }

    public AppView setAppDomainId(String appDomainId) {
        this.appDomainId = appDomainId;
        return this;
    }
    public String getAppDomainId() {
        return this.appDomainId;
    }

    public AppView setAppExtraInfos(java.util.List<AppExtraInfo> appExtraInfos) {
        this.appExtraInfos = appExtraInfos;
        return this;
    }
    public java.util.List<AppExtraInfo> getAppExtraInfos() {
        return this.appExtraInfos;
    }

    public AppView setAppLevel(AppLevel appLevel) {
        this.appLevel = appLevel;
        return this;
    }
    public AppLevel getAppLevel() {
        return this.appLevel;
    }

    public AppView setAppOwner(AppOwner appOwner) {
        this.appOwner = appOwner;
        return this;
    }
    public AppOwner getAppOwner() {
        return this.appOwner;
    }

    public AppView setArchetype(ScmSofaArchetype archetype) {
        this.archetype = archetype;
        return this;
    }
    public ScmSofaArchetype getArchetype() {
        return this.archetype;
    }

    public AppView setBuildpackVersion(String buildpackVersion) {
        this.buildpackVersion = buildpackVersion;
        return this;
    }
    public String getBuildpackVersion() {
        return this.buildpackVersion;
    }

    public AppView setChineseName(String chineseName) {
        this.chineseName = chineseName;
        return this;
    }
    public String getChineseName() {
        return this.chineseName;
    }

    public AppView setCodeRepository(CodeRepository codeRepository) {
        this.codeRepository = codeRepository;
        return this;
    }
    public CodeRepository getCodeRepository() {
        return this.codeRepository;
    }

    public AppView setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AppView setExtraParams(String extraParams) {
        this.extraParams = extraParams;
        return this;
    }
    public String getExtraParams() {
        return this.extraParams;
    }

    public AppView setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AppView setIsService(Boolean isService) {
        this.isService = isService;
        return this;
    }
    public Boolean getIsService() {
        return this.isService;
    }

    public AppView setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AppView setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public AppView setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public AppView setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AppView setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public AppView setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AppView setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public AppView setUtcModified(String utcModified) {
        this.utcModified = utcModified;
        return this;
    }
    public String getUtcModified() {
        return this.utcModified;
    }

    public AppView setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public AppView setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }
    public String getOwnerName() {
        return this.ownerName;
    }

    public AppView setRealOwnerName(String realOwnerName) {
        this.realOwnerName = realOwnerName;
        return this;
    }
    public String getRealOwnerName() {
        return this.realOwnerName;
    }

    public AppView setDomainNames(java.util.List<String> domainNames) {
        this.domainNames = domainNames;
        return this;
    }
    public java.util.List<String> getDomainNames() {
        return this.domainNames;
    }

    public AppView setAppDomainName(String appDomainName) {
        this.appDomainName = appDomainName;
        return this;
    }
    public String getAppDomainName() {
        return this.appDomainName;
    }

    public AppView setAppLevelName(String appLevelName) {
        this.appLevelName = appLevelName;
        return this;
    }
    public String getAppLevelName() {
        return this.appLevelName;
    }

    public AppView setStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }
    public String getStackName() {
        return this.stackName;
    }

    public AppView setStackVersion(String stackVersion) {
        this.stackVersion = stackVersion;
        return this;
    }
    public String getStackVersion() {
        return this.stackVersion;
    }

    public AppView setContainerCount(Long containerCount) {
        this.containerCount = containerCount;
        return this;
    }
    public Long getContainerCount() {
        return this.containerCount;
    }

    public AppView setDatabaseCount(Long databaseCount) {
        this.databaseCount = databaseCount;
        return this;
    }
    public Long getDatabaseCount() {
        return this.databaseCount;
    }

    public AppView setSlbCount(Long slbCount) {
        this.slbCount = slbCount;
        return this;
    }
    public Long getSlbCount() {
        return this.slbCount;
    }

    public AppView setOcsCount(Long ocsCount) {
        this.ocsCount = ocsCount;
        return this;
    }
    public Long getOcsCount() {
        return this.ocsCount;
    }

    public AppView setPackageCount(Long packageCount) {
        this.packageCount = packageCount;
        return this;
    }
    public Long getPackageCount() {
        return this.packageCount;
    }

    public AppView setLifeCycle(AppLifeCycle lifeCycle) {
        this.lifeCycle = lifeCycle;
        return this;
    }
    public AppLifeCycle getLifeCycle() {
        return this.lifeCycle;
    }

}
