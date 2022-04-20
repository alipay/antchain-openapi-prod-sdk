// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class DeploymentUnitSnapshotOP extends TeaModel {
    // 环境ID
    @NameInMap("env_id")
    public String envId;

    // 产品码
    @NameInMap("prod_code")
    public String prodCode;

    // 产品版本
    @NameInMap("prod_version")
    public String prodVersion;

    // 关联的解决方案id
    @NameInMap("solution_id")
    public String solutionId;

    // 快照关联的发布单id
    @NameInMap("ops_plan_id")
    public String opsPlanId;

    // 快照版本, 根据日期生成 
    @NameInMap("snapshot_version")
    public String snapshotVersion;

    // 快照创建时间
    @NameInMap("snapshot_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String snapshotTime;

    // 部署单元实例唯一标识
    @NameInMap("deployment_unit_instance_identity")
    public String deploymentUnitInstanceIdentity;

    // 部署单元唯一标识
    @NameInMap("deployment_unit_identity")
    public String deploymentUnitIdentity;

    // 部署拓扑
    @NameInMap("deploy_topology_identity")
    public String deployTopologyIdentity;

    // 应用回滚快照
    @NameInMap("app_snapshot")
    public java.util.List<String> appSnapshot;

    public static DeploymentUnitSnapshotOP build(java.util.Map<String, ?> map) throws Exception {
        DeploymentUnitSnapshotOP self = new DeploymentUnitSnapshotOP();
        return TeaModel.build(map, self);
    }

    public DeploymentUnitSnapshotOP setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public DeploymentUnitSnapshotOP setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public DeploymentUnitSnapshotOP setProdVersion(String prodVersion) {
        this.prodVersion = prodVersion;
        return this;
    }
    public String getProdVersion() {
        return this.prodVersion;
    }

    public DeploymentUnitSnapshotOP setSolutionId(String solutionId) {
        this.solutionId = solutionId;
        return this;
    }
    public String getSolutionId() {
        return this.solutionId;
    }

    public DeploymentUnitSnapshotOP setOpsPlanId(String opsPlanId) {
        this.opsPlanId = opsPlanId;
        return this;
    }
    public String getOpsPlanId() {
        return this.opsPlanId;
    }

    public DeploymentUnitSnapshotOP setSnapshotVersion(String snapshotVersion) {
        this.snapshotVersion = snapshotVersion;
        return this;
    }
    public String getSnapshotVersion() {
        return this.snapshotVersion;
    }

    public DeploymentUnitSnapshotOP setSnapshotTime(String snapshotTime) {
        this.snapshotTime = snapshotTime;
        return this;
    }
    public String getSnapshotTime() {
        return this.snapshotTime;
    }

    public DeploymentUnitSnapshotOP setDeploymentUnitInstanceIdentity(String deploymentUnitInstanceIdentity) {
        this.deploymentUnitInstanceIdentity = deploymentUnitInstanceIdentity;
        return this;
    }
    public String getDeploymentUnitInstanceIdentity() {
        return this.deploymentUnitInstanceIdentity;
    }

    public DeploymentUnitSnapshotOP setDeploymentUnitIdentity(String deploymentUnitIdentity) {
        this.deploymentUnitIdentity = deploymentUnitIdentity;
        return this;
    }
    public String getDeploymentUnitIdentity() {
        return this.deploymentUnitIdentity;
    }

    public DeploymentUnitSnapshotOP setDeployTopologyIdentity(String deployTopologyIdentity) {
        this.deployTopologyIdentity = deployTopologyIdentity;
        return this;
    }
    public String getDeployTopologyIdentity() {
        return this.deployTopologyIdentity;
    }

    public DeploymentUnitSnapshotOP setAppSnapshot(java.util.List<String> appSnapshot) {
        this.appSnapshot = appSnapshot;
        return this;
    }
    public java.util.List<String> getAppSnapshot() {
        return this.appSnapshot;
    }

}
