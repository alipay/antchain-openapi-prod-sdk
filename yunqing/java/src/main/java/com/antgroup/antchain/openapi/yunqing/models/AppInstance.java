// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class AppInstance extends TeaModel {
    // 环境id
    @NameInMap("env_id")
    @Validation(required = true)
    public String envId;

    // 产品码
    @NameInMap("prod_code")
    @Validation(required = true)
    public String prodCode;

    // 应用名称
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 应用版本
    @NameInMap("app_version")
    @Validation(required = true)
    public String appVersion;

    // 应用镜像名
    @NameInMap("image")
    @Validation(required = true)
    public String image;

    // 应用基线状态：ACTIVE、FAILED、UPGRADING
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 部署单元标识id
    @NameInMap("deployment_unit_identity")
    public String deploymentUnitIdentity;

    // 部署单元实例id
    @NameInMap("deployment_unit_instance_identity")
    public String deploymentUnitInstanceIdentity;

    // 应用期望实例数
    @NameInMap("expect_replica")
    @Validation(required = true)
    public String expectReplica;

    public static AppInstance build(java.util.Map<String, ?> map) throws Exception {
        AppInstance self = new AppInstance();
        return TeaModel.build(map, self);
    }

    public AppInstance setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public AppInstance setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public AppInstance setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AppInstance setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public AppInstance setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public AppInstance setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AppInstance setDeploymentUnitIdentity(String deploymentUnitIdentity) {
        this.deploymentUnitIdentity = deploymentUnitIdentity;
        return this;
    }
    public String getDeploymentUnitIdentity() {
        return this.deploymentUnitIdentity;
    }

    public AppInstance setDeploymentUnitInstanceIdentity(String deploymentUnitInstanceIdentity) {
        this.deploymentUnitInstanceIdentity = deploymentUnitInstanceIdentity;
        return this;
    }
    public String getDeploymentUnitInstanceIdentity() {
        return this.deploymentUnitInstanceIdentity;
    }

    public AppInstance setExpectReplica(String expectReplica) {
        this.expectReplica = expectReplica;
        return this;
    }
    public String getExpectReplica() {
        return this.expectReplica;
    }

}
