// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class ListAntchainDasKyaServiceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 当前身份详情有序列表，可为空
    @NameInMap("items")
    public java.util.List<AgentSearchItem> items;

    // 实际返回数量
    @NameInMap("returned_count")
    public Long returnedCount;

    // 实际检索模式；当前策略仅接受 HYBRID
    @NameInMap("effective_mode")
    public String effectiveMode;

    // 是否降级；当前策略拒绝未校准的降级结果
    @NameInMap("degraded")
    public Boolean degraded;

    // 有降级说明时才返回
    @NameInMap("degrade_reason")
    public String degradeReason;

    // 空列表时返回 NO_SUITABLE_AGENT
    @NameInMap("empty_reason")
    public String emptyReason;

    public static ListAntchainDasKyaServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAntchainDasKyaServiceResponse self = new ListAntchainDasKyaServiceResponse();
        return TeaModel.build(map, self);
    }

    public ListAntchainDasKyaServiceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListAntchainDasKyaServiceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListAntchainDasKyaServiceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListAntchainDasKyaServiceResponse setItems(java.util.List<AgentSearchItem> items) {
        this.items = items;
        return this;
    }
    public java.util.List<AgentSearchItem> getItems() {
        return this.items;
    }

    public ListAntchainDasKyaServiceResponse setReturnedCount(Long returnedCount) {
        this.returnedCount = returnedCount;
        return this;
    }
    public Long getReturnedCount() {
        return this.returnedCount;
    }

    public ListAntchainDasKyaServiceResponse setEffectiveMode(String effectiveMode) {
        this.effectiveMode = effectiveMode;
        return this;
    }
    public String getEffectiveMode() {
        return this.effectiveMode;
    }

    public ListAntchainDasKyaServiceResponse setDegraded(Boolean degraded) {
        this.degraded = degraded;
        return this;
    }
    public Boolean getDegraded() {
        return this.degraded;
    }

    public ListAntchainDasKyaServiceResponse setDegradeReason(String degradeReason) {
        this.degradeReason = degradeReason;
        return this;
    }
    public String getDegradeReason() {
        return this.degradeReason;
    }

    public ListAntchainDasKyaServiceResponse setEmptyReason(String emptyReason) {
        this.emptyReason = emptyReason;
        return this;
    }
    public String getEmptyReason() {
        return this.emptyReason;
    }

}
