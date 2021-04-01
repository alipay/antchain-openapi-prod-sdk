// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class FreezeDigitalassetartArtAccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 管理员账户
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 艺术品id
    @NameInMap("art_id")
    @Validation(required = true)
    public String artId;

    public static FreezeDigitalassetartArtAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        FreezeDigitalassetartArtAccountRequest self = new FreezeDigitalassetartArtAccountRequest();
        return TeaModel.build(map, self);
    }

    public FreezeDigitalassetartArtAccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public FreezeDigitalassetartArtAccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public FreezeDigitalassetartArtAccountRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public FreezeDigitalassetartArtAccountRequest setArtId(String artId) {
        this.artId = artId;
        return this;
    }
    public String getArtId() {
        return this.artId;
    }

}
