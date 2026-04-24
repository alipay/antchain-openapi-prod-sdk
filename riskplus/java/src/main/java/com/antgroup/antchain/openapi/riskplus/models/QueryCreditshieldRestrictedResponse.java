// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryCreditshieldRestrictedResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 请求是否成功
    @NameInMap("success")
    public Boolean success;

    // 数组list,还款概率查询结果
    @NameInMap("query_results")
    public java.util.List<String> queryResults;

    public static QueryCreditshieldRestrictedResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCreditshieldRestrictedResponse self = new QueryCreditshieldRestrictedResponse();
        return TeaModel.build(map, self);
    }

    public QueryCreditshieldRestrictedResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCreditshieldRestrictedResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCreditshieldRestrictedResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCreditshieldRestrictedResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryCreditshieldRestrictedResponse setQueryResults(java.util.List<String> queryResults) {
        this.queryResults = queryResults;
        return this;
    }
    public java.util.List<String> getQueryResults() {
        return this.queryResults;
    }

}
