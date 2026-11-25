// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class SearchAntchainDasKyaAgentResponse extends TeaModel {
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
    public java.util.List<KyaAgentSearchResultItem> items;

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

    public static SearchAntchainDasKyaAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchAntchainDasKyaAgentResponse self = new SearchAntchainDasKyaAgentResponse();
        return TeaModel.build(map, self);
    }

    public SearchAntchainDasKyaAgentResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SearchAntchainDasKyaAgentResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SearchAntchainDasKyaAgentResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SearchAntchainDasKyaAgentResponse setItems(java.util.List<KyaAgentSearchResultItem> items) {
        this.items = items;
        return this;
    }
    public java.util.List<KyaAgentSearchResultItem> getItems() {
        return this.items;
    }

    public SearchAntchainDasKyaAgentResponse setReturnedCount(Long returnedCount) {
        this.returnedCount = returnedCount;
        return this;
    }
    public Long getReturnedCount() {
        return this.returnedCount;
    }

    public SearchAntchainDasKyaAgentResponse setEffectiveMode(String effectiveMode) {
        this.effectiveMode = effectiveMode;
        return this;
    }
    public String getEffectiveMode() {
        return this.effectiveMode;
    }

    public SearchAntchainDasKyaAgentResponse setDegraded(Boolean degraded) {
        this.degraded = degraded;
        return this;
    }
    public Boolean getDegraded() {
        return this.degraded;
    }

    public SearchAntchainDasKyaAgentResponse setDegradeReason(String degradeReason) {
        this.degradeReason = degradeReason;
        return this;
    }
    public String getDegradeReason() {
        return this.degradeReason;
    }

    public SearchAntchainDasKyaAgentResponse setEmptyReason(String emptyReason) {
        this.emptyReason = emptyReason;
        return this;
    }
    public String getEmptyReason() {
        return this.emptyReason;
    }

}
