// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class GetIpShopRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // IP商家的链上账户Id
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 宝贝Id(可以是ItemId, 也可以是SkuId或其他Id)
    @NameInMap("good_id")
    @Validation(required = true)
    public String goodId;

    // 类型(1: ItemId)
    @NameInMap("id_type")
    @Validation(required = true)
    public Long idType;

    // 淘宝卖家的官方昵称
    @NameInMap("seller_nick")
    @Validation(required = true)
    public String sellerNick;

    public static GetIpShopRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIpShopRequest self = new GetIpShopRequest();
        return TeaModel.build(map, self);
    }

    public GetIpShopRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetIpShopRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetIpShopRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public GetIpShopRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public GetIpShopRequest setGoodId(String goodId) {
        this.goodId = goodId;
        return this;
    }
    public String getGoodId() {
        return this.goodId;
    }

    public GetIpShopRequest setIdType(Long idType) {
        this.idType = idType;
        return this;
    }
    public Long getIdType() {
        return this.idType;
    }

    public GetIpShopRequest setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
        return this;
    }
    public String getSellerNick() {
        return this.sellerNick;
    }

}
