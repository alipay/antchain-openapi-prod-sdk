// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftc.models;

import com.aliyun.tea.*;

public class ApplyNftTransferRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 藏品标识sku
    @NameInMap("sku_id")
    @Validation(required = true)
    public Long skuId;

    // 被转入用户的支付宝uid和手机号
    @NameInMap("to_id_no")
    @Validation(required = true)
    public String toIdNo;

    // 参照idType枚举
    @NameInMap("to_id_type")
    @Validation(required = true)
    public String toIdType;

    // 用户购买价格，可以为0，单位分
    @NameInMap("price_cent")
    @Validation(required = true)
    public Long priceCent;

    // 用户在商户购买的订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 调用方渠道租户，传租户id即可
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

    public ApplyNftTransferRequest setPriceCent(Long priceCent) {
        this.priceCent = priceCent;
        return this;
    }
    public Long getPriceCent() {
        return this.priceCent;
    }

    public ApplyNftTransferRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public ApplyNftTransferRequest setChannelTenant(String channelTenant) {
        this.channelTenant = channelTenant;
        return this;
    }
    public String getChannelTenant() {
        return this.channelTenant;
    }

}
