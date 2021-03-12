// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunAccount extends TeaModel {
    // ant_chain_id
    @NameInMap("ant_chain_id")
    public String antChainId;

    // account
    @NameInMap("account")
    public String account;

    // account_public_key
    @NameInMap("account_public_key")
    public String accountPublicKey;

    // account_recovery_key
    @NameInMap("account_recovery_key")
    public String accountRecoveryKey;

    // account_status
    @NameInMap("account_status")
    public String accountStatus;

    public static ALiYunAccount build(java.util.Map<String, ?> map) throws Exception {
        ALiYunAccount self = new ALiYunAccount();
        return TeaModel.build(map, self);
    }

    public ALiYunAccount setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public ALiYunAccount setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public ALiYunAccount setAccountPublicKey(String accountPublicKey) {
        this.accountPublicKey = accountPublicKey;
        return this;
    }
    public String getAccountPublicKey() {
        return this.accountPublicKey;
    }

    public ALiYunAccount setAccountRecoveryKey(String accountRecoveryKey) {
        this.accountRecoveryKey = accountRecoveryKey;
        return this;
    }
    public String getAccountRecoveryKey() {
        return this.accountRecoveryKey;
    }

    public ALiYunAccount setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
        return this;
    }
    public String getAccountStatus() {
        return this.accountStatus;
    }

}
