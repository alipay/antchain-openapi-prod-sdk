// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_95f484639d924779ae4d8ba7a4555321.models;

import com.aliyun.tea.*;

public class QueryAntcloudDuankaDuankaEvaluationResponse extends TeaModel {
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

    public static QueryAntcloudDuankaDuankaEvaluationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudDuankaDuankaEvaluationResponse self = new QueryAntcloudDuankaDuankaEvaluationResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudDuankaDuankaEvaluationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntcloudDuankaDuankaEvaluationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntcloudDuankaDuankaEvaluationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntcloudDuankaDuankaEvaluationResponse setResult(java.util.List<ModelResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ModelResult> getResult() {
        return this.result;
    }

    public QueryAntcloudDuankaDuankaEvaluationResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
