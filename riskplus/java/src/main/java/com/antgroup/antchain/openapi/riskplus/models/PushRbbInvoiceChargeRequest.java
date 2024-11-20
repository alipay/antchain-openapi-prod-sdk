// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class PushRbbInvoiceChargeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户码
    @NameInMap("tenant_code")
    @Validation(required = true)
    public String tenantCode;

    // 授权类型
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 计费项,主租户：税号,子租户：子租户|税号
    @NameInMap("customer_id")
    @Validation(required = true)
    public String customerId;

    // 请求id
    @NameInMap("task_request_id")
    @Validation(required = true)
    public String taskRequestId;

    // 利润共享方
    @NameInMap("benefit_share_partner")
    @Validation(required = true)
    public String benefitSharePartner;

    // 计费时间
    @NameInMap("fee_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String feeTime;

    // 税号
    @NameInMap("sharding")
    @Validation(required = true)
    public String sharding;

    // true为接收侧提交账单，false接收侧不用提交账单
    @NameInMap("receiver_submit_bill")
    @Validation(required = true)
    public Boolean receiverSubmitBill;

    public static PushRbbInvoiceChargeRequest build(java.util.Map<String, ?> map) throws Exception {
        PushRbbInvoiceChargeRequest self = new PushRbbInvoiceChargeRequest();
        return TeaModel.build(map, self);
    }

    public PushRbbInvoiceChargeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushRbbInvoiceChargeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushRbbInvoiceChargeRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public PushRbbInvoiceChargeRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public PushRbbInvoiceChargeRequest setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public PushRbbInvoiceChargeRequest setTaskRequestId(String taskRequestId) {
        this.taskRequestId = taskRequestId;
        return this;
    }
    public String getTaskRequestId() {
        return this.taskRequestId;
    }

    public PushRbbInvoiceChargeRequest setBenefitSharePartner(String benefitSharePartner) {
        this.benefitSharePartner = benefitSharePartner;
        return this;
    }
    public String getBenefitSharePartner() {
        return this.benefitSharePartner;
    }

    public PushRbbInvoiceChargeRequest setFeeTime(String feeTime) {
        this.feeTime = feeTime;
        return this;
    }
    public String getFeeTime() {
        return this.feeTime;
    }

    public PushRbbInvoiceChargeRequest setSharding(String sharding) {
        this.sharding = sharding;
        return this;
    }
    public String getSharding() {
        return this.sharding;
    }

    public PushRbbInvoiceChargeRequest setReceiverSubmitBill(Boolean receiverSubmitBill) {
        this.receiverSubmitBill = receiverSubmitBill;
        return this;
    }
    public Boolean getReceiverSubmitBill() {
        return this.receiverSubmitBill;
    }

}
