// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class BindIpShopRequest extends TeaModel {
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

    // 淘宝卖家官方昵称
    @NameInMap("seller_nick")
    @Validation(required = true)
    public String sellerNick;

    // 授权渠道名称(1: 淘宝网)
    @NameInMap("channel_type")
    @Validation(required = true)
    public Long channelType;

    // 数据授权方式(1: 淘宝开放平台)
    @NameInMap("auth_type")
    @Validation(required = true)
    public Long authType;

    public static BindIpShopRequest build(java.util.Map<String, ?> map) throws Exception {
        BindIpShopRequest self = new BindIpShopRequest();
        return TeaModel.build(map, self);
    }

    public BindIpShopRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindIpShopRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BindIpShopRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public BindIpShopRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public BindIpShopRequest setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
        return this;
    }
    public String getSellerNick() {
        return this.sellerNick;
    }

    public BindIpShopRequest setChannelType(Long channelType) {
        this.channelType = channelType;
        return this;
    }
    public Long getChannelType() {
        return this.channelType;
    }

    public BindIpShopRequest setAuthType(Long authType) {
        this.authType = authType;
        return this;
    }
    public Long getAuthType() {
        return this.authType;
    }

}
