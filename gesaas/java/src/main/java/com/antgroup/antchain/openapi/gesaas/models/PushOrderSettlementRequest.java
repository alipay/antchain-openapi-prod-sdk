// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class PushOrderSettlementRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商家产品唯一编码，64个字符以内
    @NameInMap("out_product_id")
    @Validation(required = true)
    public String outProductId;

    // 外部订单号(同一个outProductId保证唯一性)，需保证在商家端不重复，64个字符以内
    @NameInMap("out_order_no")
    @Validation(required = true)
    public String outOrderNo;

    // 支付宝/微信/其他  平台订单号
    @NameInMap("trade_no")
    @Validation(required = true)
    public String tradeNo;

    // 支付渠道类型，枚举值：ALIPAY / WECHAT
    @NameInMap("order_type")
    @Validation(required = true)
    public String orderType;

    // 订单金额，单位：分（如 990 表示 9.90元）
    @NameInMap("order_amount")
    @Validation(required = true)
    public Long orderAmount;

    // 扩展参数，JSONString格式
    @NameInMap("ext_info")
    public String extInfo;

    public static PushOrderSettlementRequest build(java.util.Map<String, ?> map) throws Exception {
        PushOrderSettlementRequest self = new PushOrderSettlementRequest();
        return TeaModel.build(map, self);
    }

    public PushOrderSettlementRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushOrderSettlementRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushOrderSettlementRequest setOutProductId(String outProductId) {
        this.outProductId = outProductId;
        return this;
    }
    public String getOutProductId() {
        return this.outProductId;
    }

    public PushOrderSettlementRequest setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
        return this;
    }
    public String getOutOrderNo() {
        return this.outOrderNo;
    }

    public PushOrderSettlementRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public PushOrderSettlementRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public PushOrderSettlementRequest setOrderAmount(Long orderAmount) {
        this.orderAmount = orderAmount;
        return this;
    }
    public Long getOrderAmount() {
        return this.orderAmount;
    }

    public PushOrderSettlementRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
