// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AppServiceViewModel extends TeaModel {
    // 基类
    @NameInMap("base_app_service")
    public AppService baseAppService;

    // 应用负责人姓名
    @NameInMap("owner_name")
    public String ownerName;

    // 技术栈名称
    @NameInMap("buildpack_name")
    public String buildpackName;

    // App的别名
    @NameInMap("chinese_name")
    public String chineseName;

    // buildpackVersion
    @NameInMap("buildpack_version")
    public String buildpackVersion;

    // computerCount
    @NameInMap("computer_count")
    public Long computerCount;

    // databaseCount
    @NameInMap("database_count")
    public Long databaseCount;

    // loadBalancerCount
    @NameInMap("load_balancer_count")
    public Long loadBalancerCount;

    // cacheCount
    @NameInMap("cache_count")
    public Long cacheCount;

    // cellViewList
    @NameInMap("cell_view_list")
    public java.util.List<CellView> cellViewList;

    public static AppServiceViewModel build(java.util.Map<String, ?> map) throws Exception {
        AppServiceViewModel self = new AppServiceViewModel();
        return TeaModel.build(map, self);
    }

    public AppServiceViewModel setBaseAppService(AppService baseAppService) {
        this.baseAppService = baseAppService;
        return this;
    }
    public AppService getBaseAppService() {
        return this.baseAppService;
    }

    public AppServiceViewModel setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }
    public String getOwnerName() {
        return this.ownerName;
    }

    public AppServiceViewModel setBuildpackName(String buildpackName) {
        this.buildpackName = buildpackName;
        return this;
    }
    public String getBuildpackName() {
        return this.buildpackName;
    }

    public AppServiceViewModel setChineseName(String chineseName) {
        this.chineseName = chineseName;
        return this;
    }
    public String getChineseName() {
        return this.chineseName;
    }

    public AppServiceViewModel setBuildpackVersion(String buildpackVersion) {
        this.buildpackVersion = buildpackVersion;
        return this;
    }
    public String getBuildpackVersion() {
        return this.buildpackVersion;
    }

    public AppServiceViewModel setComputerCount(Long computerCount) {
        this.computerCount = computerCount;
        return this;
    }
    public Long getComputerCount() {
        return this.computerCount;
    }

    public AppServiceViewModel setDatabaseCount(Long databaseCount) {
        this.databaseCount = databaseCount;
        return this;
    }
    public Long getDatabaseCount() {
        return this.databaseCount;
    }

    public AppServiceViewModel setLoadBalancerCount(Long loadBalancerCount) {
        this.loadBalancerCount = loadBalancerCount;
        return this;
    }
    public Long getLoadBalancerCount() {
        return this.loadBalancerCount;
    }

    public AppServiceViewModel setCacheCount(Long cacheCount) {
        this.cacheCount = cacheCount;
        return this;
    }
    public Long getCacheCount() {
        return this.cacheCount;
    }

    public AppServiceViewModel setCellViewList(java.util.List<CellView> cellViewList) {
        this.cellViewList = cellViewList;
        return this;
    }
    public java.util.List<CellView> getCellViewList() {
        return this.cellViewList;
    }

}
