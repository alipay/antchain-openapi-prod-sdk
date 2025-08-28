// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CountInnerAgreementterminateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 商户超时类型
    @NameInMap("merchant_handle_duration_type")
    public String merchantHandleDurationType;

    // 订单ID
    @NameInMap("order_id")
    public String orderId;

    // terminateApplyId
    @NameInMap("terminate_apply_id")
    public String terminateApplyId;

    // 解约申请开始时间
    @NameInMap("gmt_terminate_apply_start_time")
    public String gmtTerminateApplyStartTime;

    // 解约申请结束时间
    @NameInMap("gmt_terminate_apply_end_time")
    public String gmtTerminateApplyEndTime;

    public static CountInnerAgreementterminateRequest build(java.util.Map<String, ?> map) throws Exception {
        CountInnerAgreementterminateRequest self = new CountInnerAgreementterminateRequest();
        return TeaModel.build(map, self);
    }

    public CountInnerAgreementterminateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CountInnerAgreementterminateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CountInnerAgreementterminateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CountInnerAgreementterminateRequest setMerchantHandleDurationType(String merchantHandleDurationType) {
        this.merchantHandleDurationType = merchantHandleDurationType;
        return this;
    }
    public String getMerchantHandleDurationType() {
        return this.merchantHandleDurationType;
    }

    public CountInnerAgreementterminateRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CountInnerAgreementterminateRequest setTerminateApplyId(String terminateApplyId) {
        this.terminateApplyId = terminateApplyId;
        return this;
    }
    public String getTerminateApplyId() {
        return this.terminateApplyId;
    }

    public CountInnerAgreementterminateRequest setGmtTerminateApplyStartTime(String gmtTerminateApplyStartTime) {
        this.gmtTerminateApplyStartTime = gmtTerminateApplyStartTime;
        return this;
    }
    public String getGmtTerminateApplyStartTime() {
        return this.gmtTerminateApplyStartTime;
    }

    public CountInnerAgreementterminateRequest setGmtTerminateApplyEndTime(String gmtTerminateApplyEndTime) {
        this.gmtTerminateApplyEndTime = gmtTerminateApplyEndTime;
        return this;
    }
    public String getGmtTerminateApplyEndTime() {
        return this.gmtTerminateApplyEndTime;
    }

}
