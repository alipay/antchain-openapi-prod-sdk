// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryRmsAgentbrowserResponse extends TeaModel {
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

    public static QueryRmsAgentbrowserResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAgentbrowserResponse self = new QueryRmsAgentbrowserResponse();
        return TeaModel.build(map, self);
    }

    public QueryRmsAgentbrowserResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRmsAgentbrowserResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsAgentbrowserResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRmsAgentbrowserResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryRmsAgentbrowserResponse setErrorMessage(CallErrorMessage errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public CallErrorMessage getErrorMessage() {
        return this.errorMessage;
    }

    public QueryRmsAgentbrowserResponse setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
