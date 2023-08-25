// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class QueryPersonalSocialincomeResponse extends TeaModel {
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
    @NameInMap("range_score")
    public String rangeScore;

    // 历史稳定性评估
    @NameInMap("history_score")
    public String historyScore;

    // 近期稳定性评估
    @NameInMap("stability_score")
    public String stabilityScore;

    public static QueryPersonalSocialincomeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPersonalSocialincomeResponse self = new QueryPersonalSocialincomeResponse();
        return TeaModel.build(map, self);
    }

    public QueryPersonalSocialincomeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryPersonalSocialincomeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryPersonalSocialincomeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryPersonalSocialincomeResponse setScoreResult(String scoreResult) {
        this.scoreResult = scoreResult;
        return this;
    }
    public String getScoreResult() {
        return this.scoreResult;
    }

    public QueryPersonalSocialincomeResponse setRangeScore(String rangeScore) {
        this.rangeScore = rangeScore;
        return this;
    }
    public String getRangeScore() {
        return this.rangeScore;
    }

    public QueryPersonalSocialincomeResponse setHistoryScore(String historyScore) {
        this.historyScore = historyScore;
        return this;
    }
    public String getHistoryScore() {
        return this.historyScore;
    }

    public QueryPersonalSocialincomeResponse setStabilityScore(String stabilityScore) {
        this.stabilityScore = stabilityScore;
        return this;
    }
    public String getStabilityScore() {
        return this.stabilityScore;
    }

}
