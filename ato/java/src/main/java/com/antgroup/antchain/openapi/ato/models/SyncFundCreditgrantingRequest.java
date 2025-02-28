// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SyncFundCreditgrantingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授信id
    @NameInMap("granting_id")
    @Validation(required = true, maxLength = 20, minLength = 10)
    public String grantingId;

    // 授信授权id
    @NameInMap("auth_id")
    @Validation(required = true, maxLength = 20, minLength = 10)
    public String authId;

    // 资方社会信用代码
    @NameInMap("fund_id")
    @Validation(required = true, maxLength = 32, minLength = 1)
    public String fundId;

    // 商户社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true, maxLength = 32, minLength = 1)
    public String merchantId;

    // 商户租户id
    @NameInMap("tenant_id")
    @Validation(required = true, maxLength = 32, minLength = 1)
    public String tenantId;

    // 授权额度，单位为分
    @NameInMap("granting_line")
    @Validation(required = true, minimum = 1)
    public Long grantingLine;

    // 授信有效期开始时间(yyyy-MM-dd HH:mm:ss)
    @NameInMap("effect_start_time")
    @Validation(required = true, maxLength = 20, minLength = 10)
    public String effectStartTime;

    // 授信有效期结束时间(yyyy-MM-dd HH:mm:ss)
    @NameInMap("effect_end_time")
    @Validation(required = true, maxLength = 20, minLength = 10)
    public String effectEndTime;

    public static SyncFundCreditgrantingRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncFundCreditgrantingRequest self = new SyncFundCreditgrantingRequest();
        return TeaModel.build(map, self);
    }

    public SyncFundCreditgrantingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncFundCreditgrantingRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncFundCreditgrantingRequest setGrantingId(String grantingId) {
        this.grantingId = grantingId;
        return this;
    }
    public String getGrantingId() {
        return this.grantingId;
    }

    public SyncFundCreditgrantingRequest setAuthId(String authId) {
        this.authId = authId;
        return this;
    }
    public String getAuthId() {
        return this.authId;
    }

    public SyncFundCreditgrantingRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public SyncFundCreditgrantingRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public SyncFundCreditgrantingRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SyncFundCreditgrantingRequest setGrantingLine(Long grantingLine) {
        this.grantingLine = grantingLine;
        return this;
    }
    public Long getGrantingLine() {
        return this.grantingLine;
    }

    public SyncFundCreditgrantingRequest setEffectStartTime(String effectStartTime) {
        this.effectStartTime = effectStartTime;
        return this;
    }
    public String getEffectStartTime() {
        return this.effectStartTime;
    }

    public SyncFundCreditgrantingRequest setEffectEndTime(String effectEndTime) {
        this.effectEndTime = effectEndTime;
        return this;
    }
    public String getEffectEndTime() {
        return this.effectEndTime;
    }

}
