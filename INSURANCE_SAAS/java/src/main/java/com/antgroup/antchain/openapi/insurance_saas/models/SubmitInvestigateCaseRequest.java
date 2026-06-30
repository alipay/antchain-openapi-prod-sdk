// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class SubmitInvestigateCaseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 报案号 - 外部唯一ID
    @NameInMap("report_no")
    @Validation(required = true)
    public String reportNo;

    // 外部单据号
    @NameInMap("out_case_no")
    @Validation(required = true)
    public String outCaseNo;

    // 案件号
    @NameInMap("policy_no")
    public String policyNo;

    // 委托的保司ID
    @NameInMap("entrust_insurance_company_id")
    @Validation(required = true)
    public String entrustInsuranceCompanyId;

    // 要求完成时间，时间戳
    @NameInMap("invest_end_time")
    @Validation(required = true)
    public Long investEndTime;

    // 委托联系人
    @NameInMap("entrust_name")
    @Validation(required = true)
    public String entrustName;

    // 委托联系人电话
    @NameInMap("entrust_tel")
    @Validation(required = true)
    public String entrustTel;

    // 委托时间，时间戳
    @NameInMap("entrust_time")
    @Validation(required = true)
    public Long entrustTime;

    // 出险人电话号码
    @NameInMap("accident_tel")
    @Validation(required = true)
    public String accidentTel;

    // 出险人姓名
    @NameInMap("accident_name")
    @Validation(required = true)
    public String accidentName;

    // 出险人证件号
    @NameInMap("accident_card_no")
    @Validation(required = true)
    public String accidentCardNo;

    // 出险人证件类型，10-身份证/11-户口本/13-军官证/17-港澳通行证/18-台湾通行证/51-护照/99-其他
    @NameInMap("accident_card_type")
    @Validation(required = true)
    public String accidentCardType;

    // 出险经过
    @NameInMap("accident_desc")
    @Validation(required = true)
    public String accidentDesc;

    // 出险人地址中文名
    @NameInMap("accident_address_info")
    @Validation(required = true)
    public String accidentAddressInfo;

    // 出险人详细住址
    @NameInMap("accident_address_detail")
    @Validation(required = true)
    public String accidentAddressDetail;

    // 出险日期，时间戳
    @NameInMap("accident_time")
    @Validation(required = true)
    public Long accidentTime;

    // 报案人电话号码
    @NameInMap("reporter_tel")
    @Validation(required = true)
    public String reporterTel;

    // 报案人姓名
    @NameInMap("reporter_name")
    @Validation(required = true)
    public String reporterName;

    // 报案人证件号
    @NameInMap("reporter_card_no")
    @Validation(required = true)
    public String reporterCardNo;

    // 报案人证件类型，10-身份证/11-户口本/13-军官证/17-港澳通行证/18-台湾通行证/51-护照/99-其他
    @NameInMap("reporter_card_type")
    @Validation(required = true)
    public String reporterCardType;

    // 报案人与出险人的关系
    // 1本人，2配偶，3父母，4子女，5其他
    @NameInMap("reporter_relation_to_accident")
    @Validation(required = true)
    public String reporterRelationToAccident;

    // 报案时间，时间戳
    @NameInMap("report_time")
    public Long reportTime;

    // 事故发生地址中文名，格式：省-市-区，如浙江省-杭州市-西湖区
    @NameInMap("event_address_info")
    @Validation(required = true)
    public String eventAddressInfo;

    // 事故发生详细地点
    @NameInMap("event_address_detail")
    @Validation(required = true)
    public String eventAddressDetail;

    // 确诊医院
    @NameInMap("confirm_hospital")
    @Validation(required = true)
    public String confirmHospital;

    // 确诊医院地址信息，格式：省-市-区，如浙江省-杭州市-西湖区
    @NameInMap("confirm_hospital_address_info")
    @Validation(required = true)
    public String confirmHospitalAddressInfo;

    // 确诊疾病名称
    @NameInMap("confirm_illness_name")
    @Validation(required = true)
    public String confirmIllnessName;

    // 产品大类 重疾或者医疗险
    @NameInMap("product_type")
    @Validation(required = true)
    public String productType;

    // 文件列表
    @NameInMap("file_list")
    @Validation(required = true)
    public java.util.List<FileNode> fileList;

    // 委托险种集合信息
    @NameInMap("entrust_guarantee_product_list")
    @Validation(required = true)
    public java.util.List<EntrustGuaranteeProduct> entrustGuaranteeProductList;

    public static SubmitInvestigateCaseRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitInvestigateCaseRequest self = new SubmitInvestigateCaseRequest();
        return TeaModel.build(map, self);
    }

    public SubmitInvestigateCaseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitInvestigateCaseRequest setReportNo(String reportNo) {
        this.reportNo = reportNo;
        return this;
    }
    public String getReportNo() {
        return this.reportNo;
    }

    public SubmitInvestigateCaseRequest setOutCaseNo(String outCaseNo) {
        this.outCaseNo = outCaseNo;
        return this;
    }
    public String getOutCaseNo() {
        return this.outCaseNo;
    }

    public SubmitInvestigateCaseRequest setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
        return this;
    }
    public String getPolicyNo() {
        return this.policyNo;
    }

    public SubmitInvestigateCaseRequest setEntrustInsuranceCompanyId(String entrustInsuranceCompanyId) {
        this.entrustInsuranceCompanyId = entrustInsuranceCompanyId;
        return this;
    }
    public String getEntrustInsuranceCompanyId() {
        return this.entrustInsuranceCompanyId;
    }

    public SubmitInvestigateCaseRequest setInvestEndTime(Long investEndTime) {
        this.investEndTime = investEndTime;
        return this;
    }
    public Long getInvestEndTime() {
        return this.investEndTime;
    }

    public SubmitInvestigateCaseRequest setEntrustName(String entrustName) {
        this.entrustName = entrustName;
        return this;
    }
    public String getEntrustName() {
        return this.entrustName;
    }

    public SubmitInvestigateCaseRequest setEntrustTel(String entrustTel) {
        this.entrustTel = entrustTel;
        return this;
    }
    public String getEntrustTel() {
        return this.entrustTel;
    }

    public SubmitInvestigateCaseRequest setEntrustTime(Long entrustTime) {
        this.entrustTime = entrustTime;
        return this;
    }
    public Long getEntrustTime() {
        return this.entrustTime;
    }

    public SubmitInvestigateCaseRequest setAccidentTel(String accidentTel) {
        this.accidentTel = accidentTel;
        return this;
    }
    public String getAccidentTel() {
        return this.accidentTel;
    }

    public SubmitInvestigateCaseRequest setAccidentName(String accidentName) {
        this.accidentName = accidentName;
        return this;
    }
    public String getAccidentName() {
        return this.accidentName;
    }

    public SubmitInvestigateCaseRequest setAccidentCardNo(String accidentCardNo) {
        this.accidentCardNo = accidentCardNo;
        return this;
    }
    public String getAccidentCardNo() {
        return this.accidentCardNo;
    }

    public SubmitInvestigateCaseRequest setAccidentCardType(String accidentCardType) {
        this.accidentCardType = accidentCardType;
        return this;
    }
    public String getAccidentCardType() {
        return this.accidentCardType;
    }

    public SubmitInvestigateCaseRequest setAccidentDesc(String accidentDesc) {
        this.accidentDesc = accidentDesc;
        return this;
    }
    public String getAccidentDesc() {
        return this.accidentDesc;
    }

    public SubmitInvestigateCaseRequest setAccidentAddressInfo(String accidentAddressInfo) {
        this.accidentAddressInfo = accidentAddressInfo;
        return this;
    }
    public String getAccidentAddressInfo() {
        return this.accidentAddressInfo;
    }

    public SubmitInvestigateCaseRequest setAccidentAddressDetail(String accidentAddressDetail) {
        this.accidentAddressDetail = accidentAddressDetail;
        return this;
    }
    public String getAccidentAddressDetail() {
        return this.accidentAddressDetail;
    }

    public SubmitInvestigateCaseRequest setAccidentTime(Long accidentTime) {
        this.accidentTime = accidentTime;
        return this;
    }
    public Long getAccidentTime() {
        return this.accidentTime;
    }

    public SubmitInvestigateCaseRequest setReporterTel(String reporterTel) {
        this.reporterTel = reporterTel;
        return this;
    }
    public String getReporterTel() {
        return this.reporterTel;
    }

    public SubmitInvestigateCaseRequest setReporterName(String reporterName) {
        this.reporterName = reporterName;
        return this;
    }
    public String getReporterName() {
        return this.reporterName;
    }

    public SubmitInvestigateCaseRequest setReporterCardNo(String reporterCardNo) {
        this.reporterCardNo = reporterCardNo;
        return this;
    }
    public String getReporterCardNo() {
        return this.reporterCardNo;
    }

    public SubmitInvestigateCaseRequest setReporterCardType(String reporterCardType) {
        this.reporterCardType = reporterCardType;
        return this;
    }
    public String getReporterCardType() {
        return this.reporterCardType;
    }

    public SubmitInvestigateCaseRequest setReporterRelationToAccident(String reporterRelationToAccident) {
        this.reporterRelationToAccident = reporterRelationToAccident;
        return this;
    }
    public String getReporterRelationToAccident() {
        return this.reporterRelationToAccident;
    }

    public SubmitInvestigateCaseRequest setReportTime(Long reportTime) {
        this.reportTime = reportTime;
        return this;
    }
    public Long getReportTime() {
        return this.reportTime;
    }

    public SubmitInvestigateCaseRequest setEventAddressInfo(String eventAddressInfo) {
        this.eventAddressInfo = eventAddressInfo;
        return this;
    }
    public String getEventAddressInfo() {
        return this.eventAddressInfo;
    }

    public SubmitInvestigateCaseRequest setEventAddressDetail(String eventAddressDetail) {
        this.eventAddressDetail = eventAddressDetail;
        return this;
    }
    public String getEventAddressDetail() {
        return this.eventAddressDetail;
    }

    public SubmitInvestigateCaseRequest setConfirmHospital(String confirmHospital) {
        this.confirmHospital = confirmHospital;
        return this;
    }
    public String getConfirmHospital() {
        return this.confirmHospital;
    }

    public SubmitInvestigateCaseRequest setConfirmHospitalAddressInfo(String confirmHospitalAddressInfo) {
        this.confirmHospitalAddressInfo = confirmHospitalAddressInfo;
        return this;
    }
    public String getConfirmHospitalAddressInfo() {
        return this.confirmHospitalAddressInfo;
    }

    public SubmitInvestigateCaseRequest setConfirmIllnessName(String confirmIllnessName) {
        this.confirmIllnessName = confirmIllnessName;
        return this;
    }
    public String getConfirmIllnessName() {
        return this.confirmIllnessName;
    }

    public SubmitInvestigateCaseRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public SubmitInvestigateCaseRequest setFileList(java.util.List<FileNode> fileList) {
        this.fileList = fileList;
        return this;
    }
    public java.util.List<FileNode> getFileList() {
        return this.fileList;
    }

    public SubmitInvestigateCaseRequest setEntrustGuaranteeProductList(java.util.List<EntrustGuaranteeProduct> entrustGuaranteeProductList) {
        this.entrustGuaranteeProductList = entrustGuaranteeProductList;
        return this;
    }
    public java.util.List<EntrustGuaranteeProduct> getEntrustGuaranteeProductList() {
        return this.entrustGuaranteeProductList;
    }

}
