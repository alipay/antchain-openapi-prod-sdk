// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ListSidecarRuleResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // sidecar规则详情列表
    @NameInMap("sidecar_rules")
    public java.util.List<SidecarRule> sidecarRules;

    // 总记录条数
    @NameInMap("total_count")
    public Long totalCount;

    public static ListSidecarRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSidecarRuleResponse self = new ListSidecarRuleResponse();
        return TeaModel.build(map, self);
    }

    public ListSidecarRuleResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListSidecarRuleResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListSidecarRuleResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListSidecarRuleResponse setSidecarRules(java.util.List<SidecarRule> sidecarRules) {
        this.sidecarRules = sidecarRules;
        return this;
    }
    public java.util.List<SidecarRule> getSidecarRules() {
        return this.sidecarRules;
    }

    public ListSidecarRuleResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
