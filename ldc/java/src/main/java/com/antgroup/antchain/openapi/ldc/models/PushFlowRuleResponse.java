// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class PushFlowRuleResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否灰度环境
    @NameInMap("gray")
    public Boolean gray;

    // 推送结果
    @NameInMap("rule_result_list")
    public java.util.List<PushRuleResult> ruleResultList;

    public static PushFlowRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        PushFlowRuleResponse self = new PushFlowRuleResponse();
        return TeaModel.build(map, self);
    }

    public PushFlowRuleResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PushFlowRuleResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushFlowRuleResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PushFlowRuleResponse setGray(Boolean gray) {
        this.gray = gray;
        return this;
    }
    public Boolean getGray() {
        return this.gray;
    }

    public PushFlowRuleResponse setRuleResultList(java.util.List<PushRuleResult> ruleResultList) {
        this.ruleResultList = ruleResultList;
        return this;
    }
    public java.util.List<PushRuleResult> getRuleResultList() {
        return this.ruleResultList;
    }

}
