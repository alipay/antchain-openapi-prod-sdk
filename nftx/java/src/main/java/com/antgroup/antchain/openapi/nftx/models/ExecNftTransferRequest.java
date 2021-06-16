// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftx.models;

import com.aliyun.tea.*;

public class ExecNftTransferRequest extends TeaModel {
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

    // C端用户的支付宝账号类型
    @NameInMap("to_id_type")
    @Validation(required = true)
    public String toIdType;

    // 用户在商户购买的订单号，用作幂等字段
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 用户购买订单的时间
    @NameInMap("order_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String orderTime;

    // 用户购买订单的价格，可以为0；用户的购买历史记录会展示
    @NameInMap("price_cent")
    public Long priceCent;

    public static ExecNftTransferRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecNftTransferRequest self = new ExecNftTransferRequest();
        return TeaModel.build(map, self);
    }

    public ExecNftTransferRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecNftTransferRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecNftTransferRequest setSkuId(Long skuId) {
        this.skuId = skuId;
        return this;
    }
    public Long getSkuId() {
        return this.skuId;
    }

    public ExecNftTransferRequest setToIdNo(String toIdNo) {
        this.toIdNo = toIdNo;
        return this;
    }
    public String getToIdNo() {
        return this.toIdNo;
    }

    public ExecNftTransferRequest setToIdType(String toIdType) {
        this.toIdType = toIdType;
        return this;
    }
    public String getToIdType() {
        return this.toIdType;
    }

    public ExecNftTransferRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public ExecNftTransferRequest setOrderTime(String orderTime) {
        this.orderTime = orderTime;
        return this;
    }
    public String getOrderTime() {
        return this.orderTime;
    }

    public ExecNftTransferRequest setPriceCent(Long priceCent) {
        this.priceCent = priceCent;
        return this;
    }
    public Long getPriceCent() {
        return this.priceCent;
    }

}
