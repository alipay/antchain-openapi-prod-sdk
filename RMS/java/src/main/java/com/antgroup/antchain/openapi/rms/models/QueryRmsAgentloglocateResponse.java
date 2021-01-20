// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryRmsAgentloglocateResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // success
    @NameInMap("success")
    public Boolean success;

    // error_message
    @NameInMap("error_message")
    public CallErrorMessage errorMessage;

    // result
    @NameInMap("result")
    public String result;

    public static QueryRmsAgentloglocateResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAgentloglocateResponse self = new QueryRmsAgentloglocateResponse();
        return TeaModel.build(map, self);
    }

    public QueryRmsAgentloglocateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRmsAgentloglocateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsAgentloglocateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRmsAgentloglocateResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryRmsAgentloglocateResponse setErrorMessage(CallErrorMessage errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public CallErrorMessage getErrorMessage() {
        return this.errorMessage;
    }

    public QueryRmsAgentloglocateResponse setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
