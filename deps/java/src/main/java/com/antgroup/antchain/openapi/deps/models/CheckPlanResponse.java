// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CheckPlanResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // data
    @NameInMap("data")
    public String data;

    // error_reasons
    @NameInMap("error_reasons")
    public java.util.List<String> errorReasons;

    // validation_messages
    @NameInMap("validation_messages")
    public String validationMessages;

    public static CheckPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckPlanResponse self = new CheckPlanResponse();
        return TeaModel.build(map, self);
    }

    public CheckPlanResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckPlanResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckPlanResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckPlanResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CheckPlanResponse setErrorReasons(java.util.List<String> errorReasons) {
        this.errorReasons = errorReasons;
        return this;
    }
    public java.util.List<String> getErrorReasons() {
        return this.errorReasons;
    }

    public CheckPlanResponse setValidationMessages(String validationMessages) {
        this.validationMessages = validationMessages;
        return this;
    }
    public String getValidationMessages() {
        return this.validationMessages;
    }

}
