// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class PayComboOrderResponse extends TeaModel {
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

    public static PayComboOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        PayComboOrderResponse self = new PayComboOrderResponse();
        return TeaModel.build(map, self);
    }

    public PayComboOrderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PayComboOrderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PayComboOrderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PayComboOrderResponse setPayUrl(String payUrl) {
        this.payUrl = payUrl;
        return this;
    }
    public String getPayUrl() {
        return this.payUrl;
    }

    public PayComboOrderResponse setPayOrderId(String payOrderId) {
        this.payOrderId = payOrderId;
        return this;
    }
    public String getPayOrderId() {
        return this.payOrderId;
    }

    public PayComboOrderResponse setPayStatus(String payStatus) {
        this.payStatus = payStatus;
        return this;
    }
    public String getPayStatus() {
        return this.payStatus;
    }

}
