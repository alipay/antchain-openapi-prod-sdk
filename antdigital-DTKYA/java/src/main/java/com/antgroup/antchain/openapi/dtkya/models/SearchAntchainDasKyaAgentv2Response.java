// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class SearchAntchainDasKyaAgentv2Response extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 检索结果有序列表，可为空。
    @NameInMap("items")
    @Validation(required = true)
    public java.util.List<KyaAgentSearchV2ResultItem> items;

    // 实际返回数量
    @NameInMap("returned_count")
    @Validation(required = true)
    public Long returnedCount;

    // 实际检索模式 MOCK、EXACT、HYBRID 或降级后的 KEYWORD。
    @NameInMap("effective_mode")
    @Validation(required = true)
    public String effectiveMode;

    // 是否发生检索降级。
    @NameInMap("degraded")
    @Validation(required = true)
    public Boolean degraded;

    // 有降级说明时才返回
    @NameInMap("degrade_reason")
    public String degradeReason;

    // 空列表时为 NO_SUITABLE_AGENT。
    @NameInMap("empty_reason")
    public String emptyReason;

    public static SearchAntchainDasKyaAgentv2Response build(java.util.Map<String, ?> map) throws Exception {
        SearchAntchainDasKyaAgentv2Response self = new SearchAntchainDasKyaAgentv2Response();
        return TeaModel.build(map, self);
    }

    public SearchAntchainDasKyaAgentv2Response setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SearchAntchainDasKyaAgentv2Response setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SearchAntchainDasKyaAgentv2Response setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SearchAntchainDasKyaAgentv2Response setItems(java.util.List<KyaAgentSearchV2ResultItem> items) {
        this.items = items;
        return this;
    }
    public java.util.List<KyaAgentSearchV2ResultItem> getItems() {
        return this.items;
    }

    public SearchAntchainDasKyaAgentv2Response setReturnedCount(Long returnedCount) {
        this.returnedCount = returnedCount;
        return this;
    }
    public Long getReturnedCount() {
        return this.returnedCount;
    }

    public SearchAntchainDasKyaAgentv2Response setEffectiveMode(String effectiveMode) {
        this.effectiveMode = effectiveMode;
        return this;
    }
    public String getEffectiveMode() {
        return this.effectiveMode;
    }

    public SearchAntchainDasKyaAgentv2Response setDegraded(Boolean degraded) {
        this.degraded = degraded;
        return this;
    }
    public Boolean getDegraded() {
        return this.degraded;
    }

    public SearchAntchainDasKyaAgentv2Response setDegradeReason(String degradeReason) {
        this.degradeReason = degradeReason;
        return this;
    }
    public String getDegradeReason() {
        return this.degradeReason;
    }

    public SearchAntchainDasKyaAgentv2Response setEmptyReason(String emptyReason) {
        this.emptyReason = emptyReason;
        return this;
    }
    public String getEmptyReason() {
        return this.emptyReason;
    }

}
