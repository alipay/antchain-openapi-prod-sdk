// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d3c4f09125a14cd587057c405561809a.models;

import com.aliyun.tea.*;

public class SubUserAccountBaseVO extends TeaModel {
    // 二级用户ID
    /**
     * <strong>example:</strong>
     * <p>b20167e21a8d4cc2b5f1022d24f43815</p>
     */
    @NameInMap("sub_user_account_id")
    @Validation(required = true)
    public String subUserAccountId;

    // 用户地址
    /**
     * <strong>example:</strong>
     * <p>0x9f18be920360500f216495cd589895d3917cd9f2</p>
     */
    @NameInMap("user_address")
    public String userAddress;

    // 用户邮箱
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:test@gamil.com">test@gamil.com</a></p>
     */
    @NameInMap("contact")
    public String contact;

    // 用户昵称
    /**
     * <strong>example:</strong>
     * <p>Alice</p>
     */
    @NameInMap("alias")
    public String alias;

    // 项目ID
    /**
     * <strong>example:</strong>
     * <p>00d00c02fb314212b73a23a0c95df0c7</p>
     */
    @NameInMap("asset_project_id")
    @Validation(required = true)
    public String assetProjectId;

    // 链名称
    /**
     * <strong>example:</strong>
     * <p>ANTCHAIN</p>
     */
    @NameInMap("chain_name")
    @Validation(required = true)
    public String chainName;

    // 虚拟子账号信息
    @NameInMap("sub_user_virtual_accounts_info")
    public java.util.List<SubUserVirtualAccountInfoBO> subUserVirtualAccountsInfo;

    // 跨链账号信息
    @NameInMap("cross_chain_sub_user_accounts_info")
    public java.util.List<CrossChainSubUserAccountInfoBO> crossChainSubUserAccountsInfo;

    public static SubUserAccountBaseVO build(java.util.Map<String, ?> map) throws Exception {
        SubUserAccountBaseVO self = new SubUserAccountBaseVO();
        return TeaModel.build(map, self);
    }

    public SubUserAccountBaseVO setSubUserAccountId(String subUserAccountId) {
        this.subUserAccountId = subUserAccountId;
        return this;
    }
    public String getSubUserAccountId() {
        return this.subUserAccountId;
    }

    public SubUserAccountBaseVO setUserAddress(String userAddress) {
        this.userAddress = userAddress;
        return this;
    }
    public String getUserAddress() {
        return this.userAddress;
    }

    public SubUserAccountBaseVO setContact(String contact) {
        this.contact = contact;
        return this;
    }
    public String getContact() {
        return this.contact;
    }

    public SubUserAccountBaseVO setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public SubUserAccountBaseVO setAssetProjectId(String assetProjectId) {
        this.assetProjectId = assetProjectId;
        return this;
    }
    public String getAssetProjectId() {
        return this.assetProjectId;
    }

    public SubUserAccountBaseVO setChainName(String chainName) {
        this.chainName = chainName;
        return this;
    }
    public String getChainName() {
        return this.chainName;
    }

    public SubUserAccountBaseVO setSubUserVirtualAccountsInfo(java.util.List<SubUserVirtualAccountInfoBO> subUserVirtualAccountsInfo) {
        this.subUserVirtualAccountsInfo = subUserVirtualAccountsInfo;
        return this;
    }
    public java.util.List<SubUserVirtualAccountInfoBO> getSubUserVirtualAccountsInfo() {
        return this.subUserVirtualAccountsInfo;
    }

    public SubUserAccountBaseVO setCrossChainSubUserAccountsInfo(java.util.List<CrossChainSubUserAccountInfoBO> crossChainSubUserAccountsInfo) {
        this.crossChainSubUserAccountsInfo = crossChainSubUserAccountsInfo;
        return this;
    }
    public java.util.List<CrossChainSubUserAccountInfoBO> getCrossChainSubUserAccountsInfo() {
        return this.crossChainSubUserAccountsInfo;
    }

}
