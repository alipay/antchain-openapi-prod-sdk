// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mdp.models;

import com.aliyun.tea.*;

public class QuerybyappidResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // app_id
    @NameInMap("app_id")
    public String appId;

    // 手机号或者设备号md5
    @NameInMap("user_id")
    public String userId;

    // 分数列表
    @NameInMap("scores")
    public java.util.List<AppIdQualityScoresDONew> scores;

    // 筛选分数的规则，通过规则的返回，否则 scores 内容是空的
    @NameInMap("rule")
    public String rule;

    // 规则对应的 md5 值，用来区分当前规则的版本
    @NameInMap("rule_md5")
    public String ruleMd5;

    public static QuerybyappidResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerybyappidResponse self = new QuerybyappidResponse();
        return TeaModel.build(map, self);
    }

    public QuerybyappidResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerybyappidResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerybyappidResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerybyappidResponse setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QuerybyappidResponse setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QuerybyappidResponse setScores(java.util.List<AppIdQualityScoresDONew> scores) {
        this.scores = scores;
        return this;
    }
    public java.util.List<AppIdQualityScoresDONew> getScores() {
        return this.scores;
    }

    public QuerybyappidResponse setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public QuerybyappidResponse setRuleMd5(String ruleMd5) {
        this.ruleMd5 = ruleMd5;
        return this;
    }
    public String getRuleMd5() {
        return this.ruleMd5;
    }

}
