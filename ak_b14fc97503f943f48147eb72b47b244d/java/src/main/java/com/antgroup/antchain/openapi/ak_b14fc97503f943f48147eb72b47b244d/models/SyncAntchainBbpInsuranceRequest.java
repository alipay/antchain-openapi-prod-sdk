// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_b14fc97503f943f48147eb72b47b244d.models;

import com.aliyun.tea.*;

public class SyncAntchainBbpInsuranceRequest extends TeaModel {
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
    @NameInMap("thirdpart_sku")
    @Validation(required = true)
    public String thirdpartSku;

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
    public String claimPayTime;

    // 理赔申请金额，单位元，保留小数点两位BigDecimal
    @NameInMap("claim_apply_amount")
    @Validation(required = true)
    public Long claimApplyAmount;

    // 理赔金额
    @NameInMap("claim_amount")
    @Validation(required = true)
    public Long claimAmount;

    // 授权列表
    @NameInMap("authorize_records")
    public java.util.List<AuthorizeRecordsPairs> authorizeRecords;

    public static SyncAntchainBbpInsuranceRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncAntchainBbpInsuranceRequest self = new SyncAntchainBbpInsuranceRequest();
        return TeaModel.build(map, self);
    }

    public SyncAntchainBbpInsuranceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncAntchainBbpInsuranceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncAntchainBbpInsuranceRequest setMechanismCode(String mechanismCode) {
        this.mechanismCode = mechanismCode;
        return this;
    }
    public String getMechanismCode() {
        return this.mechanismCode;
    }

    public SyncAntchainBbpInsuranceRequest setPolicyEncryptionContext(String policyEncryptionContext) {
        this.policyEncryptionContext = policyEncryptionContext;
        return this;
    }
    public String getPolicyEncryptionContext() {
        return this.policyEncryptionContext;
    }

    public SyncAntchainBbpInsuranceRequest setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
        return this;
    }
    public String getPolicyNo() {
        return this.policyNo;
    }

    public SyncAntchainBbpInsuranceRequest setThirdpartSku(String thirdpartSku) {
        this.thirdpartSku = thirdpartSku;
        return this;
    }
    public String getThirdpartSku() {
        return this.thirdpartSku;
    }

    public SyncAntchainBbpInsuranceRequest setMechanismName(String mechanismName) {
        this.mechanismName = mechanismName;
        return this;
    }
    public String getMechanismName() {
        return this.mechanismName;
    }

    public SyncAntchainBbpInsuranceRequest setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
        return this;
    }
    public String getInsuranceType() {
        return this.insuranceType;
    }

    public SyncAntchainBbpInsuranceRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public SyncAntchainBbpInsuranceRequest setClaimOrderNo(String claimOrderNo) {
        this.claimOrderNo = claimOrderNo;
        return this;
    }
    public String getClaimOrderNo() {
        return this.claimOrderNo;
    }

    public SyncAntchainBbpInsuranceRequest setClaimApplyTime(Long claimApplyTime) {
        this.claimApplyTime = claimApplyTime;
        return this;
    }
    public Long getClaimApplyTime() {
        return this.claimApplyTime;
    }

    public SyncAntchainBbpInsuranceRequest setClaimPayTime(String claimPayTime) {
        this.claimPayTime = claimPayTime;
        return this;
    }
    public String getClaimPayTime() {
        return this.claimPayTime;
    }

    public SyncAntchainBbpInsuranceRequest setClaimApplyAmount(Long claimApplyAmount) {
        this.claimApplyAmount = claimApplyAmount;
        return this;
    }
    public Long getClaimApplyAmount() {
        return this.claimApplyAmount;
    }

    public SyncAntchainBbpInsuranceRequest setClaimAmount(Long claimAmount) {
        this.claimAmount = claimAmount;
        return this;
    }
    public Long getClaimAmount() {
        return this.claimAmount;
    }

    public SyncAntchainBbpInsuranceRequest setAuthorizeRecords(java.util.List<AuthorizeRecordsPairs> authorizeRecords) {
        this.authorizeRecords = authorizeRecords;
        return this;
    }
    public java.util.List<AuthorizeRecordsPairs> getAuthorizeRecords() {
        return this.authorizeRecords;
    }

}
