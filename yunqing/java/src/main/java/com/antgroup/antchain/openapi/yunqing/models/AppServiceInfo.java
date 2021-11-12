// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class AppServiceInfo extends TeaModel {
    // 应用名称
    @NameInMap("app_name")
    public String appName;

    // 应用版本
    @NameInMap("app_version")
    public String appVersion;

    // 所属单元ID
    @NameInMap("cell_id")
    @Validation(required = true)
    public String cellId;

    // 容器列表。
    @NameInMap("containers")
    public java.util.List<Container> containers;

    // 部署单元名称，产品实例下唯一。
    @NameInMap("deploy_unit")
    public String deployUnit;

    // 环境唯一标识。
    @NameInMap("env_id")
    public String envId;

    // 应用服务实例唯一标识。
    @NameInMap("id")
    public String id;

    // 产品码
    @NameInMap("product_code")
    public String productCode;

    // 所属产品分组唯一标识。
    @NameInMap("product_group_identity")
    public String productGroupIdentity;

    // 所属产品分组名称。
    @NameInMap("product_group_name")
    public String productGroupName;

    // 应用服务实例状态。DEPLOYING: 部署中；UPGRADING: 升级中；ROLL_BACKING: 回滚中；ACTIVE：可用；FAILED: 部署失败；ROLLBACKED: 已回滚。
    @NameInMap("status")
    public String status;

    public static AppServiceInfo build(java.util.Map<String, ?> map) throws Exception {
        AppServiceInfo self = new AppServiceInfo();
        return TeaModel.build(map, self);
    }

    public AppServiceInfo setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AppServiceInfo setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public AppServiceInfo setCellId(String cellId) {
        this.cellId = cellId;
        return this;
    }
    public String getCellId() {
        return this.cellId;
    }

    public AppServiceInfo setContainers(java.util.List<Container> containers) {
        this.containers = containers;
        return this;
    }
    public java.util.List<Container> getContainers() {
        return this.containers;
    }

    public AppServiceInfo setDeployUnit(String deployUnit) {
        this.deployUnit = deployUnit;
        return this;
    }
    public String getDeployUnit() {
        return this.deployUnit;
    }

    public AppServiceInfo setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public AppServiceInfo setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AppServiceInfo setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public AppServiceInfo setProductGroupIdentity(String productGroupIdentity) {
        this.productGroupIdentity = productGroupIdentity;
        return this;
    }
    public String getProductGroupIdentity() {
        return this.productGroupIdentity;
    }

    public AppServiceInfo setProductGroupName(String productGroupName) {
        this.productGroupName = productGroupName;
        return this;
    }
    public String getProductGroupName() {
        return this.productGroupName;
    }

    public AppServiceInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
