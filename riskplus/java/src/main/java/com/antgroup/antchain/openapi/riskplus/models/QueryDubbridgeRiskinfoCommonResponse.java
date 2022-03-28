// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeRiskinfoCommonResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 风控信息Json字符串
    @NameInMap("query_result")
    public String queryResult;

    public static QueryDubbridgeRiskinfoCommonResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeRiskinfoCommonResponse self = new QueryDubbridgeRiskinfoCommonResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeRiskinfoCommonResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgeRiskinfoCommonResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgeRiskinfoCommonResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgeRiskinfoCommonResponse setQueryResult(String queryResult) {
        this.queryResult = queryResult;
        return this;
    }
    public String getQueryResult() {
        return this.queryResult;
    }

}
