// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class DeployConfig extends TeaModel {
    // 节点亲和性配置
    @NameInMap("affinity")
    public AffinityEntity affinity;

    // annotations
    @NameInMap("annotations")
    public String annotations;

    // 用户自定义标签，将会在pod上生效
    @NameInMap("custom_labels")
    public String customLabels;

    // 最小分组数
    @NameInMap("group_count")
    public Long groupCount;

    // 容器服务部署分组策略。
    @NameInMap("group_strategy")
    public String groupStrategy;

    // labels
    @NameInMap("labels")
    public String labels;

    // 单个分组最大Pod数量。
    @NameInMap("max_group_capacity")
    public Long maxGroupCapacity;

    // 是否需要beta confirm。
    @NameInMap("need_beta")
    public Boolean needBeta;

    // 是否需要分组确认。
    @NameInMap("need_confirm")
    public Boolean needConfirm;

    // 已废弃
    @NameInMap("enable_sofa_mesh")
    public Boolean enableSofaMesh;

    // 只支持InPlace
    @NameInMap("upgrade_strategy")
    public String upgradeStrategy;

    // 分组确认策略，FIRST：第一个分组需要确认，EACH：每个分组都需要确认（默认）
    @NameInMap("confirm_strategy")
    public String confirmStrategy;

    // pod name 命名规则，lks 1.23.0 开始支持。Default/PersistentSequence
    @NameInMap("pod_naming_policy")
    public String podNamingPolicy;

    // [已废除] 是否开启强制步长控制。对于ALL_ONE, ALL_ONE_CELL_BETA等分组模式，group_count与max_group_capacity字段将生效，提供精细化分组，以满足用户的pod发布并发控制需求
    @NameInMap("force_stride_control")
    public Boolean forceStrideControl;

    // 每个部署单元单批次最大变更pod比例，仅当group_strategy为ALL_CELL_PERCENTAGE时生效
    @NameInMap("max_cell_pod_percentage")
    public Long maxCellPodPercentage;

    public static DeployConfig build(java.util.Map<String, ?> map) throws Exception {
        DeployConfig self = new DeployConfig();
        return TeaModel.build(map, self);
    }

    public DeployConfig setAffinity(AffinityEntity affinity) {
        this.affinity = affinity;
        return this;
    }
    public AffinityEntity getAffinity() {
        return this.affinity;
    }

    public DeployConfig setAnnotations(String annotations) {
        this.annotations = annotations;
        return this;
    }
    public String getAnnotations() {
        return this.annotations;
    }

    public DeployConfig setCustomLabels(String customLabels) {
        this.customLabels = customLabels;
        return this;
    }
    public String getCustomLabels() {
        return this.customLabels;
    }

    public DeployConfig setGroupCount(Long groupCount) {
        this.groupCount = groupCount;
        return this;
    }
    public Long getGroupCount() {
        return this.groupCount;
    }

    public DeployConfig setGroupStrategy(String groupStrategy) {
        this.groupStrategy = groupStrategy;
        return this;
    }
    public String getGroupStrategy() {
        return this.groupStrategy;
    }

    public DeployConfig setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public DeployConfig setMaxGroupCapacity(Long maxGroupCapacity) {
        this.maxGroupCapacity = maxGroupCapacity;
        return this;
    }
    public Long getMaxGroupCapacity() {
        return this.maxGroupCapacity;
    }

    public DeployConfig setNeedBeta(Boolean needBeta) {
        this.needBeta = needBeta;
        return this;
    }
    public Boolean getNeedBeta() {
        return this.needBeta;
    }

    public DeployConfig setNeedConfirm(Boolean needConfirm) {
        this.needConfirm = needConfirm;
        return this;
    }
    public Boolean getNeedConfirm() {
        return this.needConfirm;
    }

    public DeployConfig setEnableSofaMesh(Boolean enableSofaMesh) {
        this.enableSofaMesh = enableSofaMesh;
        return this;
    }
    public Boolean getEnableSofaMesh() {
        return this.enableSofaMesh;
    }

    public DeployConfig setUpgradeStrategy(String upgradeStrategy) {
        this.upgradeStrategy = upgradeStrategy;
        return this;
    }
    public String getUpgradeStrategy() {
        return this.upgradeStrategy;
    }

    public DeployConfig setConfirmStrategy(String confirmStrategy) {
        this.confirmStrategy = confirmStrategy;
        return this;
    }
    public String getConfirmStrategy() {
        return this.confirmStrategy;
    }

    public DeployConfig setPodNamingPolicy(String podNamingPolicy) {
        this.podNamingPolicy = podNamingPolicy;
        return this;
    }
    public String getPodNamingPolicy() {
        return this.podNamingPolicy;
    }

    public DeployConfig setForceStrideControl(Boolean forceStrideControl) {
        this.forceStrideControl = forceStrideControl;
        return this;
    }
    public Boolean getForceStrideControl() {
        return this.forceStrideControl;
    }

    public DeployConfig setMaxCellPodPercentage(Long maxCellPodPercentage) {
        this.maxCellPodPercentage = maxCellPodPercentage;
        return this;
    }
    public Long getMaxCellPodPercentage() {
        return this.maxCellPodPercentage;
    }

}
