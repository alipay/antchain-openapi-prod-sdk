// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ApplicationInfo extends TeaModel {
    // 应用别名
    @NameInMap("alias")
    public String alias;

    // 应用名称
    @NameInMap("application_name")
    @Validation(required = true)
    public String applicationName;

    // 应用额外元数据信息
    @NameInMap("app_extra_infos")
    @Validation(required = true)
    public java.util.List<AppExtraInfo> appExtraInfos;

    // 应用所属分组名
    @NameInMap("app_group_name")
    public String appGroupName;

    // 应用等级名称
    @NameInMap("app_level")
    public String appLevel;

    // 技术栈名称
    @NameInMap("buildpack_name")
    public String buildpackName;

    // 技术栈版本
    @NameInMap("buildpack_version")
    public String buildpackVersion;

    // 应用创建时间
    @NameInMap("creation_time")
    public String creationTime;

    // 应用描述
    @NameInMap("description")
    public String description;

    // 用户真实名称
    @NameInMap("owner_login_name")
    public String ownerLoginName;

    // 应用负责人登录名
    @NameInMap("real_owner_login_name")
    public String realOwnerLoginName;

    // 应用状态。取值列表：
    //                     CREATING：应用创建中；
    //                     CREATED：应用成功创建，可正常使用；
    //                     CREATE_FAILED：应用创建失败；
    //                     DELETING：应用删除中；
    //                     DELETE_FAILED：应用删除失败
    //                 
    @NameInMap("status")
    public String status;

    // 全局唯一名字
    @NameInMap("global_name")
    public String globalName;

    // 发布模式， package，image，mixed
    @NameInMap("deploy_type")
    public String deployType;

    public static ApplicationInfo build(java.util.Map<String, ?> map) throws Exception {
        ApplicationInfo self = new ApplicationInfo();
        return TeaModel.build(map, self);
    }

    public ApplicationInfo setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public ApplicationInfo setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public ApplicationInfo setAppExtraInfos(java.util.List<AppExtraInfo> appExtraInfos) {
        this.appExtraInfos = appExtraInfos;
        return this;
    }
    public java.util.List<AppExtraInfo> getAppExtraInfos() {
        return this.appExtraInfos;
    }

    public ApplicationInfo setAppGroupName(String appGroupName) {
        this.appGroupName = appGroupName;
        return this;
    }
    public String getAppGroupName() {
        return this.appGroupName;
    }

    public ApplicationInfo setAppLevel(String appLevel) {
        this.appLevel = appLevel;
        return this;
    }
    public String getAppLevel() {
        return this.appLevel;
    }

    public ApplicationInfo setBuildpackName(String buildpackName) {
        this.buildpackName = buildpackName;
        return this;
    }
    public String getBuildpackName() {
        return this.buildpackName;
    }

    public ApplicationInfo setBuildpackVersion(String buildpackVersion) {
        this.buildpackVersion = buildpackVersion;
        return this;
    }
    public String getBuildpackVersion() {
        return this.buildpackVersion;
    }

    public ApplicationInfo setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public ApplicationInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ApplicationInfo setOwnerLoginName(String ownerLoginName) {
        this.ownerLoginName = ownerLoginName;
        return this;
    }
    public String getOwnerLoginName() {
        return this.ownerLoginName;
    }

    public ApplicationInfo setRealOwnerLoginName(String realOwnerLoginName) {
        this.realOwnerLoginName = realOwnerLoginName;
        return this;
    }
    public String getRealOwnerLoginName() {
        return this.realOwnerLoginName;
    }

    public ApplicationInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ApplicationInfo setGlobalName(String globalName) {
        this.globalName = globalName;
        return this;
    }
    public String getGlobalName() {
        return this.globalName;
    }

    public ApplicationInfo setDeployType(String deployType) {
        this.deployType = deployType;
        return this;
    }
    public String getDeployType() {
        return this.deployType;
    }

}
