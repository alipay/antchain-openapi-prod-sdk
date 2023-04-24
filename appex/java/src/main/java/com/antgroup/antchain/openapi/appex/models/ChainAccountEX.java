// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class ChainAccountEX extends TeaModel {
    // 账户名称
    @NameInMap("account_name")
    public String accountName;

    // 账户地址
    @NameInMap("account_address")
    @Validation(required = true)
    public String accountAddress;

    // 账户类型，枚举，MYCHAIN|ETH
    @NameInMap("account_type")
    @Validation(required = true)
    public String accountType;

    // 链ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    public static ChainAccountEX build(java.util.Map<String, ?> map) throws Exception {
        ChainAccountEX self = new ChainAccountEX();
        return TeaModel.build(map, self);
    }

    public ChainAccountEX setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public ChainAccountEX setAccountAddress(String accountAddress) {
        this.accountAddress = accountAddress;
        return this;
    }
    public String getAccountAddress() {
        return this.accountAddress;
    }

    public ChainAccountEX setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public ChainAccountEX setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

}
