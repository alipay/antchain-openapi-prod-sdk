// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d3c4f09125a14cd587057c405561809a.models;

import com.aliyun.tea.*;

public class ProjectBaseInfoVO extends TeaModel {
    // 项目id
    /**
     * <strong>example:</strong>
     * <p>0628455d41d044ed97783db554149d4b</p>
     */
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // 资产项目合约地址
    // （Launch Network/Shares token ）
    /**
     * <strong>example:</strong>
     * <p>0xf7d48f098440a166e9785ced7073baa6964acc80</p>
     */
    @NameInMap("asset_project_address")
    public String assetProjectAddress;

    // 项目名称
    /**
     * <strong>example:</strong>
     * <p>测试项目</p>
     */
    @NameInMap("project_name")
    public String projectName;

    // 描述
    /**
     * <strong>example:</strong>
     * <p>测试</p>
     */
    @NameInMap("description")
    public String description;

    // 项目状态
    /**
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("project_status")
    public String projectStatus;

    // 项目所在链（Launch Network）
    /**
     * <strong>example:</strong>
     * <p>ANTCHAIN</p>
     */
    @NameInMap("chain_type")
    public String chainType;

    // 代币名称
    /**
     * <strong>example:</strong>
     * <p>OKB</p>
     */
    @NameInMap("token_name")
    public String tokenName;

    // 项目代币符号
    /**
     * <strong>example:</strong>
     * <p>Token-S</p>
     */
    @NameInMap("token_symbol")
    public String tokenSymbol;

    // 总发行量
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("capacity")
    public String capacity;

    // 单钱包最大可持有份额
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("max_subscription_amount")
    public String maxSubscriptionAmount;

    // 创建时间戳（毫秒）
    /**
     * <strong>example:</strong>
     * <p>1755754919690</p>
     */
    @NameInMap("gmt_created")
    public Long gmtCreated;

    public static ProjectBaseInfoVO build(java.util.Map<String, ?> map) throws Exception {
        ProjectBaseInfoVO self = new ProjectBaseInfoVO();
        return TeaModel.build(map, self);
    }

    public ProjectBaseInfoVO setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ProjectBaseInfoVO setAssetProjectAddress(String assetProjectAddress) {
        this.assetProjectAddress = assetProjectAddress;
        return this;
    }
    public String getAssetProjectAddress() {
        return this.assetProjectAddress;
    }

    public ProjectBaseInfoVO setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public ProjectBaseInfoVO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ProjectBaseInfoVO setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
        return this;
    }
    public String getProjectStatus() {
        return this.projectStatus;
    }

    public ProjectBaseInfoVO setChainType(String chainType) {
        this.chainType = chainType;
        return this;
    }
    public String getChainType() {
        return this.chainType;
    }

    public ProjectBaseInfoVO setTokenName(String tokenName) {
        this.tokenName = tokenName;
        return this;
    }
    public String getTokenName() {
        return this.tokenName;
    }

    public ProjectBaseInfoVO setTokenSymbol(String tokenSymbol) {
        this.tokenSymbol = tokenSymbol;
        return this;
    }
    public String getTokenSymbol() {
        return this.tokenSymbol;
    }

    public ProjectBaseInfoVO setCapacity(String capacity) {
        this.capacity = capacity;
        return this;
    }
    public String getCapacity() {
        return this.capacity;
    }

    public ProjectBaseInfoVO setMaxSubscriptionAmount(String maxSubscriptionAmount) {
        this.maxSubscriptionAmount = maxSubscriptionAmount;
        return this;
    }
    public String getMaxSubscriptionAmount() {
        return this.maxSubscriptionAmount;
    }

    public ProjectBaseInfoVO setGmtCreated(Long gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public Long getGmtCreated() {
        return this.gmtCreated;
    }

}
