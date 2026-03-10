// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ApplyDubbridgeCreditLxResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 天枢客户编号
    @NameInMap("custom_no")
    public String customNo;

    // 额度授信申请编号
    @NameInMap("credit_no")
    public String creditNo;

    // 授信审核状态，
    // 0. 授信成功
    // 1. 授信失败
    // 2. 授信中
    @NameInMap("audit_state")
    public Long auditState;

    // 业务处理描述信息
    @NameInMap("msg")
    public String msg;

    // 业务错误码，
    // 无异常=0 ，不同异常，返回不同的code
    @NameInMap("error_code")
    public String errorCode;

    public static ApplyDubbridgeCreditLxResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyDubbridgeCreditLxResponse self = new ApplyDubbridgeCreditLxResponse();
        return TeaModel.build(map, self);
    }

    public ApplyDubbridgeCreditLxResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyDubbridgeCreditLxResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyDubbridgeCreditLxResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyDubbridgeCreditLxResponse setCustomNo(String customNo) {
        this.customNo = customNo;
        return this;
    }
    public String getCustomNo() {
        return this.customNo;
    }

    public ApplyDubbridgeCreditLxResponse setCreditNo(String creditNo) {
        this.creditNo = creditNo;
        return this;
    }
    public String getCreditNo() {
        return this.creditNo;
    }

    public ApplyDubbridgeCreditLxResponse setAuditState(Long auditState) {
        this.auditState = auditState;
        return this;
    }
    public Long getAuditState() {
        return this.auditState;
    }

    public ApplyDubbridgeCreditLxResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public ApplyDubbridgeCreditLxResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

}
