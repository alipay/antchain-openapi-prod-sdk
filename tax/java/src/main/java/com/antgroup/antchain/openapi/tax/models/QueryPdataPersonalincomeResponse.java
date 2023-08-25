// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class QueryPdataPersonalincomeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 查询结果
    @NameInMap("score_result")
    public String scoreResult;

    // 收入评分
    @NameInMap("income_score")
    public String incomeScore;

    public static QueryPdataPersonalincomeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPdataPersonalincomeResponse self = new QueryPdataPersonalincomeResponse();
        return TeaModel.build(map, self);
    }

    public QueryPdataPersonalincomeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryPdataPersonalincomeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryPdataPersonalincomeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryPdataPersonalincomeResponse setScoreResult(String scoreResult) {
        this.scoreResult = scoreResult;
        return this;
    }
    public String getScoreResult() {
        return this.scoreResult;
    }

    public QueryPdataPersonalincomeResponse setIncomeScore(String incomeScore) {
        this.incomeScore = incomeScore;
        return this;
    }
    public String getIncomeScore() {
        return this.incomeScore;
    }

}
