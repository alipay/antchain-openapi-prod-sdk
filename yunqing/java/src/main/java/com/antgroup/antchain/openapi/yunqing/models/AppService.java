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

}
