// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class AppService extends TeaModel {
    // 应用英文名。
    @NameInMap("app_name")
    public String appName;

    // 应用版本
    @NameInMap("app_version")
    public String appVersion;

    // 单元ID
    @NameInMap("cell_id")
    public String cellId;

    // 部署单元名称，产品实例下唯一。
    @NameInMap("deploy_unit")
    public String deployUnit;

    // 部署域。
    @NameInMap("deploy_zone")
    public String deployZone;

    // 环境唯一标识
    @NameInMap("env_id")
    public String envId;

    // 应用服务实例唯一标识。
    @NameInMap("id")
    public String id;

    // 应用所属的产品的产品码
    @NameInMap("product_code")
    public String productCode;

    // 应用服务实例状态。DEPLOYING: 部署中；UPGRADING: 升级中；ROLL_BACKING: 回滚中；ACTIVE：可用；FAILED: 部署失败；ROLLBACKED: 已回滚。
    @NameInMap("status")
    public String status;

    // 应用类型：BUSINESS | JOB | CONTROLLER
    @NameInMap("app_type")
    public String appType;

    // 应用显示名称，云游资产使用
    @NameInMap("app_display_name")
    public String appDisplayName;

    // 应用等级，云游资产使用
    @NameInMap("app_level")
    public String appLevel;

    // 租户信息，云游资产使用。
    @NameInMap("tenant_id")
    public String tenantId;

    // 产品码--应用名
    @NameInMap("product_app")
    public String productApp;

    // 产品Owner
    @NameInMap("owner")
    public Owner owner;

    // 应用SRE信息
    @NameInMap("admin")
    public Admin admin;

    // 副本数
    @NameInMap("expect_replica")
    public Long expectReplica;

    // 镜像
    @NameInMap("image")
    public String image;

    // 2G
    @NameInMap("cpu")
    public Long cpu;

    // 内存资源
    @NameInMap("memory")
    public Long memory;

    public static AppService build(java.util.Map<String, ?> map) throws Exception {
        AppService self = new AppService();
        return TeaModel.build(map, self);
    }

    public AppService setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AppService setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public AppService setCellId(String cellId) {
        this.cellId = cellId;
        return this;
    }
    public String getCellId() {
        return this.cellId;
    }

    public AppService setDeployUnit(String deployUnit) {
        this.deployUnit = deployUnit;
        return this;
    }
    public String getDeployUnit() {
        return this.deployUnit;
    }

    public AppService setDeployZone(String deployZone) {
        this.deployZone = deployZone;
        return this;
    }
    public String getDeployZone() {
        return this.deployZone;
    }

    public AppService setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public AppService setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AppService setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public AppService setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AppService setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public AppService setAppDisplayName(String appDisplayName) {
        this.appDisplayName = appDisplayName;
        return this;
    }
    public String getAppDisplayName() {
        return this.appDisplayName;
    }

    public AppService setAppLevel(String appLevel) {
        this.appLevel = appLevel;
        return this;
    }
    public String getAppLevel() {
        return this.appLevel;
    }

    public AppService setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AppService setProductApp(String productApp) {
        this.productApp = productApp;
        return this;
    }
    public String getProductApp() {
        return this.productApp;
    }

    public AppService setOwner(Owner owner) {
        this.owner = owner;
        return this;
    }
    public Owner getOwner() {
        return this.owner;
    }

    public AppService setAdmin(Admin admin) {
        this.admin = admin;
        return this;
    }
    public Admin getAdmin() {
        return this.admin;
    }

    public AppService setExpectReplica(Long expectReplica) {
        this.expectReplica = expectReplica;
        return this;
    }
    public Long getExpectReplica() {
        return this.expectReplica;
    }

    public AppService setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public AppService setCpu(Long cpu) {
        this.cpu = cpu;
        return this;
    }
    public Long getCpu() {
        return this.cpu;
    }

    public AppService setMemory(Long memory) {
        this.memory = memory;
        return this;
    }
    public Long getMemory() {
        return this.memory;
    }

}
