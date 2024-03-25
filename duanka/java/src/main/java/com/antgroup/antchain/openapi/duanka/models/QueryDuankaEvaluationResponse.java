// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.duanka.models;

import com.aliyun.tea.*;

public class QueryDuankaEvaluationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 模型结果，数组返回
    @NameInMap("result")
    public java.util.List<ModelResult> result;

    // 请求流水ID
    @NameInMap("request_id")
    public String requestId;

    public static QueryDuankaEvaluationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDuankaEvaluationResponse self = new QueryDuankaEvaluationResponse();
        return TeaModel.build(map, self);
    }

    public QueryDuankaEvaluationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDuankaEvaluationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDuankaEvaluationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDuankaEvaluationResponse setResult(java.util.List<ModelResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ModelResult> getResult() {
        return this.result;
    }

    public QueryDuankaEvaluationResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
