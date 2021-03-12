// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class UnfreezeDigitalassetartArtAccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 管理员账户id
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 艺术品id
    @NameInMap("art_id")
    @Validation(required = true)
    public String artId;

    public static UnfreezeDigitalassetartArtAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        UnfreezeDigitalassetartArtAccountRequest self = new UnfreezeDigitalassetartArtAccountRequest();
        return TeaModel.build(map, self);
    }

    public UnfreezeDigitalassetartArtAccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UnfreezeDigitalassetartArtAccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UnfreezeDigitalassetartArtAccountRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public UnfreezeDigitalassetartArtAccountRequest setArtId(String artId) {
        this.artId = artId;
        return this;
    }
    public String getArtId() {
        return this.artId;
    }

}
