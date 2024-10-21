// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sp.models;

import com.aliyun.tea.*;

public class SyncMerchantAgreementResultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("product_access_code")
    public String productAccessCode;

    // 签约请求单据号
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 代扣产品码
    // 代扣：GENERAL_WITHHOLDING_P
    @NameInMap("personal_product_code")
    @Validation(required = true)
    public String personalProductCode;

    // 代扣签约主体2088号(即代扣收款方)
    @NameInMap("merchant_user_id")
    @Validation(required = true)
    public String merchantUserId;

    // 签约客户支付宝uid
    @NameInMap("customer_alipay_user_id")
    @Validation(required = true)
    public String customerAlipayUserId;

    // 实际生效时间
    @NameInMap("valid_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String validTime;

    // 失效时间
    @NameInMap("invalid_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String invalidTime;

    // 签约时间
    @NameInMap("sign_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String signTime;

    // 签约状态
    // TEMP-暂存
    // NORMAL-正常
    // STOP-暂停
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static SyncMerchantAgreementResultRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncMerchantAgreementResultRequest self = new SyncMerchantAgreementResultRequest();
        return TeaModel.build(map, self);
    }

    public SyncMerchantAgreementResultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncMerchantAgreementResultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncMerchantAgreementResultRequest setProductAccessCode(String productAccessCode) {
        this.productAccessCode = productAccessCode;
        return this;
    }
    public String getProductAccessCode() {
        return this.productAccessCode;
    }

    public SyncMerchantAgreementResultRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SyncMerchantAgreementResultRequest setPersonalProductCode(String personalProductCode) {
        this.personalProductCode = personalProductCode;
        return this;
    }
    public String getPersonalProductCode() {
        return this.personalProductCode;
    }

    public SyncMerchantAgreementResultRequest setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public SyncMerchantAgreementResultRequest setCustomerAlipayUserId(String customerAlipayUserId) {
        this.customerAlipayUserId = customerAlipayUserId;
        return this;
    }
    public String getCustomerAlipayUserId() {
        return this.customerAlipayUserId;
    }

    public SyncMerchantAgreementResultRequest setValidTime(String validTime) {
        this.validTime = validTime;
        return this;
    }
    public String getValidTime() {
        return this.validTime;
    }

    public SyncMerchantAgreementResultRequest setInvalidTime(String invalidTime) {
        this.invalidTime = invalidTime;
        return this;
    }
    public String getInvalidTime() {
        return this.invalidTime;
    }

    public SyncMerchantAgreementResultRequest setSignTime(String signTime) {
        this.signTime = signTime;
        return this;
    }
    public String getSignTime() {
        return this.signTime;
    }

    public SyncMerchantAgreementResultRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
