// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class PayAntcloudTradeComboOrderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 页面支付地址
    @NameInMap("pay_url")
    public String payUrl;

    // 支付订单号
    @NameInMap("pay_order_id")
    public String payOrderId;

    // 支付状态，
    // SUCCESS：已支付;
    // INIT：未支付;
    // PROCESS：支付中;
    // CANCEL：取消支付;
    @NameInMap("pay_status")
    public String payStatus;

    // 支付链接超时时间 单位：分钟
    @NameInMap("timeout_minutes")
    public Long timeoutMinutes;

    // 支付链接过期时间
    @NameInMap("expire_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String expireTime;

    public static PayAntcloudTradeComboOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        PayAntcloudTradeComboOrderResponse self = new PayAntcloudTradeComboOrderResponse();
        return TeaModel.build(map, self);
    }

    public PayAntcloudTradeComboOrderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PayAntcloudTradeComboOrderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PayAntcloudTradeComboOrderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PayAntcloudTradeComboOrderResponse setPayUrl(String payUrl) {
        this.payUrl = payUrl;
        return this;
    }
    public String getPayUrl() {
        return this.payUrl;
    }

    public PayAntcloudTradeComboOrderResponse setPayOrderId(String payOrderId) {
        this.payOrderId = payOrderId;
        return this;
    }
    public String getPayOrderId() {
        return this.payOrderId;
    }

    public PayAntcloudTradeComboOrderResponse setPayStatus(String payStatus) {
        this.payStatus = payStatus;
        return this;
    }
    public String getPayStatus() {
        return this.payStatus;
    }

    public PayAntcloudTradeComboOrderResponse setTimeoutMinutes(Long timeoutMinutes) {
        this.timeoutMinutes = timeoutMinutes;
        return this;
    }
    public Long getTimeoutMinutes() {
        return this.timeoutMinutes;
    }

    public PayAntcloudTradeComboOrderResponse setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

}
