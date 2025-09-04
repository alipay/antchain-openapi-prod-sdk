// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class ProjectWithRole extends TeaModel {
    // 项目id
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("project_id")
    public String projectId;

    // 项目名称
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("projcet_name")
    public String projcetName;

    // 描述
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("description")
    public String description;

    // token名称
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("token_name")
    public String tokenName;

    // 最大供应量
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("capacity")
    public String capacity;

    // 净值
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("net_value")
    public String netValue;

    // 价格类型
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("price_type")
    public String priceType;

    // 项目净值
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("project_net_value")
    public String projectNetValue;

    // 最大限额
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("max_subscription_amount")
    public String maxSubscriptionAmount;

    // 部署类型 DIRECT_PUBLIC_CHAIN 直发公链，NORMAL 普通模式
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("deployment_type")
    public String deploymentType;

    // 项目所在链
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("chain_type")
    public String chainType;

    // 操作角色列表
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("user_operator_list")
    public java.util.List<UserOperatorInfoBO> userOperatorList;

    // 代销者机构集合
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("participant_infos")
    public java.util.List<ParticipantInfo> participantInfos;

    public static ProjectWithRole build(java.util.Map<String, ?> map) throws Exception {
        ProjectWithRole self = new ProjectWithRole();
        return TeaModel.build(map, self);
    }

    public ProjectWithRole setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ProjectWithRole setProjcetName(String projcetName) {
        this.projcetName = projcetName;
        return this;
    }
    public String getProjcetName() {
        return this.projcetName;
    }

    public ProjectWithRole setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ProjectWithRole setTokenName(String tokenName) {
        this.tokenName = tokenName;
        return this;
    }
    public String getTokenName() {
        return this.tokenName;
    }

    public ProjectWithRole setCapacity(String capacity) {
        this.capacity = capacity;
        return this;
    }
    public String getCapacity() {
        return this.capacity;
    }

    public ProjectWithRole setNetValue(String netValue) {
        this.netValue = netValue;
        return this;
    }
    public String getNetValue() {
        return this.netValue;
    }

    public ProjectWithRole setPriceType(String priceType) {
        this.priceType = priceType;
        return this;
    }
    public String getPriceType() {
        return this.priceType;
    }

    public ProjectWithRole setProjectNetValue(String projectNetValue) {
        this.projectNetValue = projectNetValue;
        return this;
    }
    public String getProjectNetValue() {
        return this.projectNetValue;
    }

    public ProjectWithRole setMaxSubscriptionAmount(String maxSubscriptionAmount) {
        this.maxSubscriptionAmount = maxSubscriptionAmount;
        return this;
    }
    public String getMaxSubscriptionAmount() {
        return this.maxSubscriptionAmount;
    }

    public ProjectWithRole setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
        return this;
    }
    public String getDeploymentType() {
        return this.deploymentType;
    }

    public ProjectWithRole setChainType(String chainType) {
        this.chainType = chainType;
        return this;
    }
    public String getChainType() {
        return this.chainType;
    }

    public ProjectWithRole setUserOperatorList(java.util.List<UserOperatorInfoBO> userOperatorList) {
        this.userOperatorList = userOperatorList;
        return this;
    }
    public java.util.List<UserOperatorInfoBO> getUserOperatorList() {
        return this.userOperatorList;
    }

    public ProjectWithRole setParticipantInfos(java.util.List<ParticipantInfo> participantInfos) {
        this.participantInfos = participantInfos;
        return this;
    }
    public java.util.List<ParticipantInfo> getParticipantInfos() {
        return this.participantInfos;
    }

}
