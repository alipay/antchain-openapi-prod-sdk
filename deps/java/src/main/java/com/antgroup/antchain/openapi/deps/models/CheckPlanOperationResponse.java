// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CheckPlanOperationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // data
    @NameInMap("data")
    public String data;

    // error_messages
    @NameInMap("error_reasons")
    public java.util.List<String> errorReasons;

    // validation_messages
    @NameInMap("validation_messages")
    public String validationMessages;

    public static CheckPlanOperationResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckPlanOperationResponse self = new CheckPlanOperationResponse();
        return TeaModel.build(map, self);
    }

    public CheckPlanOperationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckPlanOperationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckPlanOperationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckPlanOperationResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CheckPlanOperationResponse setErrorReasons(java.util.List<String> errorReasons) {
        this.errorReasons = errorReasons;
        return this;
    }
    public java.util.List<String> getErrorReasons() {
        return this.errorReasons;
    }

    public CheckPlanOperationResponse setValidationMessages(String validationMessages) {
        this.validationMessages = validationMessages;
        return this;
    }
    public String getValidationMessages() {
        return this.validationMessages;
    }

}
