// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftx.models;

import com.aliyun.tea.*;

public class ApplyNftTransferRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // NFT发行成功的商品id
    @NameInMap("sku_id")
    @Validation(required = true)
    public Long skuId;

    // C端用户的支付宝uid
    @NameInMap("to_id_no")
    @Validation(required = true)
    public String toIdNo;

    // 仅支持 支付宝账号类型
    @NameInMap("to_id_type")
    @Validation(required = true)
    public String toIdType;

    // 用户在商户购买的订单号，用作幂等字段
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 用户购买订单的价格，单位为分，可以为0；
    @NameInMap("price_cent")
    public Long priceCent;

    // 渠道租户
    @NameInMap("channel_tenant")
    @Validation(required = true)
    public String channelTenant;

    public static ApplyNftTransferRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyNftTransferRequest self = new ApplyNftTransferRequest();
        return TeaModel.build(map, self);
    }

    public ApplyNftTransferRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyNftTransferRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyNftTransferRequest setSkuId(Long skuId) {
        this.skuId = skuId;
        return this;
    }
    public Long getSkuId() {
        return this.skuId;
    }

    public ApplyNftTransferRequest setToIdNo(String toIdNo) {
        this.toIdNo = toIdNo;
        return this;
    }
    public String getToIdNo() {
        return this.toIdNo;
    }

    public ApplyNftTransferRequest setToIdType(String toIdType) {
        this.toIdType = toIdType;
        return this;
    }
    public String getToIdType() {
        return this.toIdType;
    }

    public ApplyNftTransferRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public ApplyNftTransferRequest setPriceCent(Long priceCent) {
        this.priceCent = priceCent;
        return this;
    }
    public Long getPriceCent() {
        return this.priceCent;
    }

    public ApplyNftTransferRequest setChannelTenant(String channelTenant) {
        this.channelTenant = channelTenant;
        return this;
    }
    public String getChannelTenant() {
        return this.channelTenant;
    }

}
