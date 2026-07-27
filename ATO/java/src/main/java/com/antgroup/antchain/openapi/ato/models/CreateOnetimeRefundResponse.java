// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CreateOnetimeRefundResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 外部系统传入的退款请求号
    @NameInMap("refund_request_no")
    public String refundRequestNo;

    // 退款请求状态
    //  ACCEPT: 受理成功
    @NameInMap("status")
    public String status;

    // 请求支付宝的退款单据号
    @NameInMap("refund_order_no")
    public String refundOrderNo;

    // 支付宝交易单号
    @NameInMap("trade_no")
    public String tradeNo;

    public static CreateOnetimeRefundResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOnetimeRefundResponse self = new CreateOnetimeRefundResponse();
        return TeaModel.build(map, self);
    }

    public CreateOnetimeRefundResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateOnetimeRefundResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateOnetimeRefundResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateOnetimeRefundResponse setRefundRequestNo(String refundRequestNo) {
        this.refundRequestNo = refundRequestNo;
        return this;
    }
    public String getRefundRequestNo() {
        return this.refundRequestNo;
    }

    public CreateOnetimeRefundResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateOnetimeRefundResponse setRefundOrderNo(String refundOrderNo) {
        this.refundOrderNo = refundOrderNo;
        return this;
    }
    public String getRefundOrderNo() {
        return this.refundOrderNo;
    }

    public CreateOnetimeRefundResponse setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

}
