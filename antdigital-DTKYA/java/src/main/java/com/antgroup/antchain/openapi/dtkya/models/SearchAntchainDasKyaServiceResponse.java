// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class SearchAntchainDasKyaServiceResponse extends TeaModel {
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
    public java.util.List<ServiceSearchItem> items;

    // 实际返回数量
    @NameInMap("returned_count")
    @Validation(required = true)
    public Long returnedCount;

    // 实际检索模式 HYBRID 或降级后的 KEYWORD。
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

    // 空列表时为 NO_SUITABLE_SERVICE。
    @NameInMap("empty_reason")
    public String emptyReason;

    public static SearchAntchainDasKyaServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchAntchainDasKyaServiceResponse self = new SearchAntchainDasKyaServiceResponse();
        return TeaModel.build(map, self);
    }

    public SearchAntchainDasKyaServiceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SearchAntchainDasKyaServiceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SearchAntchainDasKyaServiceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SearchAntchainDasKyaServiceResponse setItems(java.util.List<ServiceSearchItem> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ServiceSearchItem> getItems() {
        return this.items;
    }

    public SearchAntchainDasKyaServiceResponse setReturnedCount(Long returnedCount) {
        this.returnedCount = returnedCount;
        return this;
    }
    public Long getReturnedCount() {
        return this.returnedCount;
    }

    public SearchAntchainDasKyaServiceResponse setEffectiveMode(String effectiveMode) {
        this.effectiveMode = effectiveMode;
        return this;
    }
    public String getEffectiveMode() {
        return this.effectiveMode;
    }

    public SearchAntchainDasKyaServiceResponse setDegraded(Boolean degraded) {
        this.degraded = degraded;
        return this;
    }
    public Boolean getDegraded() {
        return this.degraded;
    }

    public SearchAntchainDasKyaServiceResponse setDegradeReason(String degradeReason) {
        this.degradeReason = degradeReason;
        return this;
    }
    public String getDegradeReason() {
        return this.degradeReason;
    }

    public SearchAntchainDasKyaServiceResponse setEmptyReason(String emptyReason) {
        this.emptyReason = emptyReason;
        return this;
    }
    public String getEmptyReason() {
        return this.emptyReason;
    }

}
