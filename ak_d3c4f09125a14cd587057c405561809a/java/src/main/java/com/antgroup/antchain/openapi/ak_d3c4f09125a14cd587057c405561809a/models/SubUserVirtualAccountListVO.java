// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d3c4f09125a14cd587057c405561809a.models;

import com.aliyun.tea.*;

public class SubUserVirtualAccountListVO extends TeaModel {
    // 项目ID
    /**
     * <strong>example:</strong>
     * <p>0628455d41d044ed97783db554149d4b</p>
     */
    @NameInMap("asset_project_id")
    public String assetProjectId;

    // 资产项目合约地址
    /**
     * <strong>example:</strong>
     * <p>0xf7d48f098440a166e9785ced7073baa6964acc80</p>
     */
    @NameInMap("asset_project_address")
    public String assetProjectAddress;

    // 红利合约地址
    /**
     * <strong>example:</strong>
     * <p>0xc8f15261d4a6022ef48c5d77a55b8d276cd8b41c</p>
     */
    @NameInMap("bonus_address")
    public String bonusAddress;

    // 用户ID
    /**
     * <strong>example:</strong>
     * <p>0207764086af408990a5479c2320f9ce</p>
     */
    @NameInMap("user_id")
    public String userId;

    // 代销机构ID
    /**
     * <strong>example:</strong>
     * <p>b658ce566060409b82c58b710ba869a7</p>
     */
    @NameInMap("distributor_institution_id")
    public String distributorInstitutionId;

    // 链名
    /**
     * <strong>example:</strong>
     * <p>ANTCHAIN</p>
     */
    @NameInMap("chain_name")
    public String chainName;

    // 投资者用户账户ID
    /**
     * <strong>example:</strong>
     * <p>4a5297828bfc42ceb57c912cfbca6584</p>
     */
    @NameInMap("sub_user_account_id")
    public String subUserAccountId;

    // 虚拟子账户ID
    /**
     * <strong>example:</strong>
     * <p>128798fc530249f78296fa97fb03c6f8</p>
     */
    @NameInMap("sub_user_virtual_account_id")
    public String subUserVirtualAccountId;

    // 虚拟子账户红利账户ID
    /**
     * <strong>example:</strong>
     * <p>4311e8e118d848ea9f56731d82e214e8</p>
     */
    @NameInMap("sub_user_bonus_virtual_account_id")
    public String subUserBonusVirtualAccountId;

    // 虚拟子账户明细
    @NameInMap("sub_user_virtual_account_details")
    public java.util.List<SubUserVirtualAccountDetailVO> subUserVirtualAccountDetails;

    // 虚拟子账户红利明细
    @NameInMap("sub_user_bonus_virtual_account_details")
    public java.util.List<SubUserBonusVirtualAccountDetailVO> subUserBonusVirtualAccountDetails;

    public static SubUserVirtualAccountListVO build(java.util.Map<String, ?> map) throws Exception {
        SubUserVirtualAccountListVO self = new SubUserVirtualAccountListVO();
        return TeaModel.build(map, self);
    }

    public SubUserVirtualAccountListVO setAssetProjectId(String assetProjectId) {
        this.assetProjectId = assetProjectId;
        return this;
    }
    public String getAssetProjectId() {
        return this.assetProjectId;
    }

    public SubUserVirtualAccountListVO setAssetProjectAddress(String assetProjectAddress) {
        this.assetProjectAddress = assetProjectAddress;
        return this;
    }
    public String getAssetProjectAddress() {
        return this.assetProjectAddress;
    }

    public SubUserVirtualAccountListVO setBonusAddress(String bonusAddress) {
        this.bonusAddress = bonusAddress;
        return this;
    }
    public String getBonusAddress() {
        return this.bonusAddress;
    }

    public SubUserVirtualAccountListVO setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public SubUserVirtualAccountListVO setDistributorInstitutionId(String distributorInstitutionId) {
        this.distributorInstitutionId = distributorInstitutionId;
        return this;
    }
    public String getDistributorInstitutionId() {
        return this.distributorInstitutionId;
    }

    public SubUserVirtualAccountListVO setChainName(String chainName) {
        this.chainName = chainName;
        return this;
    }
    public String getChainName() {
        return this.chainName;
    }

    public SubUserVirtualAccountListVO setSubUserAccountId(String subUserAccountId) {
        this.subUserAccountId = subUserAccountId;
        return this;
    }
    public String getSubUserAccountId() {
        return this.subUserAccountId;
    }

    public SubUserVirtualAccountListVO setSubUserVirtualAccountId(String subUserVirtualAccountId) {
        this.subUserVirtualAccountId = subUserVirtualAccountId;
        return this;
    }
    public String getSubUserVirtualAccountId() {
        return this.subUserVirtualAccountId;
    }

    public SubUserVirtualAccountListVO setSubUserBonusVirtualAccountId(String subUserBonusVirtualAccountId) {
        this.subUserBonusVirtualAccountId = subUserBonusVirtualAccountId;
        return this;
    }
    public String getSubUserBonusVirtualAccountId() {
        return this.subUserBonusVirtualAccountId;
    }

    public SubUserVirtualAccountListVO setSubUserVirtualAccountDetails(java.util.List<SubUserVirtualAccountDetailVO> subUserVirtualAccountDetails) {
        this.subUserVirtualAccountDetails = subUserVirtualAccountDetails;
        return this;
    }
    public java.util.List<SubUserVirtualAccountDetailVO> getSubUserVirtualAccountDetails() {
        return this.subUserVirtualAccountDetails;
    }

    public SubUserVirtualAccountListVO setSubUserBonusVirtualAccountDetails(java.util.List<SubUserBonusVirtualAccountDetailVO> subUserBonusVirtualAccountDetails) {
        this.subUserBonusVirtualAccountDetails = subUserBonusVirtualAccountDetails;
        return this;
    }
    public java.util.List<SubUserBonusVirtualAccountDetailVO> getSubUserBonusVirtualAccountDetails() {
        return this.subUserBonusVirtualAccountDetails;
    }

}
