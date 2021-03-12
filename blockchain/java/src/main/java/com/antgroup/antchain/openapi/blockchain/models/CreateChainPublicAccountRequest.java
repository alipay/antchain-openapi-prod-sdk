// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateChainPublicAccountRequest extends TeaModel {
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

    // bizid
    @NameInMap("bizid")
    public String bizid;

    // region_id
    @NameInMap("region_id")
    public String regionId;

    public static CreateChainPublicAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateChainPublicAccountRequest self = new CreateChainPublicAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateChainPublicAccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateChainPublicAccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateChainPublicAccountRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public CreateChainPublicAccountRequest setAccountPubKey(String accountPubKey) {
        this.accountPubKey = accountPubKey;
        return this;
    }
    public String getAccountPubKey() {
        return this.accountPubKey;
    }

    public CreateChainPublicAccountRequest setAccountRecoverPubKey(String accountRecoverPubKey) {
        this.accountRecoverPubKey = accountRecoverPubKey;
        return this;
    }
    public String getAccountRecoverPubKey() {
        return this.accountRecoverPubKey;
    }

    public CreateChainPublicAccountRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public CreateChainPublicAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
