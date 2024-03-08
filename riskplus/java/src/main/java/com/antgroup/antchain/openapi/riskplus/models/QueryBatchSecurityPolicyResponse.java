// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryBatchSecurityPolicyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 查询结果是否成功
    @NameInMap("success")
    public Boolean success;

    // 批量查询结果
    @NameInMap("query_results")
    public java.util.List<BatchQueryResult> queryResults;

    public static QueryBatchSecurityPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBatchSecurityPolicyResponse self = new QueryBatchSecurityPolicyResponse();
        return TeaModel.build(map, self);
    }

    public QueryBatchSecurityPolicyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBatchSecurityPolicyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBatchSecurityPolicyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBatchSecurityPolicyResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryBatchSecurityPolicyResponse setQueryResults(java.util.List<BatchQueryResult> queryResults) {
        this.queryResults = queryResults;
        return this;
    }
    public java.util.List<BatchQueryResult> getQueryResults() {
        return this.queryResults;
    }

}
