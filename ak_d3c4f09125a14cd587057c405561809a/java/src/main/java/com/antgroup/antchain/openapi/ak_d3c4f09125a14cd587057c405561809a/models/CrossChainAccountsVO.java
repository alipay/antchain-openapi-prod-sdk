// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d3c4f09125a14cd587057c405561809a.models;

import com.aliyun.tea.*;

public class CrossChainAccountsVO extends TeaModel {
    // 对侧链用户地址
    /**
     * <strong>example:</strong>
     * <p>对侧链用户地址</p>
     */
    @NameInMap("cross_chain_user_address")
    public String crossChainUserAddress;

    // 对侧链账户ID
    /**
     * <strong>example:</strong>
     * <p>对侧链账户ID</p>
     */
    @NameInMap("cross_chain_user_account_id")
    public String crossChainUserAccountId;

    // 对侧链红利账户ID
    /**
     * <strong>example:</strong>
     * <p>对侧链红利账户ID</p>
     */
    @NameInMap("cross_chain_user_bonus_account_id")
    public String crossChainUserBonusAccountId;

    // 对侧链资产账户明细
    /**
     * <strong>example:</strong>
     * <p>对侧链资产账户明细</p>
     */
    @NameInMap("cross_chain_user_accounts_details")
    public java.util.List<CrossChainAccountsDetailVO> crossChainUserAccountsDetails;

    // 对侧链账户信息
    /**
     * <strong>example:</strong>
     * <p>对侧链账户信息</p>
     */
    @NameInMap("cross_chain_bonus_accounts_details")
    public java.util.List<CrossChainBonusAccountsDetailVO> crossChainBonusAccountsDetails;

    public static CrossChainAccountsVO build(java.util.Map<String, ?> map) throws Exception {
        CrossChainAccountsVO self = new CrossChainAccountsVO();
        return TeaModel.build(map, self);
    }

    public CrossChainAccountsVO setCrossChainUserAddress(String crossChainUserAddress) {
        this.crossChainUserAddress = crossChainUserAddress;
        return this;
    }
    public String getCrossChainUserAddress() {
        return this.crossChainUserAddress;
    }

    public CrossChainAccountsVO setCrossChainUserAccountId(String crossChainUserAccountId) {
        this.crossChainUserAccountId = crossChainUserAccountId;
        return this;
    }
    public String getCrossChainUserAccountId() {
        return this.crossChainUserAccountId;
    }

    public CrossChainAccountsVO setCrossChainUserBonusAccountId(String crossChainUserBonusAccountId) {
        this.crossChainUserBonusAccountId = crossChainUserBonusAccountId;
        return this;
    }
    public String getCrossChainUserBonusAccountId() {
        return this.crossChainUserBonusAccountId;
    }

    public CrossChainAccountsVO setCrossChainUserAccountsDetails(java.util.List<CrossChainAccountsDetailVO> crossChainUserAccountsDetails) {
        this.crossChainUserAccountsDetails = crossChainUserAccountsDetails;
        return this;
    }
    public java.util.List<CrossChainAccountsDetailVO> getCrossChainUserAccountsDetails() {
        return this.crossChainUserAccountsDetails;
    }

    public CrossChainAccountsVO setCrossChainBonusAccountsDetails(java.util.List<CrossChainBonusAccountsDetailVO> crossChainBonusAccountsDetails) {
        this.crossChainBonusAccountsDetails = crossChainBonusAccountsDetails;
        return this;
    }
    public java.util.List<CrossChainBonusAccountsDetailVO> getCrossChainBonusAccountsDetails() {
        return this.crossChainBonusAccountsDetails;
    }

}
