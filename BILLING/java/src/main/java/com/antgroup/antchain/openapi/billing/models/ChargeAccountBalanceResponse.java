// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.billing.models;

import com.aliyun.tea.*;

public class ChargeAccountBalanceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 支付宝网关
    @NameInMap("alipay_gateway")
    public String alipayGateway;

    // 字符编码格式   _input_charset
    @NameInMap("input_charset")
    public String inputCharset;

    // 服务器异步通知页面路径
    @NameInMap("notify_url")
    public String notifyUrl;

    // 商户网站唯一订单号
    @NameInMap("out_trade_no")
    public String outTradeNo;

    // 收款方PID
    @NameInMap("partner")
    public String partner;

    // 支付类型
    @NameInMap("payment_type")
    public String paymentType;

    // 收银台发起页面跳转同步通知页面路径
    @NameInMap("return_url")
    public String returnUrl;

    // 收款方ID
    @NameInMap("seller_id")
    public String sellerId;

    // 调用的接口名
    @NameInMap("service")
    public String service;

    // 签名
    @NameInMap("sign")
    public String sign;

    // 签名类型
    @NameInMap("sign_type")
    public String signType;

    // 商品名称
    @NameInMap("subject")
    public String subject;

    // 交易金额
    @NameInMap("total_fee")
    public String totalFee;

    public static ChargeAccountBalanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ChargeAccountBalanceResponse self = new ChargeAccountBalanceResponse();
        return TeaModel.build(map, self);
    }

    public ChargeAccountBalanceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ChargeAccountBalanceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ChargeAccountBalanceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ChargeAccountBalanceResponse setAlipayGateway(String alipayGateway) {
        this.alipayGateway = alipayGateway;
        return this;
    }
    public String getAlipayGateway() {
        return this.alipayGateway;
    }

    public ChargeAccountBalanceResponse setInputCharset(String inputCharset) {
        this.inputCharset = inputCharset;
        return this;
    }
    public String getInputCharset() {
        return this.inputCharset;
    }

    public ChargeAccountBalanceResponse setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public ChargeAccountBalanceResponse setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
        return this;
    }
    public String getOutTradeNo() {
        return this.outTradeNo;
    }

    public ChargeAccountBalanceResponse setPartner(String partner) {
        this.partner = partner;
        return this;
    }
    public String getPartner() {
        return this.partner;
    }

    public ChargeAccountBalanceResponse setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public ChargeAccountBalanceResponse setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }
    public String getReturnUrl() {
        return this.returnUrl;
    }

    public ChargeAccountBalanceResponse setSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }
    public String getSellerId() {
        return this.sellerId;
    }

    public ChargeAccountBalanceResponse setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public ChargeAccountBalanceResponse setSign(String sign) {
        this.sign = sign;
        return this;
    }
    public String getSign() {
        return this.sign;
    }

    public ChargeAccountBalanceResponse setSignType(String signType) {
        this.signType = signType;
        return this;
    }
    public String getSignType() {
        return this.signType;
    }

    public ChargeAccountBalanceResponse setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public ChargeAccountBalanceResponse setTotalFee(String totalFee) {
        this.totalFee = totalFee;
        return this;
    }
    public String getTotalFee() {
        return this.totalFee;
    }

}
