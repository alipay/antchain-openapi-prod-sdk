// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryFhtestFhResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否成功
    @NameInMap("success")
    public Boolean success;

    // 字符串数组
    @NameInMap("query_results")
    public java.util.List<String> queryResults;

    public static QueryFhtestFhResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFhtestFhResponse self = new QueryFhtestFhResponse();
        return TeaModel.build(map, self);
    }

    public QueryFhtestFhResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryFhtestFhResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryFhtestFhResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryFhtestFhResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryFhtestFhResponse setQueryResults(java.util.List<String> queryResults) {
        this.queryResults = queryResults;
        return this;
    }
    public java.util.List<String> getQueryResults() {
        return this.queryResults;
    }

}
