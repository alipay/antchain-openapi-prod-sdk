// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunChainAccount extends TeaModel {
    // account_private_key
    /**
     * <strong>example:</strong>
     * <p>account_private_key</p>
     */
    @NameInMap("account_private_key")
    public String accountPrivateKey;

    // account_public_key
    /**
     * <strong>example:</strong>
     * <p>account_public_key</p>
     */
    @NameInMap("account_public_key")
    public String accountPublicKey;

    // account_recover_private_key
    /**
     * <strong>example:</strong>
     * <p>account_recover_private_key</p>
     */
    @NameInMap("account_recover_private_key")
    public String accountRecoverPrivateKey;

    // account_recover_public_key
    /**
     * <strong>example:</strong>
     * <p>account_recover_public_key</p>
     */
    @NameInMap("account_recover_public_key")
    public String accountRecoverPublicKey;

    // ant_chain_id
    /**
     * <strong>example:</strong>
     * <p>ant_chain_id</p>
     */
    @NameInMap("ant_chain_id")
    public String antChainId;

    // account
    /**
     * <strong>example:</strong>
     * <p>account</p>
     */
    @NameInMap("account")
    public String account;

    public static ALiYunChainAccount build(java.util.Map<String, ?> map) throws Exception {
        ALiYunChainAccount self = new ALiYunChainAccount();
        return TeaModel.build(map, self);
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

    public ALiYunChainAccount setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

}
