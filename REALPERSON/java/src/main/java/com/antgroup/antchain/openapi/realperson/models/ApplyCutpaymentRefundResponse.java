// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class ApplyCutpaymentRefundResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 退款商户订单号
    @NameInMap("refund_trans_id")
    public String refundTransId;

    // 退款商户流水号
    @NameInMap("refund_serial_no")
    public String refundSerialNo;

    // 退款金额，单位：分 整数
    @NameInMap("refund_amt")
    public String refundAmt;

    public static ApplyCutpaymentRefundResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyCutpaymentRefundResponse self = new ApplyCutpaymentRefundResponse();
        return TeaModel.build(map, self);
    }

    public ApplyCutpaymentRefundResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyCutpaymentRefundResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyCutpaymentRefundResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyCutpaymentRefundResponse setRefundTransId(String refundTransId) {
        this.refundTransId = refundTransId;
        return this;
    }
    public String getRefundTransId() {
        return this.refundTransId;
    }

    public ApplyCutpaymentRefundResponse setRefundSerialNo(String refundSerialNo) {
        this.refundSerialNo = refundSerialNo;
        return this;
    }
    public String getRefundSerialNo() {
        return this.refundSerialNo;
    }

    public ApplyCutpaymentRefundResponse setRefundAmt(String refundAmt) {
        this.refundAmt = refundAmt;
        return this;
    }
    public String getRefundAmt() {
        return this.refundAmt;
    }

}
