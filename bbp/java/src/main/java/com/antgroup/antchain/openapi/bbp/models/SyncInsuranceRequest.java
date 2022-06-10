// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bbp.models;

import com.aliyun.tea.*;

public class SyncInsuranceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 保司编码
    @NameInMap("mechanism_code")
    @Validation(required = true)
    public String mechanismCode;

    // 理赔加密信息
    @NameInMap("policy_encryption_context")
    @Validation(required = true)
    public String policyEncryptionContext;

    // 保单号
    @NameInMap("policy_no")
    @Validation(required = true)
    public String policyNo;

    // 保险产品SKU
    @NameInMap("third_part_sku")
    public String thirdPartSku;

    // 保司名称
    @NameInMap("mechanism_name")
    public String mechanismName;

    // 保单种类，险种
    @NameInMap("insurance_type")
    public String insuranceType;

    // 操作类型
    // 下单 支付 理赔 退单
    @NameInMap("operation")
    public String operation;

    // 赔付单号
    @NameInMap("claim_order_no")
    @Validation(required = true)
    public String claimOrderNo;

    // 理赔申请时间（毫秒值）
    @NameInMap("claim_apply_time")
    @Validation(required = true)
    public Long claimApplyTime;

    // 理赔赔付时间（毫秒值）
    @NameInMap("claim_pay_time")
    @Validation(required = true)
    public Long claimPayTime;

    // 理赔申请金额，整型，以分为单位，50000分 = 500.00元
    @NameInMap("claim_apply_amount")
    @Validation(required = true)
    public Long claimApplyAmount;

    // 理赔金额，整型，以分为单位，50000分 = 500.00元
    @NameInMap("claim_amount")
    @Validation(required = true)
    public Long claimAmount;

    // 授权列表
    @NameInMap("authorize_records")
    public java.util.List<AuthorizeRecordsPairs> authorizeRecords;

    public static SyncInsuranceRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncInsuranceRequest self = new SyncInsuranceRequest();
        return TeaModel.build(map, self);
    }

    public SyncInsuranceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncInsuranceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncInsuranceRequest setMechanismCode(String mechanismCode) {
        this.mechanismCode = mechanismCode;
        return this;
    }
    public String getMechanismCode() {
        return this.mechanismCode;
    }

    public SyncInsuranceRequest setPolicyEncryptionContext(String policyEncryptionContext) {
        this.policyEncryptionContext = policyEncryptionContext;
        return this;
    }
    public String getPolicyEncryptionContext() {
        return this.policyEncryptionContext;
    }

    public SyncInsuranceRequest setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
        return this;
    }
    public String getPolicyNo() {
        return this.policyNo;
    }

    public SyncInsuranceRequest setThirdPartSku(String thirdPartSku) {
        this.thirdPartSku = thirdPartSku;
        return this;
    }
    public String getThirdPartSku() {
        return this.thirdPartSku;
    }

    public SyncInsuranceRequest setMechanismName(String mechanismName) {
        this.mechanismName = mechanismName;
        return this;
    }
    public String getMechanismName() {
        return this.mechanismName;
    }

    public SyncInsuranceRequest setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
        return this;
    }
    public String getInsuranceType() {
        return this.insuranceType;
    }

    public SyncInsuranceRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public SyncInsuranceRequest setClaimOrderNo(String claimOrderNo) {
        this.claimOrderNo = claimOrderNo;
        return this;
    }
    public String getClaimOrderNo() {
        return this.claimOrderNo;
    }

    public SyncInsuranceRequest setClaimApplyTime(Long claimApplyTime) {
        this.claimApplyTime = claimApplyTime;
        return this;
    }
    public Long getClaimApplyTime() {
        return this.claimApplyTime;
    }

    public SyncInsuranceRequest setClaimPayTime(Long claimPayTime) {
        this.claimPayTime = claimPayTime;
        return this;
    }
    public Long getClaimPayTime() {
        return this.claimPayTime;
    }

    public SyncInsuranceRequest setClaimApplyAmount(Long claimApplyAmount) {
        this.claimApplyAmount = claimApplyAmount;
        return this;
    }
    public Long getClaimApplyAmount() {
        return this.claimApplyAmount;
    }

    public SyncInsuranceRequest setClaimAmount(Long claimAmount) {
        this.claimAmount = claimAmount;
        return this;
    }
    public Long getClaimAmount() {
        return this.claimAmount;
    }

    public SyncInsuranceRequest setAuthorizeRecords(java.util.List<AuthorizeRecordsPairs> authorizeRecords) {
        this.authorizeRecords = authorizeRecords;
        return this;
    }
    public java.util.List<AuthorizeRecordsPairs> getAuthorizeRecords() {
        return this.authorizeRecords;
    }

}
