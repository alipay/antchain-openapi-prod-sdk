// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryStackAlarmruleResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 告警套餐配置数组
    @NameInMap("alarm_rules")
    public java.util.List<StackAlarmRule> alarmRules;

    public static QueryStackAlarmruleResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStackAlarmruleResponse self = new QueryStackAlarmruleResponse();
        return TeaModel.build(map, self);
    }

    public QueryStackAlarmruleResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryStackAlarmruleResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryStackAlarmruleResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryStackAlarmruleResponse setAlarmRules(java.util.List<StackAlarmRule> alarmRules) {
        this.alarmRules = alarmRules;
        return this;
    }
    public java.util.List<StackAlarmRule> getAlarmRules() {
        return this.alarmRules;
    }

}
