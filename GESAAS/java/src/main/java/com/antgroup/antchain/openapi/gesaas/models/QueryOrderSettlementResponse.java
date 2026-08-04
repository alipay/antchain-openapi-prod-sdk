// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class QueryOrderSettlementResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 商家产品唯一编码，64个字符以内
    @NameInMap("out_product_id")
    public String outProductId;

    // 订单金额，单位：分（如 990 表示 9.90元）
    @NameInMap("total_amount")
    public Long totalAmount;

    // 订单创建时间，格式为yyyy-MM-dd HH:mm:ss
    @NameInMap("order_create_time")
    public String orderCreateTime;

    // 订单支付标题， 150个字符以内
    @NameInMap("pay_subject")
    public String paySubject;

    // 支付宝支付订单号，用于拉起主动支付页面
    @NameInMap("trade_no")
    public String tradeNo;

    // 支付详情
    @NameInMap("order_pay_info")
    public OrderPayInfo orderPayInfo;

    // 分账详情
    @NameInMap("order_split_info")
    public OrderSplitInfo orderSplitInfo;

    // 支付渠道是ALIPAY场景下-支付宝用户2088xxxx
    @NameInMap("pay_channel_user_id")
    public String payChannelUserId;

    // 支付渠道，默认：ALIPAY
    @NameInMap("pay_channel")
    public String payChannel;

    // 支付产品，默认：JSAPI
    @NameInMap("pay_product")
    public String payProduct;

    public static QueryOrderSettlementResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderSettlementResponse self = new QueryOrderSettlementResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrderSettlementResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryOrderSettlementResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryOrderSettlementResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryOrderSettlementResponse setOutProductId(String outProductId) {
        this.outProductId = outProductId;
        return this;
    }
    public String getOutProductId() {
        return this.outProductId;
    }

    public QueryOrderSettlementResponse setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public Long getTotalAmount() {
        return this.totalAmount;
    }

    public QueryOrderSettlementResponse setOrderCreateTime(String orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
        return this;
    }
    public String getOrderCreateTime() {
        return this.orderCreateTime;
    }

    public QueryOrderSettlementResponse setPaySubject(String paySubject) {
        this.paySubject = paySubject;
        return this;
    }
    public String getPaySubject() {
        return this.paySubject;
    }

    public QueryOrderSettlementResponse setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public QueryOrderSettlementResponse setOrderPayInfo(OrderPayInfo orderPayInfo) {
        this.orderPayInfo = orderPayInfo;
        return this;
    }
    public OrderPayInfo getOrderPayInfo() {
        return this.orderPayInfo;
    }

    public QueryOrderSettlementResponse setOrderSplitInfo(OrderSplitInfo orderSplitInfo) {
        this.orderSplitInfo = orderSplitInfo;
        return this;
    }
    public OrderSplitInfo getOrderSplitInfo() {
        return this.orderSplitInfo;
    }

    public QueryOrderSettlementResponse setPayChannelUserId(String payChannelUserId) {
        this.payChannelUserId = payChannelUserId;
        return this;
    }
    public String getPayChannelUserId() {
        return this.payChannelUserId;
    }

    public QueryOrderSettlementResponse setPayChannel(String payChannel) {
        this.payChannel = payChannel;
        return this;
    }
    public String getPayChannel() {
        return this.payChannel;
    }

    public QueryOrderSettlementResponse setPayProduct(String payProduct) {
        this.payProduct = payProduct;
        return this;
    }
    public String getPayProduct() {
        return this.payProduct;
    }

}
