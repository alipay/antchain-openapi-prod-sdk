// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d3c4f09125a14cd587057c405561809a.models;

import com.aliyun.tea.*;

public class SubUserAccountCeilingBaseVO extends TeaModel {
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

    // 用户ID
    /**
     * <strong>example:</strong>
     * <p>0361200fb48a49aea26ea7ca5647888f</p>
     */
    @NameInMap("user_id")
    public String userId;

    // 用户地址
    /**
     * <strong>example:</strong>
     * <p>0x0c4d1a578ef5af9f37cdc251bfa11c660c20d38f</p>
     */
    @NameInMap("user_address")
    public String userAddress;

    // 登录名
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:test@gmail.com">test@gmail.com</a></p>
     */
    @NameInMap("login_name")
    public String loginName;

    // 登录类型
    /**
     * <strong>example:</strong>
     * <p>EMAIL</p>
     */
    @NameInMap("login_type")
    public String loginType;

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

    // 锁定金额
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("locked_amount")
    public String lockedAmount;

    // 虚拟子账户余额
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("virtual_account_balance")
    public String virtualAccountBalance;

    public static SubUserAccountCeilingBaseVO build(java.util.Map<String, ?> map) throws Exception {
        SubUserAccountCeilingBaseVO self = new SubUserAccountCeilingBaseVO();
        return TeaModel.build(map, self);
    }

    public SubUserAccountCeilingBaseVO setAssetProjectId(String assetProjectId) {
        this.assetProjectId = assetProjectId;
        return this;
    }
    public String getAssetProjectId() {
        return this.assetProjectId;
    }

    public SubUserAccountCeilingBaseVO setTokenName(String tokenName) {
        this.tokenName = tokenName;
        return this;
    }
    public String getTokenName() {
        return this.tokenName;
    }

    public SubUserAccountCeilingBaseVO setTokenAddress(String tokenAddress) {
        this.tokenAddress = tokenAddress;
        return this;
    }
    public String getTokenAddress() {
        return this.tokenAddress;
    }

    public SubUserAccountCeilingBaseVO setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public SubUserAccountCeilingBaseVO setUserAddress(String userAddress) {
        this.userAddress = userAddress;
        return this;
    }
    public String getUserAddress() {
        return this.userAddress;
    }

    public SubUserAccountCeilingBaseVO setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public SubUserAccountCeilingBaseVO setLoginType(String loginType) {
        this.loginType = loginType;
        return this;
    }
    public String getLoginType() {
        return this.loginType;
    }

    public SubUserAccountCeilingBaseVO setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public SubUserAccountCeilingBaseVO setRealShares(String realShares) {
        this.realShares = realShares;
        return this;
    }
    public String getRealShares() {
        return this.realShares;
    }

    public SubUserAccountCeilingBaseVO setBonusTokenName(String bonusTokenName) {
        this.bonusTokenName = bonusTokenName;
        return this;
    }
    public String getBonusTokenName() {
        return this.bonusTokenName;
    }

    public SubUserAccountCeilingBaseVO setBonusTokenAddress(String bonusTokenAddress) {
        this.bonusTokenAddress = bonusTokenAddress;
        return this;
    }
    public String getBonusTokenAddress() {
        return this.bonusTokenAddress;
    }

    public SubUserAccountCeilingBaseVO setRealBonus(String realBonus) {
        this.realBonus = realBonus;
        return this;
    }
    public String getRealBonus() {
        return this.realBonus;
    }

    public SubUserAccountCeilingBaseVO setLockedAmount(String lockedAmount) {
        this.lockedAmount = lockedAmount;
        return this;
    }
    public String getLockedAmount() {
        return this.lockedAmount;
    }

    public SubUserAccountCeilingBaseVO setVirtualAccountBalance(String virtualAccountBalance) {
        this.virtualAccountBalance = virtualAccountBalance;
        return this;
    }
    public String getVirtualAccountBalance() {
        return this.virtualAccountBalance;
    }

}
