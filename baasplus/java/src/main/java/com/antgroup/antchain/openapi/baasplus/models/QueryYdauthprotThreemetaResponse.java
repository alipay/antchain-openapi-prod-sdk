// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryYdauthprotThreemetaResponse extends TeaModel {
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

    public static QueryYdauthprotThreemetaResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryYdauthprotThreemetaResponse self = new QueryYdauthprotThreemetaResponse();
        return TeaModel.build(map, self);
    }

    public QueryYdauthprotThreemetaResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryYdauthprotThreemetaResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryYdauthprotThreemetaResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryYdauthprotThreemetaResponse setPassed(Boolean passed) {
        this.passed = passed;
        return this;
    }
    public Boolean getPassed() {
        return this.passed;
    }

    public QueryYdauthprotThreemetaResponse setScore(String score) {
        this.score = score;
        return this;
    }
    public String getScore() {
        return this.score;
    }

    public QueryYdauthprotThreemetaResponse setStrategies(java.util.List<String> strategies) {
        this.strategies = strategies;
        return this;
    }
    public java.util.List<String> getStrategies() {
        return this.strategies;
    }

    public QueryYdauthprotThreemetaResponse setDecision(String decision) {
        this.decision = decision;
        return this;
    }
    public String getDecision() {
        return this.decision;
    }

}
