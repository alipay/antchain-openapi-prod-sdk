// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d3c4f09125a14cd587057c405561809a.models;

import com.aliyun.tea.*;

public class SubUserAccountDetailVO extends TeaModel {
    // 项目ID
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // 资产项目合约地址
    /**
     * <strong>example:</strong>
     * <p>0x44b2c05769202f0001ab5beb5d583bb8a630677e</p>
     */
    @NameInMap("asset_project_address")
    public String assetProjectAddress;

    // 红利合约地址
    /**
     * <strong>example:</strong>
     * <p>0x6dd8c1ab208dd3d2b20ff28fe97babb6154ff9db</p>
     */
    @NameInMap("bonus_address")
    public String bonusAddress;

    // 用户ID
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("user_id")
    public String userId;

    // 代销机构ID
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("distributor_institution_id")
    public String distributorInstitutionId;

    // 项目代币名称
    /**
     * <strong>example:</strong>
     * <p>etf</p>
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

    // 发行链名称
    /**
     * <strong>example:</strong>
     * <p>ANTCHAIN</p>
     */
    @NameInMap("chain_name")
    public String chainName;

    // 投资者用户账户ID
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("sub_user_account_id")
    public String subUserAccountId;

    // 投资者用户红利账户ID
    /**
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("sub_user_bonus_account_id")
    public String subUserBonusAccountId;

    // 资产账户明细
    /**
     * <strong>example:</strong>
     * <p>资产账户明细</p>
     */
    @NameInMap("sub_user_account_details")
    public java.util.List<SubUserAccountDetailsVO> subUserAccountDetails;

    // 红利账户明细
    /**
     * <strong>example:</strong>
     * <p>红利账户明细</p>
     */
    @NameInMap("sub_user_bonus_account_details")
    public java.util.List<SubUserBonusAccountDetailVO> subUserBonusAccountDetails;

    public static SubUserAccountDetailVO build(java.util.Map<String, ?> map) throws Exception {
        SubUserAccountDetailVO self = new SubUserAccountDetailVO();
        return TeaModel.build(map, self);
    }

    public SubUserAccountDetailVO setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public SubUserAccountDetailVO setAssetProjectAddress(String assetProjectAddress) {
        this.assetProjectAddress = assetProjectAddress;
        return this;
    }
    public String getAssetProjectAddress() {
        return this.assetProjectAddress;
    }

    public SubUserAccountDetailVO setBonusAddress(String bonusAddress) {
        this.bonusAddress = bonusAddress;
        return this;
    }
    public String getBonusAddress() {
        return this.bonusAddress;
    }

    public SubUserAccountDetailVO setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public SubUserAccountDetailVO setDistributorInstitutionId(String distributorInstitutionId) {
        this.distributorInstitutionId = distributorInstitutionId;
        return this;
    }
    public String getDistributorInstitutionId() {
        return this.distributorInstitutionId;
    }

    public SubUserAccountDetailVO setTokenName(String tokenName) {
        this.tokenName = tokenName;
        return this;
    }
    public String getTokenName() {
        return this.tokenName;
    }

    public SubUserAccountDetailVO setTokenSymbol(String tokenSymbol) {
        this.tokenSymbol = tokenSymbol;
        return this;
    }
    public String getTokenSymbol() {
        return this.tokenSymbol;
    }

    public SubUserAccountDetailVO setChainName(String chainName) {
        this.chainName = chainName;
        return this;
    }
    public String getChainName() {
        return this.chainName;
    }

    public SubUserAccountDetailVO setSubUserAccountId(String subUserAccountId) {
        this.subUserAccountId = subUserAccountId;
        return this;
    }
    public String getSubUserAccountId() {
        return this.subUserAccountId;
    }

    public SubUserAccountDetailVO setSubUserBonusAccountId(String subUserBonusAccountId) {
        this.subUserBonusAccountId = subUserBonusAccountId;
        return this;
    }
    public String getSubUserBonusAccountId() {
        return this.subUserBonusAccountId;
    }

    public SubUserAccountDetailVO setSubUserAccountDetails(java.util.List<SubUserAccountDetailsVO> subUserAccountDetails) {
        this.subUserAccountDetails = subUserAccountDetails;
        return this;
    }
    public java.util.List<SubUserAccountDetailsVO> getSubUserAccountDetails() {
        return this.subUserAccountDetails;
    }

    public SubUserAccountDetailVO setSubUserBonusAccountDetails(java.util.List<SubUserBonusAccountDetailVO> subUserBonusAccountDetails) {
        this.subUserBonusAccountDetails = subUserBonusAccountDetails;
        return this;
    }
    public java.util.List<SubUserBonusAccountDetailVO> getSubUserBonusAccountDetails() {
        return this.subUserBonusAccountDetails;
    }

}
