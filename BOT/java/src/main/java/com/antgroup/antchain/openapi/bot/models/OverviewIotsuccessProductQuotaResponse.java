// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class OverviewIotsuccessProductQuotaResponse extends TeaModel {
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

    public static OverviewIotsuccessProductQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        OverviewIotsuccessProductQuotaResponse self = new OverviewIotsuccessProductQuotaResponse();
        return TeaModel.build(map, self);
    }

    public OverviewIotsuccessProductQuotaResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public OverviewIotsuccessProductQuotaResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public OverviewIotsuccessProductQuotaResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public OverviewIotsuccessProductQuotaResponse setAuthorizationMode(String authorizationMode) {
        this.authorizationMode = authorizationMode;
        return this;
    }
    public String getAuthorizationMode() {
        return this.authorizationMode;
    }

    public OverviewIotsuccessProductQuotaResponse setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public OverviewIotsuccessProductQuotaResponse setSharedPool(Boolean sharedPool) {
        this.sharedPool = sharedPool;
        return this;
    }
    public Boolean getSharedPool() {
        return this.sharedPool;
    }

    public OverviewIotsuccessProductQuotaResponse setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public OverviewIotsuccessProductQuotaResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public OverviewIotsuccessProductQuotaResponse setUsed(Long used) {
        this.used = used;
        return this;
    }
    public Long getUsed() {
        return this.used;
    }

    public OverviewIotsuccessProductQuotaResponse setRemaining(Long remaining) {
        this.remaining = remaining;
        return this;
    }
    public Long getRemaining() {
        return this.remaining;
    }

    public OverviewIotsuccessProductQuotaResponse setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

    public OverviewIotsuccessProductQuotaResponse setAsOf(String asOf) {
        this.asOf = asOf;
        return this;
    }
    public String getAsOf() {
        return this.asOf;
    }

}
