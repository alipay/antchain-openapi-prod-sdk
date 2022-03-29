// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class GetUnifiedalarmRuleResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 告警规则详情
    @NameInMap("alarm_rule")
    public UnifiedAlarmRuleVO alarmRule;

    public static GetUnifiedalarmRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUnifiedalarmRuleResponse self = new GetUnifiedalarmRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetUnifiedalarmRuleResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetUnifiedalarmRuleResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetUnifiedalarmRuleResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetUnifiedalarmRuleResponse setAlarmRule(UnifiedAlarmRuleVO alarmRule) {
        this.alarmRule = alarmRule;
        return this;
    }
    public UnifiedAlarmRuleVO getAlarmRule() {
        return this.alarmRule;
    }

}
