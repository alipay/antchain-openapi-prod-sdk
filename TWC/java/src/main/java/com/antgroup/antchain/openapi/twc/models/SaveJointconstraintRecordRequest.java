// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class SaveJointconstraintRecordRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 收款账户
    @NameInMap("beneficiary_account_code")
    public String beneficiaryAccountCode;

    // 收款账户类型
    // 
    // 1：支付宝
    @NameInMap("beneficiary_account_type")
    public Long beneficiaryAccountType;

    // 应收方证件号码
    // 
    // 
    @NameInMap("beneficiary_cert_number")
    @Validation(required = true)
    public String beneficiaryCertNumber;

    // 应收方证件类型
    // 
    // 0：统一社会信用代码
    // 
    // 1：身份证号码
    @NameInMap("beneficiary_cert_type")
    @Validation(required = true)
    public Long beneficiaryCertType;

    // 	
    // 应收方类型
    // 
    // 0：企业
    // 
    // 1：个人
    @NameInMap("beneficiary_type")
    @Validation(required = true)
    public Long beneficiaryType;

    // 合同编号
    @NameInMap("contract_code")
    @Validation(required = true)
    public String contractCode;

    // 合同履行记录标签
    @NameInMap("contract_fulfillment_code")
    @Validation(required = true)
    public String contractFulfillmentCode;

    // 合同名称
    @NameInMap("contract_name")
    @Validation(required = true)
    public String contractName;

    // 合同存证哈希
    @NameInMap("contract_txhash")
    @Validation(required = true)
    public String contractTxhash;

    // 商户端合同链接
    // 
    // 从智能合同小程序中跳转至商户端查看合同内容链接
    @NameInMap("external_url")
    public String externalUrl;

    // 所属行业，来自合同
    // 
    // 
    @NameInMap("industry_code")
    public String industryCode;

    // 已付金额
    // 
    // 
    @NameInMap("paid_amount")
    public String paidAmount;

    // 支付凭据
    // 
    // 
    @NameInMap("paid_proof")
    public String paidProof;

    // 付款时间
    // 
    // 
    @NameInMap("paid_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String paidTime;

    // 付款账户
    // 
    // 
    @NameInMap("payer_account_code")
    public String payerAccountCode;

    // 	
    // 付款账户类型
    // 
    // 1：支付宝
    @NameInMap("payer_account_type")
    public Long payerAccountType;

    // 应付方证件号码
    // 
    // 
    @NameInMap("payer_cert_number")
    @Validation(required = true)
    public String payerCertNumber;

    // 应付方证件类型
    // 
    // 0：统一社会信用代码
    // 
    // 1：身份证号码
    @NameInMap("payer_cert_type")
    @Validation(required = true)
    public Long payerCertType;

    // 应付方类型
    // 
    // 0：企业
    // 
    // 1：个人
    @NameInMap("payer_type")
    @Validation(required = true)
    public Long payerType;

    // 履约标的金额
    // 
    // 
    @NameInMap("payment_amount")
    @Validation(required = true)
    public String paymentAmount;

    // 履约宽限期，单位：天
    // 
    // 
    @NameInMap("payment_date_buffer")
    public Long paymentDateBuffer;

    // 目标履约日期
    // 
    // 
    @NameInMap("payment_deadline")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String paymentDeadline;

    public static SaveJointconstraintRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveJointconstraintRecordRequest self = new SaveJointconstraintRecordRequest();
        return TeaModel.build(map, self);
    }

    public SaveJointconstraintRecordRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveJointconstraintRecordRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveJointconstraintRecordRequest setBeneficiaryAccountCode(String beneficiaryAccountCode) {
        this.beneficiaryAccountCode = beneficiaryAccountCode;
        return this;
    }
    public String getBeneficiaryAccountCode() {
        return this.beneficiaryAccountCode;
    }

    public SaveJointconstraintRecordRequest setBeneficiaryAccountType(Long beneficiaryAccountType) {
        this.beneficiaryAccountType = beneficiaryAccountType;
        return this;
    }
    public Long getBeneficiaryAccountType() {
        return this.beneficiaryAccountType;
    }

    public SaveJointconstraintRecordRequest setBeneficiaryCertNumber(String beneficiaryCertNumber) {
        this.beneficiaryCertNumber = beneficiaryCertNumber;
        return this;
    }
    public String getBeneficiaryCertNumber() {
        return this.beneficiaryCertNumber;
    }

    public SaveJointconstraintRecordRequest setBeneficiaryCertType(Long beneficiaryCertType) {
        this.beneficiaryCertType = beneficiaryCertType;
        return this;
    }
    public Long getBeneficiaryCertType() {
        return this.beneficiaryCertType;
    }

    public SaveJointconstraintRecordRequest setBeneficiaryType(Long beneficiaryType) {
        this.beneficiaryType = beneficiaryType;
        return this;
    }
    public Long getBeneficiaryType() {
        return this.beneficiaryType;
    }

    public SaveJointconstraintRecordRequest setContractCode(String contractCode) {
        this.contractCode = contractCode;
        return this;
    }
    public String getContractCode() {
        return this.contractCode;
    }

    public SaveJointconstraintRecordRequest setContractFulfillmentCode(String contractFulfillmentCode) {
        this.contractFulfillmentCode = contractFulfillmentCode;
        return this;
    }
    public String getContractFulfillmentCode() {
        return this.contractFulfillmentCode;
    }

    public SaveJointconstraintRecordRequest setContractName(String contractName) {
        this.contractName = contractName;
        return this;
    }
    public String getContractName() {
        return this.contractName;
    }

    public SaveJointconstraintRecordRequest setContractTxhash(String contractTxhash) {
        this.contractTxhash = contractTxhash;
        return this;
    }
    public String getContractTxhash() {
        return this.contractTxhash;
    }

    public SaveJointconstraintRecordRequest setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
        return this;
    }
    public String getExternalUrl() {
        return this.externalUrl;
    }

    public SaveJointconstraintRecordRequest setIndustryCode(String industryCode) {
        this.industryCode = industryCode;
        return this;
    }
    public String getIndustryCode() {
        return this.industryCode;
    }

    public SaveJointconstraintRecordRequest setPaidAmount(String paidAmount) {
        this.paidAmount = paidAmount;
        return this;
    }
    public String getPaidAmount() {
        return this.paidAmount;
    }

    public SaveJointconstraintRecordRequest setPaidProof(String paidProof) {
        this.paidProof = paidProof;
        return this;
    }
    public String getPaidProof() {
        return this.paidProof;
    }

    public SaveJointconstraintRecordRequest setPaidTime(String paidTime) {
        this.paidTime = paidTime;
        return this;
    }
    public String getPaidTime() {
        return this.paidTime;
    }

    public SaveJointconstraintRecordRequest setPayerAccountCode(String payerAccountCode) {
        this.payerAccountCode = payerAccountCode;
        return this;
    }
    public String getPayerAccountCode() {
        return this.payerAccountCode;
    }

    public SaveJointconstraintRecordRequest setPayerAccountType(Long payerAccountType) {
        this.payerAccountType = payerAccountType;
        return this;
    }
    public Long getPayerAccountType() {
        return this.payerAccountType;
    }

    public SaveJointconstraintRecordRequest setPayerCertNumber(String payerCertNumber) {
        this.payerCertNumber = payerCertNumber;
        return this;
    }
    public String getPayerCertNumber() {
        return this.payerCertNumber;
    }

    public SaveJointconstraintRecordRequest setPayerCertType(Long payerCertType) {
        this.payerCertType = payerCertType;
        return this;
    }
    public Long getPayerCertType() {
        return this.payerCertType;
    }

    public SaveJointconstraintRecordRequest setPayerType(Long payerType) {
        this.payerType = payerType;
        return this;
    }
    public Long getPayerType() {
        return this.payerType;
    }

    public SaveJointconstraintRecordRequest setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
        return this;
    }
    public String getPaymentAmount() {
        return this.paymentAmount;
    }

    public SaveJointconstraintRecordRequest setPaymentDateBuffer(Long paymentDateBuffer) {
        this.paymentDateBuffer = paymentDateBuffer;
        return this;
    }
    public Long getPaymentDateBuffer() {
        return this.paymentDateBuffer;
    }

    public SaveJointconstraintRecordRequest setPaymentDeadline(String paymentDeadline) {
        this.paymentDeadline = paymentDeadline;
        return this;
    }
    public String getPaymentDeadline() {
        return this.paymentDeadline;
    }

}
