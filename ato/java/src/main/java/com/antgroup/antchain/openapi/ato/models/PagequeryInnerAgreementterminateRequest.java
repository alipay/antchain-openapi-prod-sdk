// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PagequeryInnerAgreementterminateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 分页参数
    @NameInMap("page_info")
    @Validation(required = true)
    public PageQuery pageInfo;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 订单ID
    @NameInMap("order_id")
    public String orderId;

    // 商家处理超时时长类型(DAY/HOUR)
    @NameInMap("merchant_handle_duration_type")
    public String merchantHandleDurationType;

    // terminateApplyId
    @NameInMap("terminate_apply_id")
    public String terminateApplyId;

    // 解约申请开始时间
    @NameInMap("gmt_terminate_apply_start_time")
    public String gmtTerminateApplyStartTime;

    // 解约申请结束时间
    @NameInMap("gmt_terminate_apply_end_time")
    public String gmtTerminateApplyEndTime;

    // 处理状态
    @NameInMap("handle_status")
    public String handleStatus;

    public static PagequeryInnerAgreementterminateRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryInnerAgreementterminateRequest self = new PagequeryInnerAgreementterminateRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryInnerAgreementterminateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryInnerAgreementterminateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryInnerAgreementterminateRequest setPageInfo(PageQuery pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageQuery getPageInfo() {
        return this.pageInfo;
    }

    public PagequeryInnerAgreementterminateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public PagequeryInnerAgreementterminateRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public PagequeryInnerAgreementterminateRequest setMerchantHandleDurationType(String merchantHandleDurationType) {
        this.merchantHandleDurationType = merchantHandleDurationType;
        return this;
    }
    public String getMerchantHandleDurationType() {
        return this.merchantHandleDurationType;
    }

    public PagequeryInnerAgreementterminateRequest setTerminateApplyId(String terminateApplyId) {
        this.terminateApplyId = terminateApplyId;
        return this;
    }
    public String getTerminateApplyId() {
        return this.terminateApplyId;
    }

    public PagequeryInnerAgreementterminateRequest setGmtTerminateApplyStartTime(String gmtTerminateApplyStartTime) {
        this.gmtTerminateApplyStartTime = gmtTerminateApplyStartTime;
        return this;
    }
    public String getGmtTerminateApplyStartTime() {
        return this.gmtTerminateApplyStartTime;
    }

    public PagequeryInnerAgreementterminateRequest setGmtTerminateApplyEndTime(String gmtTerminateApplyEndTime) {
        this.gmtTerminateApplyEndTime = gmtTerminateApplyEndTime;
        return this;
    }
    public String getGmtTerminateApplyEndTime() {
        return this.gmtTerminateApplyEndTime;
    }

    public PagequeryInnerAgreementterminateRequest setHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
        return this;
    }
    public String getHandleStatus() {
        return this.handleStatus;
    }

}
