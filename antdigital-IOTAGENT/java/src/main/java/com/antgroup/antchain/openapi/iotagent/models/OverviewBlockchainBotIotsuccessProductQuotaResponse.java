// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class OverviewBlockchainBotIotsuccessProductQuotaResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 枚举:LICENSE,INSTANCE
    @NameInMap("authorization_mode")
    @Validation(required = true)
    public String authorizationMode;

    // 枚举:LICENSES,INSTANCE_POOL
    @NameInMap("scope")
    @Validation(required = true)
    public String scope;

    // 多产品关联同一实例池时为true，池消费不等于单产品独占消费
    @NameInMap("shared_pool")
    @Validation(required = true)
    public Boolean sharedPool;

    // 枚举:AGENT_REQUEST
    @NameInMap("resource_type")
    @Validation(required = true)
    public String resourceType;

    @NameInMap("total")
    @Validation(required = true)
    public Long total;

    @NameInMap("used")
    @Validation(required = true)
    public Long used;

    // total-used，保留负值
    @NameInMap("remaining")
    @Validation(required = true)
    public Long remaining;

    // 额度点，不是token或音频秒数；枚举:QUOTA_POINT
    @NameInMap("unit")
    @Validation(required = true)
    public String unit;

    @NameInMap("as_of")
    @Validation(required = true)
    public String asOf;

    public static OverviewBlockchainBotIotsuccessProductQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        OverviewBlockchainBotIotsuccessProductQuotaResponse self = new OverviewBlockchainBotIotsuccessProductQuotaResponse();
        return TeaModel.build(map, self);
    }

    public OverviewBlockchainBotIotsuccessProductQuotaResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public OverviewBlockchainBotIotsuccessProductQuotaResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public OverviewBlockchainBotIotsuccessProductQuotaResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public OverviewBlockchainBotIotsuccessProductQuotaResponse setAuthorizationMode(String authorizationMode) {
        this.authorizationMode = authorizationMode;
        return this;
    }
    public String getAuthorizationMode() {
        return this.authorizationMode;
    }

    public OverviewBlockchainBotIotsuccessProductQuotaResponse setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public OverviewBlockchainBotIotsuccessProductQuotaResponse setSharedPool(Boolean sharedPool) {
        this.sharedPool = sharedPool;
        return this;
    }
    public Boolean getSharedPool() {
        return this.sharedPool;
    }

    public OverviewBlockchainBotIotsuccessProductQuotaResponse setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public OverviewBlockchainBotIotsuccessProductQuotaResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public OverviewBlockchainBotIotsuccessProductQuotaResponse setUsed(Long used) {
        this.used = used;
        return this;
    }
    public Long getUsed() {
        return this.used;
    }

    public OverviewBlockchainBotIotsuccessProductQuotaResponse setRemaining(Long remaining) {
        this.remaining = remaining;
        return this;
    }
    public Long getRemaining() {
        return this.remaining;
    }

    public OverviewBlockchainBotIotsuccessProductQuotaResponse setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

    public OverviewBlockchainBotIotsuccessProductQuotaResponse setAsOf(String asOf) {
        this.asOf = asOf;
        return this;
    }
    public String getAsOf() {
        return this.asOf;
    }

}
