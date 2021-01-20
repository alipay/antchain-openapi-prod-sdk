// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CheckPlanOperationResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

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
