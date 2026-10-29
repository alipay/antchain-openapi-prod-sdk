// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class UsageIotagentSessionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 会话总量（全量聚合，不随分页变化）
    @NameInMap("session_usage")
    public SessionUsage sessionUsage;

    // 总轮次数
    @NameInMap("total")
    public Long total;

    // 本页轮次明细
    @NameInMap("turns")
    public java.util.List<TurnModelCallsUsages> turns;

    // 上下文占用分析（基于最后一次模型调用估算）
    @NameInMap("context")
    public ContextOccupancy context;

    public static UsageIotagentSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        UsageIotagentSessionResponse self = new UsageIotagentSessionResponse();
        return TeaModel.build(map, self);
    }

    public UsageIotagentSessionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UsageIotagentSessionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UsageIotagentSessionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UsageIotagentSessionResponse setSessionUsage(SessionUsage sessionUsage) {
        this.sessionUsage = sessionUsage;
        return this;
    }
    public SessionUsage getSessionUsage() {
        return this.sessionUsage;
    }

    public UsageIotagentSessionResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public UsageIotagentSessionResponse setTurns(java.util.List<TurnModelCallsUsages> turns) {
        this.turns = turns;
        return this;
    }
    public java.util.List<TurnModelCallsUsages> getTurns() {
        return this.turns;
    }

    public UsageIotagentSessionResponse setContext(ContextOccupancy context) {
        this.context = context;
        return this;
    }
    public ContextOccupancy getContext() {
        return this.context;
    }

}
