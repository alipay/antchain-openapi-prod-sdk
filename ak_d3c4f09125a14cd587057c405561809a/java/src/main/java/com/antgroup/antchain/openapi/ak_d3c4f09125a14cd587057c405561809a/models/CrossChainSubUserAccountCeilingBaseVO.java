// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d3c4f09125a14cd587057c405561809a.models;

import com.aliyun.tea.*;

public class CrossChainSubUserAccountCeilingBaseVO extends TeaModel {
    // 项目ID
    /**
     * <strong>example:</strong>
     * <p>0628455d41d044ed97783db554149d4b</p>
     */
    @NameInMap("asset_project_id")
    public String assetProjectId;

    // 代币名称
    /**
     * <strong>example:</strong>
     * <p>ETH</p>
     */
    @NameInMap("token_name")
    public String tokenName;

    // 代币合约地址
    /**
     * <strong>example:</strong>
     * <p>0x1753b2e244b1d5e62eaec9a916eaed93c665aec8</p>
     */
    @NameInMap("token_address")
    public String tokenAddress;

    // 别名
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("alias")
    public String alias;

    // 实际持有份额
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("real_shares")
    public String realShares;

    // 代币名称
    /**
     * <strong>example:</strong>
     * <p>ETH</p>
     */
    @NameInMap("bonus_token_name")
    public String bonusTokenName;

    // 代币合约名称
    /**
     * <strong>example:</strong>
     * <p>0x1753b2e244b1d5e62eaec9a916eaed93c665aec8</p>
     */
    @NameInMap("bonus_token_address")
    public String bonusTokenAddress;

    // 红利份额
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("real_bonus")
    public String realBonus;

    // 目标链
    /**
     * <strong>example:</strong>
     * <p>CONFLUX_TEST_NET</p>
     */
    @NameInMap("taget_chain_type")
    public String tagetChainType;

    // 目标链用户地址
    /**
     * <strong>example:</strong>
     * <p>0x0c4d1a578ef5af9f37cdc251bfa11c660c20d38f</p>
     */
    @NameInMap("target_user_address")
    public String targetUserAddress;

    public static CrossChainSubUserAccountCeilingBaseVO build(java.util.Map<String, ?> map) throws Exception {
        CrossChainSubUserAccountCeilingBaseVO self = new CrossChainSubUserAccountCeilingBaseVO();
        return TeaModel.build(map, self);
    }

    public CrossChainSubUserAccountCeilingBaseVO setAssetProjectId(String assetProjectId) {
        this.assetProjectId = assetProjectId;
        return this;
    }
    public String getAssetProjectId() {
        return this.assetProjectId;
    }

    public CrossChainSubUserAccountCeilingBaseVO setTokenName(String tokenName) {
        this.tokenName = tokenName;
        return this;
    }
    public String getTokenName() {
        return this.tokenName;
    }

    public CrossChainSubUserAccountCeilingBaseVO setTokenAddress(String tokenAddress) {
        this.tokenAddress = tokenAddress;
        return this;
    }
    public String getTokenAddress() {
        return this.tokenAddress;
    }

    public CrossChainSubUserAccountCeilingBaseVO setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public CrossChainSubUserAccountCeilingBaseVO setRealShares(String realShares) {
        this.realShares = realShares;
        return this;
    }
    public String getRealShares() {
        return this.realShares;
    }

    public CrossChainSubUserAccountCeilingBaseVO setBonusTokenName(String bonusTokenName) {
        this.bonusTokenName = bonusTokenName;
        return this;
    }
    public String getBonusTokenName() {
        return this.bonusTokenName;
    }

    public CrossChainSubUserAccountCeilingBaseVO setBonusTokenAddress(String bonusTokenAddress) {
        this.bonusTokenAddress = bonusTokenAddress;
        return this;
    }
    public String getBonusTokenAddress() {
        return this.bonusTokenAddress;
    }

    public CrossChainSubUserAccountCeilingBaseVO setRealBonus(String realBonus) {
        this.realBonus = realBonus;
        return this;
    }
    public String getRealBonus() {
        return this.realBonus;
    }

    public CrossChainSubUserAccountCeilingBaseVO setTagetChainType(String tagetChainType) {
        this.tagetChainType = tagetChainType;
        return this;
    }
    public String getTagetChainType() {
        return this.tagetChainType;
    }

    public CrossChainSubUserAccountCeilingBaseVO setTargetUserAddress(String targetUserAddress) {
        this.targetUserAddress = targetUserAddress;
        return this;
    }
    public String getTargetUserAddress() {
        return this.targetUserAddress;
    }

}
