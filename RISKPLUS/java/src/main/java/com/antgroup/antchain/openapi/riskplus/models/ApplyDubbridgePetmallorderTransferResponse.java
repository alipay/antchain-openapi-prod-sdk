// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ApplyDubbridgePetmallorderTransferResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 业务订单
    @NameInMap("biz_order_no")
    public String bizOrderNo;

    // 受理结果：Y-受理成功、N-受理失败
    @NameInMap("settle_result")
    public String settleResult;

    // 失败原因
    @NameInMap("fail_reason")
    public String failReason;

    public static ApplyDubbridgePetmallorderTransferResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyDubbridgePetmallorderTransferResponse self = new ApplyDubbridgePetmallorderTransferResponse();
        return TeaModel.build(map, self);
    }

    public ApplyDubbridgePetmallorderTransferResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyDubbridgePetmallorderTransferResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyDubbridgePetmallorderTransferResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyDubbridgePetmallorderTransferResponse setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public ApplyDubbridgePetmallorderTransferResponse setSettleResult(String settleResult) {
        this.settleResult = settleResult;
        return this;
    }
    public String getSettleResult() {
        return this.settleResult;
    }

    public ApplyDubbridgePetmallorderTransferResponse setFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }
    public String getFailReason() {
        return this.failReason;
    }

}
