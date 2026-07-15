// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateLeaseAuditRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 融资租赁业务id，由资方控制台创建返回
    @NameInMap("application_id")
    public String applicationId;

    // 是否启动订单的异步处理
    @NameInMap("async")
    public Long async;

    // 融资机构审核批次
    // 
    @NameInMap("batch_index")
    public String batchIndex;

    // 当前订单处于本批次中的index
    @NameInMap("current_audit_index")
    public Long currentAuditIndex;

    // 融资租赁额外字段
    @NameInMap("extra_info")
    public String extraInfo;

    // 租赁服务平台ID 长度不可超过50
    @NameInMap("lease_id")
    @Validation(required = true)
    public String leaseId;

    // 融资机构审核状态，0.审核中1.审核失败2.审核成功
    @NameInMap("manual_audit")
    @Validation(required = true)
    public Long manualAudit;

    // 融资结构审核说明，非必填，审核失败必填失败原因
    @NameInMap("manual_audit_comments")
    public String manualAuditComments;

    // 订单id 长度不可超过50
    // 
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 总审核的个数
    @NameInMap("total_audit_number")
    public Long totalAuditNumber;

    // 额外通知第三方，如果需要通知相关方外的第三方，需要在此设置关联方的租户id，若不设置则只通知资方	
    // 
    @NameInMap("related_notify")
    public java.util.List<String> relatedNotify;

    public static CreateLeaseAuditRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLeaseAuditRequest self = new CreateLeaseAuditRequest();
        return TeaModel.build(map, self);
    }

    public CreateLeaseAuditRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLeaseAuditRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateLeaseAuditRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreateLeaseAuditRequest setAsync(Long async) {
        this.async = async;
        return this;
    }
    public Long getAsync() {
        return this.async;
    }

    public CreateLeaseAuditRequest setBatchIndex(String batchIndex) {
        this.batchIndex = batchIndex;
        return this;
    }
    public String getBatchIndex() {
        return this.batchIndex;
    }

    public CreateLeaseAuditRequest setCurrentAuditIndex(Long currentAuditIndex) {
        this.currentAuditIndex = currentAuditIndex;
        return this;
    }
    public Long getCurrentAuditIndex() {
        return this.currentAuditIndex;
    }

    public CreateLeaseAuditRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public CreateLeaseAuditRequest setLeaseId(String leaseId) {
        this.leaseId = leaseId;
        return this;
    }
    public String getLeaseId() {
        return this.leaseId;
    }

    public CreateLeaseAuditRequest setManualAudit(Long manualAudit) {
        this.manualAudit = manualAudit;
        return this;
    }
    public Long getManualAudit() {
        return this.manualAudit;
    }

    public CreateLeaseAuditRequest setManualAuditComments(String manualAuditComments) {
        this.manualAuditComments = manualAuditComments;
        return this;
    }
    public String getManualAuditComments() {
        return this.manualAuditComments;
    }

    public CreateLeaseAuditRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateLeaseAuditRequest setTotalAuditNumber(Long totalAuditNumber) {
        this.totalAuditNumber = totalAuditNumber;
        return this;
    }
    public Long getTotalAuditNumber() {
        return this.totalAuditNumber;
    }

    public CreateLeaseAuditRequest setRelatedNotify(java.util.List<String> relatedNotify) {
        this.relatedNotify = relatedNotify;
        return this;
    }
    public java.util.List<String> getRelatedNotify() {
        return this.relatedNotify;
    }

}
