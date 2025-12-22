// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mdpapi.models;

import com.aliyun.tea.*;

public class QuerybyappidAntdigitalMdpResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // appid
    @NameInMap("appid")
    public String appid;

    // 手机号或者设备号md5
    @NameInMap("userid")
    public String userid;

    // 分数列表
    @NameInMap("scores")
    public java.util.List<AppIdQualityScoresDONew> scores;

    // 筛选分数的规则，通过规则的返回，否则 scores 内容是空的
    @NameInMap("rule")
    public String rule;

    // 规则对应的 md5 值，用来区分当前规则的版本
    @NameInMap("rulemd5")
    public String rulemd5;

    public static QuerybyappidAntdigitalMdpResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerybyappidAntdigitalMdpResponse self = new QuerybyappidAntdigitalMdpResponse();
        return TeaModel.build(map, self);
    }

    public QuerybyappidAntdigitalMdpResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerybyappidAntdigitalMdpResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerybyappidAntdigitalMdpResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerybyappidAntdigitalMdpResponse setAppid(String appid) {
        this.appid = appid;
        return this;
    }
    public String getAppid() {
        return this.appid;
    }

    public QuerybyappidAntdigitalMdpResponse setUserid(String userid) {
        this.userid = userid;
        return this;
    }
    public String getUserid() {
        return this.userid;
    }

    public QuerybyappidAntdigitalMdpResponse setScores(java.util.List<AppIdQualityScoresDONew> scores) {
        this.scores = scores;
        return this;
    }
    public java.util.List<AppIdQualityScoresDONew> getScores() {
        return this.scores;
    }

    public QuerybyappidAntdigitalMdpResponse setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public QuerybyappidAntdigitalMdpResponse setRulemd5(String rulemd5) {
        this.rulemd5 = rulemd5;
        return this;
    }
    public String getRulemd5() {
        return this.rulemd5;
    }

}
