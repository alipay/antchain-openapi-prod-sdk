// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class UnfreezeChainAccountAntRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // account
    @NameInMap("account")
    public String account;

    // ant_chain_id
    @NameInMap("ant_chain_id")
    @Validation(required = true)
    public String antChainId;

    // region_id
    @NameInMap("region_id")
    @Validation(required = true)
    public String regionId;

    public static UnfreezeChainAccountAntRequest build(java.util.Map<String, ?> map) throws Exception {
        UnfreezeChainAccountAntRequest self = new UnfreezeChainAccountAntRequest();
        return TeaModel.build(map, self);
    }

    public UnfreezeChainAccountAntRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UnfreezeChainAccountAntRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UnfreezeChainAccountAntRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public UnfreezeChainAccountAntRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public UnfreezeChainAccountAntRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
