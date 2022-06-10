// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bbp.models;

import com.aliyun.tea.*;

public class OperateInsuranceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 保司编码
    @NameInMap("mechanism_code")
    public String mechanismCode;

    // 保单加密信息
    @NameInMap("policy_encryption_context")
    public String policyEncryptionContext;

    // 保单号
    @NameInMap("policy_no")
    public String policyNo;

    // 保险产品SKU
    @NameInMap("third_part_sku")
    public String thirdPartSku;

    // 保险公司名称
    @NameInMap("mechanism_name")
    public String mechanismName;

    // 保单种类，险种
    @NameInMap("insurance_type")
    @Validation(required = true)
    public String insuranceType;

    // 来源uid，此处指天猫id
    @NameInMap("source_uid")
    @Validation(required = true)
    public String sourceUid;

    // 订单来源
    @NameInMap("source")
    public String source;

    // 投保人
    @NameInMap("user_name")
    public String userName;

    // 投保人类型  自然人/公司
    @NameInMap("user_type")
    public String userType;

    // 投保人电话号码
    @NameInMap("user_phone_number")
    public String userPhoneNumber;

    // 投保人证件号
    @NameInMap("user_cert_no")
    public String userCertNo;

    // 拓展信息
    @NameInMap("extend")
    public String extend;

    // 保单生效时间（毫秒值）
    @NameInMap("policy_effect_time")
    public Long policyEffectTime;

    // 保单失效时间（毫秒值）
    @NameInMap("policy_invalid_time")
    public Long policyInvalidTime;

    // 订单总金额 整型，以分为单位，50000分 = 500.00元
    @NameInMap("policy_total_amount")
    public Long policyTotalAmount;

    // 订单总期数（一次性付款用1）
    @NameInMap("policy_total_stage")
    public Long policyTotalStage;

    // 保费支付日期（毫秒值）
    @NameInMap("policy_pay_date")
    public Long policyPayDate;

    // 已支付保费期数（1代表1期）
    @NameInMap("policy_paid_stage")
    public Long policyPaidStage;

    // 每一期保费金额，整型，以分为单位，50000分 = 500.00元
    @NameInMap("policy_stage_aver_amount")
    public Long policyStageAverAmount;

    // 订单时间（毫秒值）
    @NameInMap("order_time")
    public Long orderTime;

    // 操作类型
    // 下单 支付 理赔 退单
    @NameInMap("operation")
    public String operation;

    // 授权列表
    @NameInMap("authorize_records")
    public java.util.List<AuthorizeRecordsPairs> authorizeRecords;

    // 活动码/赠险码
    @NameInMap("activity_code")
    public String activityCode;

    // 授权类型 1-已授权 2-未授权
    @NameInMap("authorization_type")
    @Validation(required = true)
    public Long authorizationType;

    public static OperateInsuranceRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateInsuranceRequest self = new OperateInsuranceRequest();
        return TeaModel.build(map, self);
    }

    public OperateInsuranceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateInsuranceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OperateInsuranceRequest setMechanismCode(String mechanismCode) {
        this.mechanismCode = mechanismCode;
        return this;
    }
    public String getMechanismCode() {
        return this.mechanismCode;
    }

    public OperateInsuranceRequest setPolicyEncryptionContext(String policyEncryptionContext) {
        this.policyEncryptionContext = policyEncryptionContext;
        return this;
    }
    public String getPolicyEncryptionContext() {
        return this.policyEncryptionContext;
    }

    public OperateInsuranceRequest setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
        return this;
    }
    public String getPolicyNo() {
        return this.policyNo;
    }

    public OperateInsuranceRequest setThirdPartSku(String thirdPartSku) {
        this.thirdPartSku = thirdPartSku;
        return this;
    }
    public String getThirdPartSku() {
        return this.thirdPartSku;
    }

    public OperateInsuranceRequest setMechanismName(String mechanismName) {
        this.mechanismName = mechanismName;
        return this;
    }
    public String getMechanismName() {
        return this.mechanismName;
    }

    public OperateInsuranceRequest setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
        return this;
    }
    public String getInsuranceType() {
        return this.insuranceType;
    }

    public OperateInsuranceRequest setSourceUid(String sourceUid) {
        this.sourceUid = sourceUid;
        return this;
    }
    public String getSourceUid() {
        return this.sourceUid;
    }

    public OperateInsuranceRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public OperateInsuranceRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public OperateInsuranceRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public OperateInsuranceRequest setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
        return this;
    }
    public String getUserPhoneNumber() {
        return this.userPhoneNumber;
    }

    public OperateInsuranceRequest setUserCertNo(String userCertNo) {
        this.userCertNo = userCertNo;
        return this;
    }
    public String getUserCertNo() {
        return this.userCertNo;
    }

    public OperateInsuranceRequest setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

    public OperateInsuranceRequest setPolicyEffectTime(Long policyEffectTime) {
        this.policyEffectTime = policyEffectTime;
        return this;
    }
    public Long getPolicyEffectTime() {
        return this.policyEffectTime;
    }

    public OperateInsuranceRequest setPolicyInvalidTime(Long policyInvalidTime) {
        this.policyInvalidTime = policyInvalidTime;
        return this;
    }
    public Long getPolicyInvalidTime() {
        return this.policyInvalidTime;
    }

    public OperateInsuranceRequest setPolicyTotalAmount(Long policyTotalAmount) {
        this.policyTotalAmount = policyTotalAmount;
        return this;
    }
    public Long getPolicyTotalAmount() {
        return this.policyTotalAmount;
    }

    public OperateInsuranceRequest setPolicyTotalStage(Long policyTotalStage) {
        this.policyTotalStage = policyTotalStage;
        return this;
    }
    public Long getPolicyTotalStage() {
        return this.policyTotalStage;
    }

    public OperateInsuranceRequest setPolicyPayDate(Long policyPayDate) {
        this.policyPayDate = policyPayDate;
        return this;
    }
    public Long getPolicyPayDate() {
        return this.policyPayDate;
    }

    public OperateInsuranceRequest setPolicyPaidStage(Long policyPaidStage) {
        this.policyPaidStage = policyPaidStage;
        return this;
    }
    public Long getPolicyPaidStage() {
        return this.policyPaidStage;
    }

    public OperateInsuranceRequest setPolicyStageAverAmount(Long policyStageAverAmount) {
        this.policyStageAverAmount = policyStageAverAmount;
        return this;
    }
    public Long getPolicyStageAverAmount() {
        return this.policyStageAverAmount;
    }

    public OperateInsuranceRequest setOrderTime(Long orderTime) {
        this.orderTime = orderTime;
        return this;
    }
    public Long getOrderTime() {
        return this.orderTime;
    }

    public OperateInsuranceRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public OperateInsuranceRequest setAuthorizeRecords(java.util.List<AuthorizeRecordsPairs> authorizeRecords) {
        this.authorizeRecords = authorizeRecords;
        return this;
    }
    public java.util.List<AuthorizeRecordsPairs> getAuthorizeRecords() {
        return this.authorizeRecords;
    }

    public OperateInsuranceRequest setActivityCode(String activityCode) {
        this.activityCode = activityCode;
        return this;
    }
    public String getActivityCode() {
        return this.activityCode;
    }

    public OperateInsuranceRequest setAuthorizationType(Long authorizationType) {
        this.authorizationType = authorizationType;
        return this;
    }
    public Long getAuthorizationType() {
        return this.authorizationType;
    }

}
