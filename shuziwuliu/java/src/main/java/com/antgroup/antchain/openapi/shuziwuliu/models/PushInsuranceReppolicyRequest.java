// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class PushInsuranceReppolicyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 直保人租户ID
    @NameInMap("platform_code")
    @Validation(required = true, maxLength = 50)
    public String platformCode;

    // 直保人
    @NameInMap("direct_insurer_name")
    @Validation(required = true, maxLength = 200)
    public String directInsurerName;

    // 保单号
    @NameInMap("pol_no")
    @Validation(required = true, maxLength = 100)
    public String polNo;

    // 共保标志，1:是 0:否
    @NameInMap("joint_insurance_logo")
    @Validation(maxLength = 5)
    public String jointInsuranceLogo;

    // 共保比例（%）
    @NameInMap("joint_insurance_rate")
    @Validation(maxLength = 5)
    public String jointInsuranceRate;

    // 险种代码
    @NameInMap("product_code")
    @Validation(required = true, maxLength = 20)
    public String productCode;

    // 险种名称
    @NameInMap("product_name")
    @Validation(required = true, maxLength = 100)
    public String productName;

    // 被保险人
    @NameInMap("bbr_name")
    @Validation(required = true, maxLength = 200)
    public String bbrName;

    // 保险起期
    @NameInMap("insure_start")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String insureStart;

    // 保险止期
    @NameInMap("insure_end")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String insureEnd;

    // 币种，CNY:人民币, USD:美元，JPY:日元，HKD:港元，EUR:欧元，GBP英镑
    @NameInMap("currency")
    @Validation(required = true, maxLength = 10)
    public String currency;

    // 保费
    @NameInMap("premium")
    @Validation(required = true, maxLength = 20)
    public String premium;

    // 保额
    @NameInMap("insurance_amount")
    @Validation(maxLength = 20)
    public String insuranceAmount;

    // 固定保额分出比例（%）
    @NameInMap("fixed_insurance_amount_split_rate")
    @Validation(maxLength = 5)
    public String fixedInsuranceAmountSplitRate;

    // 固定保费分出比例（%）
    @NameInMap("fixed_premium_split_rate")
    @Validation(required = true, maxLength = 5)
    public String fixedPremiumSplitRate;

    // 临分保额分出比例（%）
    @NameInMap("facultative_insurance_amount_split_rate")
    @Validation(maxLength = 5)
    public String facultativeInsuranceAmountSplitRate;

    // 临分保费分出比例（%）
    @NameInMap("facultative_premium_split_rate")
    @Validation(required = true, maxLength = 5)
    public String facultativePremiumSplitRate;

    // 分出保费
    @NameInMap("split_premium")
    @Validation(required = true, maxLength = 20)
    public String splitPremium;

    // 再保人
    @NameInMap("reinsurer")
    @Validation(required = true, maxLength = 100)
    public String reinsurer;

    // 摊回手续费比例（%）
    @NameInMap("amortize_fee_rate")
    @Validation(required = true, maxLength = 5)
    public String amortizeFeeRate;

    // 摊回手续费
    @NameInMap("amortize_fee")
    @Validation(required = true, maxLength = 20)
    public String amortizeFee;

    // 再保合同名称
    @NameInMap("reinsurance_contract_name")
    @Validation(maxLength = 200)
    public String reinsuranceContractName;

    // 是否有超赔临分，1:是 0:否
    @NameInMap("over_pay_facultative")
    @Validation(maxLength = 5)
    public String overPayFacultative;

    // 项目名称
    @NameInMap("project_name")
    @Validation(maxLength = 100)
    public String projectName;

    // 接收方租户id
    @NameInMap("receiver_platform_id")
    @Validation(required = true, maxLength = 50)
    public String receiverPlatformId;

    public static PushInsuranceReppolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        PushInsuranceReppolicyRequest self = new PushInsuranceReppolicyRequest();
        return TeaModel.build(map, self);
    }

    public PushInsuranceReppolicyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushInsuranceReppolicyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushInsuranceReppolicyRequest setPlatformCode(String platformCode) {
        this.platformCode = platformCode;
        return this;
    }
    public String getPlatformCode() {
        return this.platformCode;
    }

    public PushInsuranceReppolicyRequest setDirectInsurerName(String directInsurerName) {
        this.directInsurerName = directInsurerName;
        return this;
    }
    public String getDirectInsurerName() {
        return this.directInsurerName;
    }

    public PushInsuranceReppolicyRequest setPolNo(String polNo) {
        this.polNo = polNo;
        return this;
    }
    public String getPolNo() {
        return this.polNo;
    }

    public PushInsuranceReppolicyRequest setJointInsuranceLogo(String jointInsuranceLogo) {
        this.jointInsuranceLogo = jointInsuranceLogo;
        return this;
    }
    public String getJointInsuranceLogo() {
        return this.jointInsuranceLogo;
    }

    public PushInsuranceReppolicyRequest setJointInsuranceRate(String jointInsuranceRate) {
        this.jointInsuranceRate = jointInsuranceRate;
        return this;
    }
    public String getJointInsuranceRate() {
        return this.jointInsuranceRate;
    }

    public PushInsuranceReppolicyRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public PushInsuranceReppolicyRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public PushInsuranceReppolicyRequest setBbrName(String bbrName) {
        this.bbrName = bbrName;
        return this;
    }
    public String getBbrName() {
        return this.bbrName;
    }

    public PushInsuranceReppolicyRequest setInsureStart(String insureStart) {
        this.insureStart = insureStart;
        return this;
    }
    public String getInsureStart() {
        return this.insureStart;
    }

    public PushInsuranceReppolicyRequest setInsureEnd(String insureEnd) {
        this.insureEnd = insureEnd;
        return this;
    }
    public String getInsureEnd() {
        return this.insureEnd;
    }

    public PushInsuranceReppolicyRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public PushInsuranceReppolicyRequest setPremium(String premium) {
        this.premium = premium;
        return this;
    }
    public String getPremium() {
        return this.premium;
    }

    public PushInsuranceReppolicyRequest setInsuranceAmount(String insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
        return this;
    }
    public String getInsuranceAmount() {
        return this.insuranceAmount;
    }

    public PushInsuranceReppolicyRequest setFixedInsuranceAmountSplitRate(String fixedInsuranceAmountSplitRate) {
        this.fixedInsuranceAmountSplitRate = fixedInsuranceAmountSplitRate;
        return this;
    }
    public String getFixedInsuranceAmountSplitRate() {
        return this.fixedInsuranceAmountSplitRate;
    }

    public PushInsuranceReppolicyRequest setFixedPremiumSplitRate(String fixedPremiumSplitRate) {
        this.fixedPremiumSplitRate = fixedPremiumSplitRate;
        return this;
    }
    public String getFixedPremiumSplitRate() {
        return this.fixedPremiumSplitRate;
    }

    public PushInsuranceReppolicyRequest setFacultativeInsuranceAmountSplitRate(String facultativeInsuranceAmountSplitRate) {
        this.facultativeInsuranceAmountSplitRate = facultativeInsuranceAmountSplitRate;
        return this;
    }
    public String getFacultativeInsuranceAmountSplitRate() {
        return this.facultativeInsuranceAmountSplitRate;
    }

    public PushInsuranceReppolicyRequest setFacultativePremiumSplitRate(String facultativePremiumSplitRate) {
        this.facultativePremiumSplitRate = facultativePremiumSplitRate;
        return this;
    }
    public String getFacultativePremiumSplitRate() {
        return this.facultativePremiumSplitRate;
    }

    public PushInsuranceReppolicyRequest setSplitPremium(String splitPremium) {
        this.splitPremium = splitPremium;
        return this;
    }
    public String getSplitPremium() {
        return this.splitPremium;
    }

    public PushInsuranceReppolicyRequest setReinsurer(String reinsurer) {
        this.reinsurer = reinsurer;
        return this;
    }
    public String getReinsurer() {
        return this.reinsurer;
    }

    public PushInsuranceReppolicyRequest setAmortizeFeeRate(String amortizeFeeRate) {
        this.amortizeFeeRate = amortizeFeeRate;
        return this;
    }
    public String getAmortizeFeeRate() {
        return this.amortizeFeeRate;
    }

    public PushInsuranceReppolicyRequest setAmortizeFee(String amortizeFee) {
        this.amortizeFee = amortizeFee;
        return this;
    }
    public String getAmortizeFee() {
        return this.amortizeFee;
    }

    public PushInsuranceReppolicyRequest setReinsuranceContractName(String reinsuranceContractName) {
        this.reinsuranceContractName = reinsuranceContractName;
        return this;
    }
    public String getReinsuranceContractName() {
        return this.reinsuranceContractName;
    }

    public PushInsuranceReppolicyRequest setOverPayFacultative(String overPayFacultative) {
        this.overPayFacultative = overPayFacultative;
        return this;
    }
    public String getOverPayFacultative() {
        return this.overPayFacultative;
    }

    public PushInsuranceReppolicyRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public PushInsuranceReppolicyRequest setReceiverPlatformId(String receiverPlatformId) {
        this.receiverPlatformId = receiverPlatformId;
        return this;
    }
    public String getReceiverPlatformId() {
        return this.receiverPlatformId;
    }

}
