// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ApplyChainAccountAntRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // account
    @NameInMap("account")
    public String account;

    // ant_chain_id
    @NameInMap("ant_chain_id")
    public String antChainId;

    // password
    @NameInMap("password")
    public String password;

    // recover_password
    @NameInMap("recover_password")
    public String recoverPassword;

    public static ApplyChainAccountAntRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyChainAccountAntRequest self = new ApplyChainAccountAntRequest();
        return TeaModel.build(map, self);
    }

    public ApplyChainAccountAntRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyChainAccountAntRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyChainAccountAntRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public ApplyChainAccountAntRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public ApplyChainAccountAntRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ApplyChainAccountAntRequest setRecoverPassword(String recoverPassword) {
        this.recoverPassword = recoverPassword;
        return this;
    }
    public String getRecoverPassword() {
        return this.recoverPassword;
    }

}
