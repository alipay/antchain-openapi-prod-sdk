// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class SendContractComplainfeedbackResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否反馈成功
    @NameInMap("submit_success")
    public Boolean submitSuccess;

    // 业务处理结果码
    @NameInMap("code")
    public String code;

    // 业务结果描述
    @NameInMap("msg")
    public String msg;

    public static SendContractComplainfeedbackResponse build(java.util.Map<String, ?> map) throws Exception {
        SendContractComplainfeedbackResponse self = new SendContractComplainfeedbackResponse();
        return TeaModel.build(map, self);
    }

    public SendContractComplainfeedbackResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SendContractComplainfeedbackResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SendContractComplainfeedbackResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SendContractComplainfeedbackResponse setSubmitSuccess(Boolean submitSuccess) {
        this.submitSuccess = submitSuccess;
        return this;
    }
    public Boolean getSubmitSuccess() {
        return this.submitSuccess;
    }

    public SendContractComplainfeedbackResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendContractComplainfeedbackResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

}
