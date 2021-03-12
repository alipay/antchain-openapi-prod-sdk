// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateChainAccountAntRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // account
    @NameInMap("account")
    public String account;

    // account_pub_key
    @NameInMap("account_pub_key")
    public String accountPubKey;

    // account_recover_pub_key
    @NameInMap("account_recover_pub_key")
    public String accountRecoverPubKey;

    // ant_chain_id
    @NameInMap("ant_chain_id")
    public String antChainId;

    public static CreateChainAccountAntRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateChainAccountAntRequest self = new CreateChainAccountAntRequest();
        return TeaModel.build(map, self);
    }

    public CreateChainAccountAntRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateChainAccountAntRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateChainAccountAntRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public CreateChainAccountAntRequest setAccountPubKey(String accountPubKey) {
        this.accountPubKey = accountPubKey;
        return this;
    }
    public String getAccountPubKey() {
        return this.accountPubKey;
    }

    public CreateChainAccountAntRequest setAccountRecoverPubKey(String accountRecoverPubKey) {
        this.accountRecoverPubKey = accountRecoverPubKey;
        return this;
    }
    public String getAccountRecoverPubKey() {
        return this.accountRecoverPubKey;
    }

    public CreateChainAccountAntRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

}
