// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bbp.models;

import com.aliyun.tea.*;

public class InsuranceRecordModel extends TeaModel {
    // 保司编码
    @NameInMap("mechanism_code")
    @Validation(required = true)
    public String mechanismCode;

    // 保单号
    @NameInMap("policy_no")
    @Validation(required = true)
    public String policyNo;

    // 保险产品SKU
    @NameInMap("third_part_sku")
    public String thirdPartSku;

    // 保司机构名称
    @NameInMap("mechanism_name")
    public String mechanismName;

    // 保险类型
    @NameInMap("insurance_type")
    @Validation(required = true)
    public String insuranceType;

    // 用户ID，天猫uid
    @NameInMap("source_uid")
    @Validation(required = true)
    public String sourceUid;

    // 渠道来源 TIANMAO（天猫）
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 用户类型 PERSON
    @NameInMap("user_type")
    @Validation(required = true)
    public String userType;

    // 扩展信息 （保单附件路径）
    @NameInMap("extend")
    public String extend;

    // 保单生效时间
    @NameInMap("policy_effect_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String policyEffectTime;

    // 保单失效时间
    @NameInMap("policy_invalid_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String policyInvalidTime;

    // 订单总金额 单位为分
    @NameInMap("policy_total_amount")
    @Validation(required = true)
    public Long policyTotalAmount;

    // 保费支付日期
    @NameInMap("policy_pay_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String policyPayDate;

    // 保单支付总期数
    @NameInMap("policy_total_stage")
    @Validation(required = true)
    public Long policyTotalStage;

    // 每期支付金额
    @NameInMap("policy_stage_aver_amount")
    public Long policyStageAverAmount;

    // 保单已支付期数
    @NameInMap("policy_paid_stage")
    public Long policyPaidStage;

    // 订单时间
    @NameInMap("order_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String orderTime;

    // 活动码 赠险/商业险
    @NameInMap("activity_code")
    public String activityCode;

    // 授权类型 0 非授权 1 授权
    @NameInMap("authorization_type")
    @Validation(required = true)
    public Long authorizationType;

    public static InsuranceRecordModel build(java.util.Map<String, ?> map) throws Exception {
        InsuranceRecordModel self = new InsuranceRecordModel();
        return TeaModel.build(map, self);
    }

    public InsuranceRecordModel setMechanismCode(String mechanismCode) {
        this.mechanismCode = mechanismCode;
        return this;
    }
    public String getMechanismCode() {
        return this.mechanismCode;
    }

    public InsuranceRecordModel setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
        return this;
    }
    public String getPolicyNo() {
        return this.policyNo;
    }

    public InsuranceRecordModel setThirdPartSku(String thirdPartSku) {
        this.thirdPartSku = thirdPartSku;
        return this;
    }
    public String getThirdPartSku() {
        return this.thirdPartSku;
    }

    public InsuranceRecordModel setMechanismName(String mechanismName) {
        this.mechanismName = mechanismName;
        return this;
    }
    public String getMechanismName() {
        return this.mechanismName;
    }

    public InsuranceRecordModel setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
        return this;
    }
    public String getInsuranceType() {
        return this.insuranceType;
    }

    public InsuranceRecordModel setSourceUid(String sourceUid) {
        this.sourceUid = sourceUid;
        return this;
    }
    public String getSourceUid() {
        return this.sourceUid;
    }

    public InsuranceRecordModel setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public InsuranceRecordModel setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public InsuranceRecordModel setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

    public InsuranceRecordModel setPolicyEffectTime(String policyEffectTime) {
        this.policyEffectTime = policyEffectTime;
        return this;
    }
    public String getPolicyEffectTime() {
        return this.policyEffectTime;
    }

    public InsuranceRecordModel setPolicyInvalidTime(String policyInvalidTime) {
        this.policyInvalidTime = policyInvalidTime;
        return this;
    }
    public String getPolicyInvalidTime() {
        return this.policyInvalidTime;
    }

    public InsuranceRecordModel setPolicyTotalAmount(Long policyTotalAmount) {
        this.policyTotalAmount = policyTotalAmount;
        return this;
    }
    public Long getPolicyTotalAmount() {
        return this.policyTotalAmount;
    }

    public InsuranceRecordModel setPolicyPayDate(String policyPayDate) {
        this.policyPayDate = policyPayDate;
        return this;
    }
    public String getPolicyPayDate() {
        return this.policyPayDate;
    }

    public InsuranceRecordModel setPolicyTotalStage(Long policyTotalStage) {
        this.policyTotalStage = policyTotalStage;
        return this;
    }
    public Long getPolicyTotalStage() {
        return this.policyTotalStage;
    }

    public InsuranceRecordModel setPolicyStageAverAmount(Long policyStageAverAmount) {
        this.policyStageAverAmount = policyStageAverAmount;
        return this;
    }
    public Long getPolicyStageAverAmount() {
        return this.policyStageAverAmount;
    }

    public InsuranceRecordModel setPolicyPaidStage(Long policyPaidStage) {
        this.policyPaidStage = policyPaidStage;
        return this;
    }
    public Long getPolicyPaidStage() {
        return this.policyPaidStage;
    }

    public InsuranceRecordModel setOrderTime(String orderTime) {
        this.orderTime = orderTime;
        return this;
    }
    public String getOrderTime() {
        return this.orderTime;
    }

    public InsuranceRecordModel setActivityCode(String activityCode) {
        this.activityCode = activityCode;
        return this;
    }
    public String getActivityCode() {
        return this.activityCode;
    }

    public InsuranceRecordModel setAuthorizationType(Long authorizationType) {
        this.authorizationType = authorizationType;
        return this;
    }
    public Long getAuthorizationType() {
        return this.authorizationType;
    }

}
