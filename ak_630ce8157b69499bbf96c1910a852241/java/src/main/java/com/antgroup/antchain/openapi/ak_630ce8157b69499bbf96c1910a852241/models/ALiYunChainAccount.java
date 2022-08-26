// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_630ce8157b69499bbf96c1910a852241.models;

import com.aliyun.tea.*;

public class ALiYunChainAccount extends TeaModel {
    // account
    @NameInMap("account")
    public String account;

    // account_private_key
    @NameInMap("account_private_key")
    public String accountPrivateKey;

    // account_public_key
    @NameInMap("account_public_key")
    public String accountPublicKey;

    // account_recover_private_key
    @NameInMap("account_recover_private_key")
    public String accountRecoverPrivateKey;

    // account_recover_public_key
    @NameInMap("account_recover_public_key")
    public String accountRecoverPublicKey;

    // ant_chain_id
    @NameInMap("ant_chain_id")
    public String antChainId;

    public static ALiYunChainAccount build(java.util.Map<String, ?> map) throws Exception {
        ALiYunChainAccount self = new ALiYunChainAccount();
        return TeaModel.build(map, self);
    }

    public ALiYunChainAccount setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public ALiYunChainAccount setAccountPrivateKey(String accountPrivateKey) {
        this.accountPrivateKey = accountPrivateKey;
        return this;
    }
    public String getAccountPrivateKey() {
        return this.accountPrivateKey;
    }

    public ALiYunChainAccount setAccountPublicKey(String accountPublicKey) {
        this.accountPublicKey = accountPublicKey;
        return this;
    }
    public String getAccountPublicKey() {
        return this.accountPublicKey;
    }

    public ALiYunChainAccount setAccountRecoverPrivateKey(String accountRecoverPrivateKey) {
        this.accountRecoverPrivateKey = accountRecoverPrivateKey;
        return this;
    }
    public String getAccountRecoverPrivateKey() {
        return this.accountRecoverPrivateKey;
    }

    public ALiYunChainAccount setAccountRecoverPublicKey(String accountRecoverPublicKey) {
        this.accountRecoverPublicKey = accountRecoverPublicKey;
        return this;
    }
    public String getAccountRecoverPublicKey() {
        return this.accountRecoverPublicKey;
    }

    public ALiYunChainAccount setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

}
