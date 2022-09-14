// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateChainAccountAntkmsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链账户名称
    @NameInMap("account")
    @Validation(required = true, minLength = 1)
    public String account;

    // 链ID
    @NameInMap("ant_chain_id")
    @Validation(required = true, minLength = 1)
    public String antChainId;

    public static CreateChainAccountAntkmsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateChainAccountAntkmsRequest self = new CreateChainAccountAntkmsRequest();
        return TeaModel.build(map, self);
    }

    public CreateChainAccountAntkmsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateChainAccountAntkmsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateChainAccountAntkmsRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public CreateChainAccountAntkmsRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

}
