// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class SetDigitalassetartArtTradeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 拥有者链上地址
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 艺术品唯一id
    @NameInMap("art_id")
    @Validation(required = true)
    public String artId;

    public static SetDigitalassetartArtTradeRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDigitalassetartArtTradeRequest self = new SetDigitalassetartArtTradeRequest();
        return TeaModel.build(map, self);
    }

    public SetDigitalassetartArtTradeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetDigitalassetartArtTradeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SetDigitalassetartArtTradeRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public SetDigitalassetartArtTradeRequest setArtId(String artId) {
        this.artId = artId;
        return this;
    }
    public String getArtId() {
        return this.artId;
    }

}
