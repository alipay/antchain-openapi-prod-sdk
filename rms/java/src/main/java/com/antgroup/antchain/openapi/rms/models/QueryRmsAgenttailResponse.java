// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryRmsAgenttailResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
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

    public static QueryRmsAgenttailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAgenttailResponse self = new QueryRmsAgenttailResponse();
        return TeaModel.build(map, self);
    }

    public QueryRmsAgenttailResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRmsAgenttailResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsAgenttailResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRmsAgenttailResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryRmsAgenttailResponse setErrorMessage(CallErrorMessage errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public CallErrorMessage getErrorMessage() {
        return this.errorMessage;
    }

    public QueryRmsAgenttailResponse setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
