// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class DeploymentUnitInstance extends TeaModel {
    // 环境id
    @NameInMap("env_id")
    @Validation(required = true)
    public String envId;

    // 产品码
    @NameInMap("prod_code")
    @Validation(required = true)
    public String prodCode;

    // 产品版本
    @NameInMap("prod_version")
    @Validation(required = true)
    public String prodVersion;

    // 部署单元实例id
    @NameInMap("identity")
    @Validation(required = true)
    public String identity;

    // 部署单元标识id
    @NameInMap("deployment_unit_identity")
    @Validation(required = true)
    public String deploymentUnitIdentity;

    // 部署单元实例状态：ACTIVE、FAILED、UPGRADING
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 部署拓扑标识
    @NameInMap("deploy_topology_identity")
    @Validation(required = true)
    public String deployTopologyIdentity;

    // 部署规格标识id
    @NameInMap("deploy_spec_identity")
    @Validation(required = true)
    public String deploySpecIdentity;

    // 部署单元部署在哪个zone
    @NameInMap("zone")
    public String zone;

    // 逻辑部署单元实例id
    @NameInMap("logical_instance_id")
    public String logicalInstanceId;

    public static DeploymentUnitInstance build(java.util.Map<String, ?> map) throws Exception {
        DeploymentUnitInstance self = new DeploymentUnitInstance();
        return TeaModel.build(map, self);
    }

    public DeploymentUnitInstance setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public DeploymentUnitInstance setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public DeploymentUnitInstance setProdVersion(String prodVersion) {
        this.prodVersion = prodVersion;
        return this;
    }
    public String getProdVersion() {
        return this.prodVersion;
    }

    public DeploymentUnitInstance setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public DeploymentUnitInstance setDeploymentUnitIdentity(String deploymentUnitIdentity) {
        this.deploymentUnitIdentity = deploymentUnitIdentity;
        return this;
    }
    public String getDeploymentUnitIdentity() {
        return this.deploymentUnitIdentity;
    }

    public DeploymentUnitInstance setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DeploymentUnitInstance setDeployTopologyIdentity(String deployTopologyIdentity) {
        this.deployTopologyIdentity = deployTopologyIdentity;
        return this;
    }
    public String getDeployTopologyIdentity() {
        return this.deployTopologyIdentity;
    }

    public DeploymentUnitInstance setDeploySpecIdentity(String deploySpecIdentity) {
        this.deploySpecIdentity = deploySpecIdentity;
        return this;
    }
    public String getDeploySpecIdentity() {
        return this.deploySpecIdentity;
    }

    public DeploymentUnitInstance setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

    public DeploymentUnitInstance setLogicalInstanceId(String logicalInstanceId) {
        this.logicalInstanceId = logicalInstanceId;
        return this;
    }
    public String getLogicalInstanceId() {
        return this.logicalInstanceId;
    }

}
