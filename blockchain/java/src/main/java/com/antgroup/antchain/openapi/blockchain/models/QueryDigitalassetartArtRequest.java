// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryDigitalassetartArtRequest extends TeaModel {
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

    public static QueryDigitalassetartArtRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDigitalassetartArtRequest self = new QueryDigitalassetartArtRequest();
        return TeaModel.build(map, self);
    }

    public QueryDigitalassetartArtRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDigitalassetartArtRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDigitalassetartArtRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public QueryDigitalassetartArtRequest setArtId(String artId) {
        this.artId = artId;
        return this;
    }
    public String getArtId() {
        return this.artId;
    }

}
