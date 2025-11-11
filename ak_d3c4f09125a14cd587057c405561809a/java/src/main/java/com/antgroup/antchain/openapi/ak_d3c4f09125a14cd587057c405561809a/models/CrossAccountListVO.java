// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d3c4f09125a14cd587057c405561809a.models;

import com.aliyun.tea.*;

public class CrossAccountListVO extends TeaModel {
    // 项目ID
    /**
     * <strong>example:</strong>
     * <p>02aa0864b0e347b780f82769d7665baf</p>
     */
    @NameInMap("project_id")
    public String projectId;

    // 资产项目合约地址
    /**
     * <strong>example:</strong>
     * <p>0xc60c23aec15324cd51bf6c291c2768bc7287ada1</p>
     */
    @NameInMap("asset_project_address")
    public String assetProjectAddress;

    // 红利合约地址
    /**
     * <strong>example:</strong>
     * <p>0xb75dd55da39f778f759493a04d5955ba7435f102</p>
     */
    @NameInMap("bonus_address")
    public String bonusAddress;

    // 用户ID
    /**
     * <strong>example:</strong>
     * <p>8a18b4fc7c8341238bd7eac27f63025a</p>
     */
    @NameInMap("user_id")
    public String userId;

    // 代销机构ID
    /**
     * <strong>example:</strong>
     * <p>d9becf0366ff471eb2f3879e5e2f9eb7</p>
     */
    @NameInMap("distributor_institution_id")
    public String distributorInstitutionId;

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
     * <p>40809209519a47179b7110ef0b8e9dff</p>
     */
    @NameInMap("sub_user_account_id")
    public String subUserAccountId;

    // 投资者用户红利账户ID
    /**
     * <strong>example:</strong>
     * <p>043bb2fbcd2947ea8ddea4087eae233f</p>
     */
    @NameInMap("sub_user_bonus_account_id")
    public String subUserBonusAccountId;

    // 目标链名称
    /**
     * <strong>example:</strong>
     * <p>CONFLUX_TEST_NET</p>
     */
    @NameInMap("target_chain_name")
    public String targetChainName;

    // 目标链资产合约地址
    /**
     * <strong>example:</strong>
     * <p>0x77038f22e1b3210d455662fe0071dae5d5ad0c97</p>
     */
    @NameInMap("target_chain_asset_token_address")
    public String targetChainAssetTokenAddress;

    // 目标链红利合约地址
    /**
     * <strong>example:</strong>
     * <p>0x89b7556c61fa90185ab32a99727b2ccdad9fcd36</p>
     */
    @NameInMap("target_chain_bonus_address")
    public String targetChainBonusAddress;

    // 对侧链账户信息
    /**
     * <strong>example:</strong>
     * <p>对侧链账户信息</p>
     */
    @NameInMap("cross_chain_accounts_info")
    public java.util.List<CrossChainAccountsVO> crossChainAccountsInfo;

    public static CrossAccountListVO build(java.util.Map<String, ?> map) throws Exception {
        CrossAccountListVO self = new CrossAccountListVO();
        return TeaModel.build(map, self);
    }

    public CrossAccountListVO setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CrossAccountListVO setAssetProjectAddress(String assetProjectAddress) {
        this.assetProjectAddress = assetProjectAddress;
        return this;
    }
    public String getAssetProjectAddress() {
        return this.assetProjectAddress;
    }

    public CrossAccountListVO setBonusAddress(String bonusAddress) {
        this.bonusAddress = bonusAddress;
        return this;
    }
    public String getBonusAddress() {
        return this.bonusAddress;
    }

    public CrossAccountListVO setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CrossAccountListVO setDistributorInstitutionId(String distributorInstitutionId) {
        this.distributorInstitutionId = distributorInstitutionId;
        return this;
    }
    public String getDistributorInstitutionId() {
        return this.distributorInstitutionId;
    }

    public CrossAccountListVO setChainName(String chainName) {
        this.chainName = chainName;
        return this;
    }
    public String getChainName() {
        return this.chainName;
    }

    public CrossAccountListVO setSubUserAccountId(String subUserAccountId) {
        this.subUserAccountId = subUserAccountId;
        return this;
    }
    public String getSubUserAccountId() {
        return this.subUserAccountId;
    }

    public CrossAccountListVO setSubUserBonusAccountId(String subUserBonusAccountId) {
        this.subUserBonusAccountId = subUserBonusAccountId;
        return this;
    }
    public String getSubUserBonusAccountId() {
        return this.subUserBonusAccountId;
    }

    public CrossAccountListVO setTargetChainName(String targetChainName) {
        this.targetChainName = targetChainName;
        return this;
    }
    public String getTargetChainName() {
        return this.targetChainName;
    }

    public CrossAccountListVO setTargetChainAssetTokenAddress(String targetChainAssetTokenAddress) {
        this.targetChainAssetTokenAddress = targetChainAssetTokenAddress;
        return this;
    }
    public String getTargetChainAssetTokenAddress() {
        return this.targetChainAssetTokenAddress;
    }

    public CrossAccountListVO setTargetChainBonusAddress(String targetChainBonusAddress) {
        this.targetChainBonusAddress = targetChainBonusAddress;
        return this;
    }
    public String getTargetChainBonusAddress() {
        return this.targetChainBonusAddress;
    }

    public CrossAccountListVO setCrossChainAccountsInfo(java.util.List<CrossChainAccountsVO> crossChainAccountsInfo) {
        this.crossChainAccountsInfo = crossChainAccountsInfo;
        return this;
    }
    public java.util.List<CrossChainAccountsVO> getCrossChainAccountsInfo() {
        return this.crossChainAccountsInfo;
    }

}
