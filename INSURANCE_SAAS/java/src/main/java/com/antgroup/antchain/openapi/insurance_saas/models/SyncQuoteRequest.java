// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class SyncQuoteRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 询价申请号
    @NameInMap("inquiry_no")
    public String inquiryNo;

    // 询价平台
    @NameInMap("inquire_platform")
    public String inquirePlatform;

    // 单次保额
    @NameInMap("single_insurance_amount")
    @Validation(required = true)
    public String singleInsuranceAmount;

    // 总保额
    @NameInMap("total_insurance_amount")
    @Validation(required = true)
    public String totalInsuranceAmount;

    // 询价基础材料
    @NameInMap("material_list")
    public String materialList;

    // 标的材料列表
    @NameInMap("object_list")
    public String objectList;

    // 保司编号
    @NameInMap("insurance_company_no")
    @Validation(required = true)
    public String insuranceCompanyNo;

    // 保险产品编码
    @NameInMap("trustworthy_value_insurance_type_code")
    @Validation(required = true)
    public String trustworthyValueInsuranceTypeCode;

    // 保司项目代码
    @NameInMap("insurance_project_code")
    @Validation(required = true)
    public String insuranceProjectCode;

    // 保司方案代码
    @NameInMap("insurance_options_code")
    @Validation(required = true)
    public String insuranceOptionsCode;

    // 询价人
    @NameInMap("inquirer")
    public String inquirer;

    // 投保人
    @NameInMap("applicant")
    public String applicant;

    // 被保人列表
    @NameInMap("insured_list")
    public String insuredList;

    // 报价结果
    @NameInMap("quotation")
    public String quotation;

    public static SyncQuoteRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncQuoteRequest self = new SyncQuoteRequest();
        return TeaModel.build(map, self);
    }

    public SyncQuoteRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncQuoteRequest setInquiryNo(String inquiryNo) {
        this.inquiryNo = inquiryNo;
        return this;
    }
    public String getInquiryNo() {
        return this.inquiryNo;
    }

    public SyncQuoteRequest setInquirePlatform(String inquirePlatform) {
        this.inquirePlatform = inquirePlatform;
        return this;
    }
    public String getInquirePlatform() {
        return this.inquirePlatform;
    }

    public SyncQuoteRequest setSingleInsuranceAmount(String singleInsuranceAmount) {
        this.singleInsuranceAmount = singleInsuranceAmount;
        return this;
    }
    public String getSingleInsuranceAmount() {
        return this.singleInsuranceAmount;
    }

    public SyncQuoteRequest setTotalInsuranceAmount(String totalInsuranceAmount) {
        this.totalInsuranceAmount = totalInsuranceAmount;
        return this;
    }
    public String getTotalInsuranceAmount() {
        return this.totalInsuranceAmount;
    }

    public SyncQuoteRequest setMaterialList(String materialList) {
        this.materialList = materialList;
        return this;
    }
    public String getMaterialList() {
        return this.materialList;
    }

    public SyncQuoteRequest setObjectList(String objectList) {
        this.objectList = objectList;
        return this;
    }
    public String getObjectList() {
        return this.objectList;
    }

    public SyncQuoteRequest setInsuranceCompanyNo(String insuranceCompanyNo) {
        this.insuranceCompanyNo = insuranceCompanyNo;
        return this;
    }
    public String getInsuranceCompanyNo() {
        return this.insuranceCompanyNo;
    }

    public SyncQuoteRequest setTrustworthyValueInsuranceTypeCode(String trustworthyValueInsuranceTypeCode) {
        this.trustworthyValueInsuranceTypeCode = trustworthyValueInsuranceTypeCode;
        return this;
    }
    public String getTrustworthyValueInsuranceTypeCode() {
        return this.trustworthyValueInsuranceTypeCode;
    }

    public SyncQuoteRequest setInsuranceProjectCode(String insuranceProjectCode) {
        this.insuranceProjectCode = insuranceProjectCode;
        return this;
    }
    public String getInsuranceProjectCode() {
        return this.insuranceProjectCode;
    }

    public SyncQuoteRequest setInsuranceOptionsCode(String insuranceOptionsCode) {
        this.insuranceOptionsCode = insuranceOptionsCode;
        return this;
    }
    public String getInsuranceOptionsCode() {
        return this.insuranceOptionsCode;
    }

    public SyncQuoteRequest setInquirer(String inquirer) {
        this.inquirer = inquirer;
        return this;
    }
    public String getInquirer() {
        return this.inquirer;
    }

    public SyncQuoteRequest setApplicant(String applicant) {
        this.applicant = applicant;
        return this;
    }
    public String getApplicant() {
        return this.applicant;
    }

    public SyncQuoteRequest setInsuredList(String insuredList) {
        this.insuredList = insuredList;
        return this;
    }
    public String getInsuredList() {
        return this.insuredList;
    }

    public SyncQuoteRequest setQuotation(String quotation) {
        this.quotation = quotation;
        return this;
    }
    public String getQuotation() {
        return this.quotation;
    }

}
