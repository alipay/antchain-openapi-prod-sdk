// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ServiceInfo extends TeaModel {
    // 应用名
    @NameInMap("app_name")
    public String appName;

    // 部署单元 ID 列表
    @NameInMap("cell_ids")
    public java.util.List<String> cellIds;

    // 默认执行账号
    @NameInMap("default_execute_account")
    public String defaultExecuteAccount;

    // 环境变量
    @NameInMap("env_config")
    public java.util.List<Pair> envConfig;

    // 是否可以强制执行
    @NameInMap("force_executable")
    public Boolean forceExecutable;

    // 灰度规则配置
    @NameInMap("gray_traffic_configs")
    public java.util.List<GrayTrafficConfig> grayTrafficConfigs;

    // 分组数
    @NameInMap("group_amount")
    public Long groupAmount;

    // 分组策略
    @NameInMap("group_strategy_type")
    public String groupStrategyType;

    // 从缓存安装
    @NameInMap("install_from_cache")
    public Boolean installFromCache;

    // 应用发布名
    @NameInMap("name")
    public String name;

    // 是否需要 beta
    @NameInMap("need_beta")
    public Boolean needBeta;

    // 是否需要灰度
    @NameInMap("need_gray_traffic")
    public Boolean needGrayTraffic;

    // 后置任务列表
    @NameInMap("post_arrangement_info")
    public java.util.List<ArrangementInfo> postArrangementInfo;

    // 前置任务列表
    @NameInMap("pre_arrangement_info")
    public java.util.List<ArrangementInfo> preArrangementInfo;

    // 发布概览
    @NameInMap("service_arrangement")
    public ArrangementInfo serviceArrangement;

    // 发布应用 ID
    @NameInMap("service_id")
    public String serviceId;

    // 静态资源下载链接
    @NameInMap("static_resource_download_url")
    public String staticResourceDownloadUrl;

    // 静态资源目标文件
    @NameInMap("static_resource_target_file")
    public String staticResourceTargetFile;

    // 类型
    @NameInMap("type")
    public String type;

    // 版本
    @NameInMap("version")
    public String version;

    // 环境 ID
    @NameInMap("workspace_id")
    public String workspaceId;

    // update_buildpack_version
    @NameInMap("update_buildpack_version")
    public String updateBuildpackVersion;

    // update_buildpack_id
    @NameInMap("update_buildpack_id")
    public String updateBuildpackId;

    // custom_params
    @NameInMap("custom_params")
    public String customParams;

    public static ServiceInfo build(java.util.Map<String, ?> map) throws Exception {
        ServiceInfo self = new ServiceInfo();
        return TeaModel.build(map, self);
    }

    public ServiceInfo setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ServiceInfo setCellIds(java.util.List<String> cellIds) {
        this.cellIds = cellIds;
        return this;
    }
    public java.util.List<String> getCellIds() {
        return this.cellIds;
    }

    public ServiceInfo setDefaultExecuteAccount(String defaultExecuteAccount) {
        this.defaultExecuteAccount = defaultExecuteAccount;
        return this;
    }
    public String getDefaultExecuteAccount() {
        return this.defaultExecuteAccount;
    }

    public ServiceInfo setEnvConfig(java.util.List<Pair> envConfig) {
        this.envConfig = envConfig;
        return this;
    }
    public java.util.List<Pair> getEnvConfig() {
        return this.envConfig;
    }

    public ServiceInfo setForceExecutable(Boolean forceExecutable) {
        this.forceExecutable = forceExecutable;
        return this;
    }
    public Boolean getForceExecutable() {
        return this.forceExecutable;
    }

    public ServiceInfo setGrayTrafficConfigs(java.util.List<GrayTrafficConfig> grayTrafficConfigs) {
        this.grayTrafficConfigs = grayTrafficConfigs;
        return this;
    }
    public java.util.List<GrayTrafficConfig> getGrayTrafficConfigs() {
        return this.grayTrafficConfigs;
    }

    public ServiceInfo setGroupAmount(Long groupAmount) {
        this.groupAmount = groupAmount;
        return this;
    }
    public Long getGroupAmount() {
        return this.groupAmount;
    }

    public ServiceInfo setGroupStrategyType(String groupStrategyType) {
        this.groupStrategyType = groupStrategyType;
        return this;
    }
    public String getGroupStrategyType() {
        return this.groupStrategyType;
    }

    public ServiceInfo setInstallFromCache(Boolean installFromCache) {
        this.installFromCache = installFromCache;
        return this;
    }
    public Boolean getInstallFromCache() {
        return this.installFromCache;
    }

    public ServiceInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ServiceInfo setNeedBeta(Boolean needBeta) {
        this.needBeta = needBeta;
        return this;
    }
    public Boolean getNeedBeta() {
        return this.needBeta;
    }

    public ServiceInfo setNeedGrayTraffic(Boolean needGrayTraffic) {
        this.needGrayTraffic = needGrayTraffic;
        return this;
    }
    public Boolean getNeedGrayTraffic() {
        return this.needGrayTraffic;
    }

    public ServiceInfo setPostArrangementInfo(java.util.List<ArrangementInfo> postArrangementInfo) {
        this.postArrangementInfo = postArrangementInfo;
        return this;
    }
    public java.util.List<ArrangementInfo> getPostArrangementInfo() {
        return this.postArrangementInfo;
    }

    public ServiceInfo setPreArrangementInfo(java.util.List<ArrangementInfo> preArrangementInfo) {
        this.preArrangementInfo = preArrangementInfo;
        return this;
    }
    public java.util.List<ArrangementInfo> getPreArrangementInfo() {
        return this.preArrangementInfo;
    }

    public ServiceInfo setServiceArrangement(ArrangementInfo serviceArrangement) {
        this.serviceArrangement = serviceArrangement;
        return this;
    }
    public ArrangementInfo getServiceArrangement() {
        return this.serviceArrangement;
    }

    public ServiceInfo setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public ServiceInfo setStaticResourceDownloadUrl(String staticResourceDownloadUrl) {
        this.staticResourceDownloadUrl = staticResourceDownloadUrl;
        return this;
    }
    public String getStaticResourceDownloadUrl() {
        return this.staticResourceDownloadUrl;
    }

    public ServiceInfo setStaticResourceTargetFile(String staticResourceTargetFile) {
        this.staticResourceTargetFile = staticResourceTargetFile;
        return this;
    }
    public String getStaticResourceTargetFile() {
        return this.staticResourceTargetFile;
    }

    public ServiceInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ServiceInfo setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public ServiceInfo setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public ServiceInfo setUpdateBuildpackVersion(String updateBuildpackVersion) {
        this.updateBuildpackVersion = updateBuildpackVersion;
        return this;
    }
    public String getUpdateBuildpackVersion() {
        return this.updateBuildpackVersion;
    }

    public ServiceInfo setUpdateBuildpackId(String updateBuildpackId) {
        this.updateBuildpackId = updateBuildpackId;
        return this;
    }
    public String getUpdateBuildpackId() {
        return this.updateBuildpackId;
    }

    public ServiceInfo setCustomParams(String customParams) {
        this.customParams = customParams;
        return this;
    }
    public String getCustomParams() {
        return this.customParams;
    }

}
