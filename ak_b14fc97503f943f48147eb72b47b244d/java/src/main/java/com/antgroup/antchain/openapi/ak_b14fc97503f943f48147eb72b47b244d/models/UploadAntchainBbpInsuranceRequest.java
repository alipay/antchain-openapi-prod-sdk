// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_b14fc97503f943f48147eb72b47b244d.models;

import com.aliyun.tea.*;

public class UploadAntchainBbpInsuranceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 保司编码
    @NameInMap("mechanism_code")
    @Validation(required = true)
    public String mechanismCode;

    // 保单加密信息
    @NameInMap("policy_encryption_context")
    @Validation(required = true)
    public String policyEncryptionContext;

    // 保单号
    @NameInMap("policy_no")
    @Validation(required = true)
    public String policyNo;

    // 保险产品SKU
    @NameInMap("thirdpart_sku")
    @Validation(required = true)
    public String thirdpartSku;

    // 保司名称
    @NameInMap("mechanism_name")
    public String mechanismName;

    // 保单种类，险种
    @NameInMap("insurance_type")
    public String insuranceType;

    // 来源uid，此处指天猫id
    @NameInMap("source_uid")
    public String sourceUid;

    // 订单来源
    @NameInMap("source")
    public String source;

    // 投保人
    @NameInMap("user_name")
    public String userName;

    // 投保人类型  自然人/公司
    @NameInMap("user_type")
    @Validation(required = true)
    public String userType;

    // 投保人电话号码
    @NameInMap("user_phonenumber")
    public String userPhonenumber;

    // 投保人证件号
    @NameInMap("user_cert_no")
    public String userCertNo;

    // 拓展信息
    @NameInMap("extend")
    public String extend;

    // 保单生效时间（毫秒值）
    @NameInMap("policy_effect_time")
    @Validation(required = true)
    public Long policyEffectTime;

    // 保单失效时间
    @NameInMap("policy_invalid_time")
    @Validation(required = true)
    public Long policyInvalidTime;

    // 订单总金额BigDecimal
    @NameInMap("policy_total_amount")
    @Validation(required = true)
    public Long policyTotalAmount;

    // 订单总期数（一次性付款用1）
    @NameInMap("policy_total_stage")
    @Validation(required = true)
    public Long policyTotalStage;

    // 保费支付日期（毫秒值）
    @NameInMap("policy_pay_date")
    @Validation(required = true)
    public Long policyPayDate;

    // 已支付保费期数
    @NameInMap("policy_paid_stage")
    public Long policyPaidStage;

    // 每一期保费金额BigDecimal
    @NameInMap("policy_stage_aver_amount")
    public Long policyStageAverAmount;

    // 订单时间（毫秒值）
    @NameInMap("order_time")
    public Long orderTime;

    // 操作类型
    // 下单 支付 理赔 退单
    @NameInMap("operation")
    public String operation;

    // 赔付单号 理赔操作必填
    @NameInMap("claim_order_no")
    public String claimOrderNo;

    // 理赔申请时间（毫秒值） 理赔操作必填
    @NameInMap("claim_apply_time")
    public Long claimApplyTime;

    // 理赔赔付时间（毫秒值） 理赔操作必填
    @NameInMap("claim_pay_time")
    public Long claimPayTime;

    // 理赔申请金额，单位元，保留小数点两位 BigDecimal	理赔操作必填
    @NameInMap("claim_apply_amount")
    public String claimApplyAmount;

    // 理赔金额 BigDecimal	理赔操作必填
    @NameInMap("claim_amount")
    public String claimAmount;

    // 授权列表
    @NameInMap("authorize_records")
    public java.util.List<AuthorizeRecordsPairs> authorizeRecords;

    public static UploadAntchainBbpInsuranceRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadAntchainBbpInsuranceRequest self = new UploadAntchainBbpInsuranceRequest();
        return TeaModel.build(map, self);
    }

    public UploadAntchainBbpInsuranceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadAntchainBbpInsuranceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadAntchainBbpInsuranceRequest setMechanismCode(String mechanismCode) {
        this.mechanismCode = mechanismCode;
        return this;
    }
    public String getMechanismCode() {
        return this.mechanismCode;
    }

    public UploadAntchainBbpInsuranceRequest setPolicyEncryptionContext(String policyEncryptionContext) {
        this.policyEncryptionContext = policyEncryptionContext;
        return this;
    }
    public String getPolicyEncryptionContext() {
        return this.policyEncryptionContext;
    }

    public UploadAntchainBbpInsuranceRequest setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
        return this;
    }
    public String getPolicyNo() {
        return this.policyNo;
    }

    public UploadAntchainBbpInsuranceRequest setThirdpartSku(String thirdpartSku) {
        this.thirdpartSku = thirdpartSku;
        return this;
    }
    public String getThirdpartSku() {
        return this.thirdpartSku;
    }

    public UploadAntchainBbpInsuranceRequest setMechanismName(String mechanismName) {
        this.mechanismName = mechanismName;
        return this;
    }
    public String getMechanismName() {
        return this.mechanismName;
    }

    public UploadAntchainBbpInsuranceRequest setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
        return this;
    }
    public String getInsuranceType() {
        return this.insuranceType;
    }

    public UploadAntchainBbpInsuranceRequest setSourceUid(String sourceUid) {
        this.sourceUid = sourceUid;
        return this;
    }
    public String getSourceUid() {
        return this.sourceUid;
    }

    public UploadAntchainBbpInsuranceRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public UploadAntchainBbpInsuranceRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public UploadAntchainBbpInsuranceRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public UploadAntchainBbpInsuranceRequest setUserPhonenumber(String userPhonenumber) {
        this.userPhonenumber = userPhonenumber;
        return this;
    }
    public String getUserPhonenumber() {
        return this.userPhonenumber;
    }

    public UploadAntchainBbpInsuranceRequest setUserCertNo(String userCertNo) {
        this.userCertNo = userCertNo;
        return this;
    }
    public String getUserCertNo() {
        return this.userCertNo;
    }

    public UploadAntchainBbpInsuranceRequest setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

    public UploadAntchainBbpInsuranceRequest setPolicyEffectTime(Long policyEffectTime) {
        this.policyEffectTime = policyEffectTime;
        return this;
    }
    public Long getPolicyEffectTime() {
        return this.policyEffectTime;
    }

    public UploadAntchainBbpInsuranceRequest setPolicyInvalidTime(Long policyInvalidTime) {
        this.policyInvalidTime = policyInvalidTime;
        return this;
    }
    public Long getPolicyInvalidTime() {
        return this.policyInvalidTime;
    }

    public UploadAntchainBbpInsuranceRequest setPolicyTotalAmount(Long policyTotalAmount) {
        this.policyTotalAmount = policyTotalAmount;
        return this;
    }
    public Long getPolicyTotalAmount() {
        return this.policyTotalAmount;
    }

    public UploadAntchainBbpInsuranceRequest setPolicyTotalStage(Long policyTotalStage) {
        this.policyTotalStage = policyTotalStage;
        return this;
    }
    public Long getPolicyTotalStage() {
        return this.policyTotalStage;
    }

    public UploadAntchainBbpInsuranceRequest setPolicyPayDate(Long policyPayDate) {
        this.policyPayDate = policyPayDate;
        return this;
    }
    public Long getPolicyPayDate() {
        return this.policyPayDate;
    }

    public UploadAntchainBbpInsuranceRequest setPolicyPaidStage(Long policyPaidStage) {
        this.policyPaidStage = policyPaidStage;
        return this;
    }
    public Long getPolicyPaidStage() {
        return this.policyPaidStage;
    }

    public UploadAntchainBbpInsuranceRequest setPolicyStageAverAmount(Long policyStageAverAmount) {
        this.policyStageAverAmount = policyStageAverAmount;
        return this;
    }
    public Long getPolicyStageAverAmount() {
        return this.policyStageAverAmount;
    }

    public UploadAntchainBbpInsuranceRequest setOrderTime(Long orderTime) {
        this.orderTime = orderTime;
        return this;
    }
    public Long getOrderTime() {
        return this.orderTime;
    }

    public UploadAntchainBbpInsuranceRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public UploadAntchainBbpInsuranceRequest setClaimOrderNo(String claimOrderNo) {
        this.claimOrderNo = claimOrderNo;
        return this;
    }
    public String getClaimOrderNo() {
        return this.claimOrderNo;
    }

    public UploadAntchainBbpInsuranceRequest setClaimApplyTime(Long claimApplyTime) {
        this.claimApplyTime = claimApplyTime;
        return this;
    }
    public Long getClaimApplyTime() {
        return this.claimApplyTime;
    }

    public UploadAntchainBbpInsuranceRequest setClaimPayTime(Long claimPayTime) {
        this.claimPayTime = claimPayTime;
        return this;
    }
    public Long getClaimPayTime() {
        return this.claimPayTime;
    }

    public UploadAntchainBbpInsuranceRequest setClaimApplyAmount(String claimApplyAmount) {
        this.claimApplyAmount = claimApplyAmount;
        return this;
    }
    public String getClaimApplyAmount() {
        return this.claimApplyAmount;
    }

    public UploadAntchainBbpInsuranceRequest setClaimAmount(String claimAmount) {
        this.claimAmount = claimAmount;
        return this;
    }
    public String getClaimAmount() {
        return this.claimAmount;
    }

    public UploadAntchainBbpInsuranceRequest setAuthorizeRecords(java.util.List<AuthorizeRecordsPairs> authorizeRecords) {
        this.authorizeRecords = authorizeRecords;
        return this;
    }
    public java.util.List<AuthorizeRecordsPairs> getAuthorizeRecords() {
        return this.authorizeRecords;
    }

}
