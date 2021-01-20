// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class ExecRmsUniversalcleankeyResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // error_message
    @NameInMap("error_message")
    public CallErrorMessage errorMessage;

    // part_suc
    @NameInMap("part_suc")
    public Boolean partSuc;

    // result
    @NameInMap("result")
    public String result;

    // success
    @NameInMap("success")
    public Boolean success;

    public static ExecRmsUniversalcleankeyResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecRmsUniversalcleankeyResponse self = new ExecRmsUniversalcleankeyResponse();
        return TeaModel.build(map, self);
    }

    public ExecRmsUniversalcleankeyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecRmsUniversalcleankeyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecRmsUniversalcleankeyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecRmsUniversalcleankeyResponse setErrorMessage(CallErrorMessage errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public CallErrorMessage getErrorMessage() {
        return this.errorMessage;
    }

    public ExecRmsUniversalcleankeyResponse setPartSuc(Boolean partSuc) {
        this.partSuc = partSuc;
        return this;
    }
    public Boolean getPartSuc() {
        return this.partSuc;
    }

    public ExecRmsUniversalcleankeyResponse setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public ExecRmsUniversalcleankeyResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
