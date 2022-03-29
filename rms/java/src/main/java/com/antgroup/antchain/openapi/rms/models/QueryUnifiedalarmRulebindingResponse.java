// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryUnifiedalarmRulebindingResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 告警规则绑定列表
    @NameInMap("rule_bindings")
    public java.util.List<UnifiedAlarmRuleBindingVO> ruleBindings;

    public static QueryUnifiedalarmRulebindingResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUnifiedalarmRulebindingResponse self = new QueryUnifiedalarmRulebindingResponse();
        return TeaModel.build(map, self);
    }

    public QueryUnifiedalarmRulebindingResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryUnifiedalarmRulebindingResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryUnifiedalarmRulebindingResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryUnifiedalarmRulebindingResponse setRuleBindings(java.util.List<UnifiedAlarmRuleBindingVO> ruleBindings) {
        this.ruleBindings = ruleBindings;
        return this;
    }
    public java.util.List<UnifiedAlarmRuleBindingVO> getRuleBindings() {
        return this.ruleBindings;
    }

}
