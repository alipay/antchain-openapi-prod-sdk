// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commonrcsmart.models;

import com.aliyun.tea.*;

public class ConfirmRcApprovalMessageResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 审核结果基类
    @NameInMap("rc_smart_response")
    public RcSmartResponse rcSmartResponse;

    public static ConfirmRcApprovalMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmRcApprovalMessageResponse self = new ConfirmRcApprovalMessageResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmRcApprovalMessageResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ConfirmRcApprovalMessageResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ConfirmRcApprovalMessageResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ConfirmRcApprovalMessageResponse setRcSmartResponse(RcSmartResponse rcSmartResponse) {
        this.rcSmartResponse = rcSmartResponse;
        return this;
    }
    public RcSmartResponse getRcSmartResponse() {
        return this.rcSmartResponse;
    }

}
