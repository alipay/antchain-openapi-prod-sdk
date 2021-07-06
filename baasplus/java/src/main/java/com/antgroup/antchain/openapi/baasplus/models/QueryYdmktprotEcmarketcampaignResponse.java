// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryYdmktprotEcmarketcampaignResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 核验是否通过
    @NameInMap("passed")
    public Boolean passed;

    // 风险分
    @NameInMap("score")
    public String score;

    // 命中的策略列表
    @NameInMap("strategies")
    public java.util.List<String> strategies;

    // 风险决策结果
    @NameInMap("decision")
    public String decision;

    public static QueryYdmktprotEcmarketcampaignResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryYdmktprotEcmarketcampaignResponse self = new QueryYdmktprotEcmarketcampaignResponse();
        return TeaModel.build(map, self);
    }

    public QueryYdmktprotEcmarketcampaignResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryYdmktprotEcmarketcampaignResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryYdmktprotEcmarketcampaignResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryYdmktprotEcmarketcampaignResponse setPassed(Boolean passed) {
        this.passed = passed;
        return this;
    }
    public Boolean getPassed() {
        return this.passed;
    }

    public QueryYdmktprotEcmarketcampaignResponse setScore(String score) {
        this.score = score;
        return this;
    }
    public String getScore() {
        return this.score;
    }

    public QueryYdmktprotEcmarketcampaignResponse setStrategies(java.util.List<String> strategies) {
        this.strategies = strategies;
        return this;
    }
    public java.util.List<String> getStrategies() {
        return this.strategies;
    }

    public QueryYdmktprotEcmarketcampaignResponse setDecision(String decision) {
        this.decision = decision;
        return this;
    }
    public String getDecision() {
        return this.decision;
    }

}
