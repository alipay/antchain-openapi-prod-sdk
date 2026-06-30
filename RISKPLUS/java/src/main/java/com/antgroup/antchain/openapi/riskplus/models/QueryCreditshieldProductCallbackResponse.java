// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryCreditshieldProductCallbackResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 接口请求是否成功
    @NameInMap("success")
    public Boolean success;

    // 查询结果
    @NameInMap("query_results")
    public java.util.List<QueryResult> queryResults;

    public static QueryCreditshieldProductCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCreditshieldProductCallbackResponse self = new QueryCreditshieldProductCallbackResponse();
        return TeaModel.build(map, self);
    }

    public QueryCreditshieldProductCallbackResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCreditshieldProductCallbackResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCreditshieldProductCallbackResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCreditshieldProductCallbackResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryCreditshieldProductCallbackResponse setQueryResults(java.util.List<QueryResult> queryResults) {
        this.queryResults = queryResults;
        return this;
    }
    public java.util.List<QueryResult> getQueryResults() {
        return this.queryResults;
    }

}
