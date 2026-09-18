// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class ApplyPoiRefundResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 退款单号（回显）
    @NameInMap("refund_no")
    @Validation(required = true)
    public String refundNo;

    // 退款状态：INIT-已受理 / PROCESSING-处理中 / SUCCESS-退款成功 / FAILED-退款失败
    @NameInMap("refund_status")
    @Validation(required = true)
    public String refundStatus;

    // 受理/拒绝说明（在途拦截整单拒绝时携带拆分提示；成功受理为空）
    @NameInMap("remark")
    public String remark;

    public static ApplyPoiRefundResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyPoiRefundResponse self = new ApplyPoiRefundResponse();
        return TeaModel.build(map, self);
    }

    public ApplyPoiRefundResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyPoiRefundResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyPoiRefundResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyPoiRefundResponse setRefundNo(String refundNo) {
        this.refundNo = refundNo;
        return this;
    }
    public String getRefundNo() {
        return this.refundNo;
    }

    public ApplyPoiRefundResponse setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
        return this;
    }
    public String getRefundStatus() {
        return this.refundStatus;
    }

    public ApplyPoiRefundResponse setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
