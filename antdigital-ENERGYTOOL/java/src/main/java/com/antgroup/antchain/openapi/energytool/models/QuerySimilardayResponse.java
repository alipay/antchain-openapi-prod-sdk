// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class QuerySimilardayResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 查询范围内容的最接近相似日，格式：yyyy-MM-dd
    @NameInMap("similar_day")
    public String similarDay;

    // 相似日分析结果
    @NameInMap("analysis_result")
    public java.util.List<SimilarDayAnalysisData> analysisResult;

    public static QuerySimilardayResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySimilardayResponse self = new QuerySimilardayResponse();
        return TeaModel.build(map, self);
    }

    public QuerySimilardayResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySimilardayResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySimilardayResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySimilardayResponse setSimilarDay(String similarDay) {
        this.similarDay = similarDay;
        return this;
    }
    public String getSimilarDay() {
        return this.similarDay;
    }

    public QuerySimilardayResponse setAnalysisResult(java.util.List<SimilarDayAnalysisData> analysisResult) {
        this.analysisResult = analysisResult;
        return this;
    }
    public java.util.List<SimilarDayAnalysisData> getAnalysisResult() {
        return this.analysisResult;
    }

}
