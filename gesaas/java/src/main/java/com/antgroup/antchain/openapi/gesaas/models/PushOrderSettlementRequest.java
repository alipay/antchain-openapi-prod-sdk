// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class PushOrderSettlementRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求流水号，由商家自定义。64个字符以内，仅可包含字母、数字、下划线。需保证在商户端不重复
    @NameInMap("out_request_no")
    @Validation(required = true)
    public String outRequestNo;

    // 商家产品唯一编码，64个字符以内
    @NameInMap("out_product_id")
    @Validation(required = true)
    public String outProductId;

    // 外部订单号，需保证在商家端不重复
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

    // 分账模式，目前有两种分账同步执行sync，分账异步执行async，不传默认同步执行
    // 同步执行: sync，异步执行: async
    @NameInMap("royalty_mode")
    public String royaltyMode;

    // 扩展信息
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

    public PushOrderSettlementRequest setOutRequestNo(String outRequestNo) {
        this.outRequestNo = outRequestNo;
        return this;
    }
    public String getOutRequestNo() {
        return this.outRequestNo;
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

    public PushOrderSettlementRequest setRoyaltyMode(String royaltyMode) {
        this.royaltyMode = royaltyMode;
        return this;
    }
    public String getRoyaltyMode() {
        return this.royaltyMode;
    }

    public PushOrderSettlementRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
