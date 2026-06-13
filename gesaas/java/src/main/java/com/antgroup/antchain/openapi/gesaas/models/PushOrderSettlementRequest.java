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

    // 外部订单号，需保证在商家端不重复，64个字符以内，每次发起需定义唯一的outOrderNo(包括重试)
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

    // true：是最终分账，分账完成后资金自动解冻
    // false：非最终分账，资金保持冻结
    // 默认值：true
    @NameInMap("is_final_split")
    public Boolean isFinalSplit;

    // 订单产生时间，格式为yyyy-MM-dd HH:mm:ss
    @NameInMap("out_order_time")
    @Validation(required = true)
    public String outOrderTime;

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

    public PushOrderSettlementRequest setIsFinalSplit(Boolean isFinalSplit) {
        this.isFinalSplit = isFinalSplit;
        return this;
    }
    public Boolean getIsFinalSplit() {
        return this.isFinalSplit;
    }

    public PushOrderSettlementRequest setOutOrderTime(String outOrderTime) {
        this.outOrderTime = outOrderTime;
        return this;
    }
    public String getOutOrderTime() {
        return this.outOrderTime;
    }

}
