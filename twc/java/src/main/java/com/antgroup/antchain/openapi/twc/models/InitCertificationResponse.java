// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class InitCertificationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回值状态码，0000则为成功
    @NameInMap("code")
    public String code;

    // 异常状态时的错误信息
    @NameInMap("message")
    public String message;

    // 后端生成的存证证明申请订单ID
    @NameInMap("order_id")
    public String orderId;

    // 如果是记账模式则为空，其余情况返回支付宝SDK生成的支付内容信息
    @NameInMap("pay_content")
    public String payContent;

    public static InitCertificationResponse build(java.util.Map<String, ?> map) throws Exception {
        InitCertificationResponse self = new InitCertificationResponse();
        return TeaModel.build(map, self);
    }

    public InitCertificationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public InitCertificationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public InitCertificationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public InitCertificationResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InitCertificationResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InitCertificationResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public InitCertificationResponse setPayContent(String payContent) {
        this.payContent = payContent;
        return this;
    }
    public String getPayContent() {
        return this.payContent;
    }

}
