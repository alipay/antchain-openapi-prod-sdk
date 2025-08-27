// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class OperateInnerAgreementterminateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 订单 id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 解约申请 id
    @NameInMap("terminate_apply_id")
    @Validation(required = true)
    public String terminateApplyId;

    // 操作处理状态：
    // agree-同意；refuse-拒绝
    @NameInMap("operate_status")
    @Validation(required = true)
    public String operateStatus;

    // 支付宝系统中用以唯一标识用户签约记录的编号
    @NameInMap("agreement_no")
    public String agreementNo;

    // 代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）
    @NameInMap("external_agreement_no")
    public String externalAgreementNo;

    // 商家拒绝原因
    @NameInMap("merchant_refuse_reason")
    public String merchantRefuseReason;

    // 商家拒绝举证材料（拒绝时上传）
    @NameInMap("merchant_refuse_evidences")
    public java.util.List<String> merchantRefuseEvidences;

    public static OperateInnerAgreementterminateRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateInnerAgreementterminateRequest self = new OperateInnerAgreementterminateRequest();
        return TeaModel.build(map, self);
    }

    public OperateInnerAgreementterminateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateInnerAgreementterminateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OperateInnerAgreementterminateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public OperateInnerAgreementterminateRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public OperateInnerAgreementterminateRequest setTerminateApplyId(String terminateApplyId) {
        this.terminateApplyId = terminateApplyId;
        return this;
    }
    public String getTerminateApplyId() {
        return this.terminateApplyId;
    }

    public OperateInnerAgreementterminateRequest setOperateStatus(String operateStatus) {
        this.operateStatus = operateStatus;
        return this;
    }
    public String getOperateStatus() {
        return this.operateStatus;
    }

    public OperateInnerAgreementterminateRequest setAgreementNo(String agreementNo) {
        this.agreementNo = agreementNo;
        return this;
    }
    public String getAgreementNo() {
        return this.agreementNo;
    }

    public OperateInnerAgreementterminateRequest setExternalAgreementNo(String externalAgreementNo) {
        this.externalAgreementNo = externalAgreementNo;
        return this;
    }
    public String getExternalAgreementNo() {
        return this.externalAgreementNo;
    }

    public OperateInnerAgreementterminateRequest setMerchantRefuseReason(String merchantRefuseReason) {
        this.merchantRefuseReason = merchantRefuseReason;
        return this;
    }
    public String getMerchantRefuseReason() {
        return this.merchantRefuseReason;
    }

    public OperateInnerAgreementterminateRequest setMerchantRefuseEvidences(java.util.List<String> merchantRefuseEvidences) {
        this.merchantRefuseEvidences = merchantRefuseEvidences;
        return this;
    }
    public java.util.List<String> getMerchantRefuseEvidences() {
        return this.merchantRefuseEvidences;
    }

}
