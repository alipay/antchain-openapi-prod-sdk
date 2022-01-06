// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ListSgFaulttolerancerulesResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // rule列表
    @NameInMap("rule_models")
    public java.util.List<FaultToleranceRuleModel> ruleModels;

    public static ListSgFaulttolerancerulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSgFaulttolerancerulesResponse self = new ListSgFaulttolerancerulesResponse();
        return TeaModel.build(map, self);
    }

    public ListSgFaulttolerancerulesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListSgFaulttolerancerulesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListSgFaulttolerancerulesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListSgFaulttolerancerulesResponse setRuleModels(java.util.List<FaultToleranceRuleModel> ruleModels) {
        this.ruleModels = ruleModels;
        return this;
    }
    public java.util.List<FaultToleranceRuleModel> getRuleModels() {
        return this.ruleModels;
    }

}
