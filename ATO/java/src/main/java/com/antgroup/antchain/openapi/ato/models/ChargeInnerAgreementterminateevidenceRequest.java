// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class ChargeInnerAgreementterminateevidenceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
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

    // 支付宝系统中用以唯一标识用户签约记录的编号
    @NameInMap("agreement_no")
    public String agreementNo;

    // 代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）
    @NameInMap("external_agreement_no")
    public String externalAgreementNo;

    // 商家补充拒绝原因
    @NameInMap("merchant_refuse_reason")
    public String merchantRefuseReason;

    // 商家补充拒绝举证材料
    @NameInMap("merchant_refuse_evidences")
    public java.util.List<String> merchantRefuseEvidences;

    public static ChargeInnerAgreementterminateevidenceRequest build(java.util.Map<String, ?> map) throws Exception {
        ChargeInnerAgreementterminateevidenceRequest self = new ChargeInnerAgreementterminateevidenceRequest();
        return TeaModel.build(map, self);
    }

    public ChargeInnerAgreementterminateevidenceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ChargeInnerAgreementterminateevidenceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ChargeInnerAgreementterminateevidenceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ChargeInnerAgreementterminateevidenceRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ChargeInnerAgreementterminateevidenceRequest setTerminateApplyId(String terminateApplyId) {
        this.terminateApplyId = terminateApplyId;
        return this;
    }
    public String getTerminateApplyId() {
        return this.terminateApplyId;
    }

    public ChargeInnerAgreementterminateevidenceRequest setAgreementNo(String agreementNo) {
        this.agreementNo = agreementNo;
        return this;
    }
    public String getAgreementNo() {
        return this.agreementNo;
    }

    public ChargeInnerAgreementterminateevidenceRequest setExternalAgreementNo(String externalAgreementNo) {
        this.externalAgreementNo = externalAgreementNo;
        return this;
    }
    public String getExternalAgreementNo() {
        return this.externalAgreementNo;
    }

    public ChargeInnerAgreementterminateevidenceRequest setMerchantRefuseReason(String merchantRefuseReason) {
        this.merchantRefuseReason = merchantRefuseReason;
        return this;
    }
    public String getMerchantRefuseReason() {
        return this.merchantRefuseReason;
    }

    public ChargeInnerAgreementterminateevidenceRequest setMerchantRefuseEvidences(java.util.List<String> merchantRefuseEvidences) {
        this.merchantRefuseEvidences = merchantRefuseEvidences;
        return this;
    }
    public java.util.List<String> getMerchantRefuseEvidences() {
        return this.merchantRefuseEvidences;
    }

}
