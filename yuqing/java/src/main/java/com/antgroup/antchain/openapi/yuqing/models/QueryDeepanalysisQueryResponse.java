// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing.models;

import com.aliyun.tea.*;

public class QueryDeepanalysisQueryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 深度分析任务ID
    @NameInMap("analysis_id")
    public Long analysisId;

    // 分析内容
    @NameInMap("result_json")
    public String resultJson;

    public static QueryDeepanalysisQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeepanalysisQueryResponse self = new QueryDeepanalysisQueryResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeepanalysisQueryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDeepanalysisQueryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDeepanalysisQueryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDeepanalysisQueryResponse setAnalysisId(Long analysisId) {
        this.analysisId = analysisId;
        return this;
    }
    public Long getAnalysisId() {
        return this.analysisId;
    }

    public QueryDeepanalysisQueryResponse setResultJson(String resultJson) {
        this.resultJson = resultJson;
        return this;
    }
    public String getResultJson() {
        return this.resultJson;
    }

}
