// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class NotifySilentauthResultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授权流程ID
    @NameInMap("auth_id")
    @Validation(required = true)
    public String authId;

    // 授权状态：1 进行中、2 授权成功、3 授权失败、4 取消授权
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 授权失败原因，status 为 3 时返回
    @NameInMap("fail_reason")
    public String failReason;

    // 授权生效时间，格式 yyyyMMdd
    @NameInMap("valid_start_time")
    public String validStartTime;

    // 授权失效时间，格式 yyyyMMdd
    @NameInMap("valid_end_time")
    public String validEndTime;

    // 来源租户ID
    @NameInMap("src_tenant_id")
    @Validation(required = true)
    public String srcTenantId;

    // 来源商户统一社会信用代码
    @NameInMap("src_merchant_id")
    @Validation(required = true)
    public String srcMerchantId;

    public static NotifySilentauthResultRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifySilentauthResultRequest self = new NotifySilentauthResultRequest();
        return TeaModel.build(map, self);
    }

    public NotifySilentauthResultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public NotifySilentauthResultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public NotifySilentauthResultRequest setAuthId(String authId) {
        this.authId = authId;
        return this;
    }
    public String getAuthId() {
        return this.authId;
    }

    public NotifySilentauthResultRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public NotifySilentauthResultRequest setFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }
    public String getFailReason() {
        return this.failReason;
    }

    public NotifySilentauthResultRequest setValidStartTime(String validStartTime) {
        this.validStartTime = validStartTime;
        return this;
    }
    public String getValidStartTime() {
        return this.validStartTime;
    }

    public NotifySilentauthResultRequest setValidEndTime(String validEndTime) {
        this.validEndTime = validEndTime;
        return this;
    }
    public String getValidEndTime() {
        return this.validEndTime;
    }

    public NotifySilentauthResultRequest setSrcTenantId(String srcTenantId) {
        this.srcTenantId = srcTenantId;
        return this;
    }
    public String getSrcTenantId() {
        return this.srcTenantId;
    }

    public NotifySilentauthResultRequest setSrcMerchantId(String srcMerchantId) {
        this.srcMerchantId = srcMerchantId;
        return this;
    }
    public String getSrcMerchantId() {
        return this.srcMerchantId;
    }

}
