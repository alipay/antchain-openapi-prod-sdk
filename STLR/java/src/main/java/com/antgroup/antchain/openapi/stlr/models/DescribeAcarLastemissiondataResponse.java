// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class DescribeAcarLastemissiondataResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 主体活动编码
    @NameInMap("enterprise_no")
    public String enterpriseNo;

    // 盘查范围编码
    @NameInMap("inventory_scope_no")
    public String inventoryScopeNo;

    // 盘查范围名称
    @NameInMap("inventory_scope_name")
    public String inventoryScopeName;

    // 排放类型编码
    @NameInMap("emission_category_no")
    public String emissionCategoryNo;

    // 排放类型名称
    @NameInMap("emission_category_name")
    public String emissionCategoryName;

    // 排放源编码
    @NameInMap("emission_source_no")
    public String emissionSourceNo;

    // 排放源名称
    @NameInMap("emission_source_name")
    public String emissionSourceName;

    // 活动场馆编码
    @NameInMap("enterprise_workspace_no")
    public String enterpriseWorkspaceNo;

    // 活动场馆名称
    @NameInMap("enterprise_workspace_name")
    public String enterpriseWorkspaceName;

    // 排放量计算要素编码
    @NameInMap("emissions_analysis_factor_no")
    public String emissionsAnalysisFactorNo;

    // 排放量计算要素值
    @NameInMap("emissions_analysis_factor_value")
    public String emissionsAnalysisFactorValue;

    // 发生日期
    @NameInMap("occurrence_date")
    public String occurrenceDate;

    // 排放数据录入明细编码
    @NameInMap("emission_data_entry_item_no")
    public String emissionDataEntryItemNo;

    // 排放源用量
    @NameInMap("emission_dource_dosage")
    public Long emissionDourceDosage;

    // 用量单位：
    // WNm3("万Nm3","天然气消耗用量单位"),
    // GJ("GJ","燃烧产生的热量单位或外购热力单位"),
    // t("t","制冷剂、灭火器填充剂、化石燃料消耗的质量单位，或者化粪池BOD产生量单位"),
    // MWh("MWh","外购电力或数据中心用电量单位"),
    // km("km","公里，通勤用车或员工差旅旅程单位"),
    // tCO2e("tCO2e","吨二氧化碳当量，排放气体产生的二氧化碳当量"),
    // PCT("%","百分比，如碳氧化率，或者气体逸散率");
    @NameInMap("dosage_unit")
    public String dosageUnit;

    // 数据录入人账号
    @NameInMap("submitter_no")
    public String submitterNo;

    // 提交人姓名
    @NameInMap("submitter_name")
    public String submitterName;

    // 数据录入时间
    @NameInMap("submission_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String submissionTime;

    // 盘查排放类型的数据录入方式：
    // ManualEntry("手动录入方式"),
    // FileUpload("文件导入方式"),
    // AutoGeneration("自动产生");
    @NameInMap("data_entry_type")
    public String dataEntryType;

    public static DescribeAcarLastemissiondataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAcarLastemissiondataResponse self = new DescribeAcarLastemissiondataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAcarLastemissiondataResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DescribeAcarLastemissiondataResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeAcarLastemissiondataResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DescribeAcarLastemissiondataResponse setEnterpriseNo(String enterpriseNo) {
        this.enterpriseNo = enterpriseNo;
        return this;
    }
    public String getEnterpriseNo() {
        return this.enterpriseNo;
    }

    public DescribeAcarLastemissiondataResponse setInventoryScopeNo(String inventoryScopeNo) {
        this.inventoryScopeNo = inventoryScopeNo;
        return this;
    }
    public String getInventoryScopeNo() {
        return this.inventoryScopeNo;
    }

    public DescribeAcarLastemissiondataResponse setInventoryScopeName(String inventoryScopeName) {
        this.inventoryScopeName = inventoryScopeName;
        return this;
    }
    public String getInventoryScopeName() {
        return this.inventoryScopeName;
    }

    public DescribeAcarLastemissiondataResponse setEmissionCategoryNo(String emissionCategoryNo) {
        this.emissionCategoryNo = emissionCategoryNo;
        return this;
    }
    public String getEmissionCategoryNo() {
        return this.emissionCategoryNo;
    }

    public DescribeAcarLastemissiondataResponse setEmissionCategoryName(String emissionCategoryName) {
        this.emissionCategoryName = emissionCategoryName;
        return this;
    }
    public String getEmissionCategoryName() {
        return this.emissionCategoryName;
    }

    public DescribeAcarLastemissiondataResponse setEmissionSourceNo(String emissionSourceNo) {
        this.emissionSourceNo = emissionSourceNo;
        return this;
    }
    public String getEmissionSourceNo() {
        return this.emissionSourceNo;
    }

    public DescribeAcarLastemissiondataResponse setEmissionSourceName(String emissionSourceName) {
        this.emissionSourceName = emissionSourceName;
        return this;
    }
    public String getEmissionSourceName() {
        return this.emissionSourceName;
    }

    public DescribeAcarLastemissiondataResponse setEnterpriseWorkspaceNo(String enterpriseWorkspaceNo) {
        this.enterpriseWorkspaceNo = enterpriseWorkspaceNo;
        return this;
    }
    public String getEnterpriseWorkspaceNo() {
        return this.enterpriseWorkspaceNo;
    }

    public DescribeAcarLastemissiondataResponse setEnterpriseWorkspaceName(String enterpriseWorkspaceName) {
        this.enterpriseWorkspaceName = enterpriseWorkspaceName;
        return this;
    }
    public String getEnterpriseWorkspaceName() {
        return this.enterpriseWorkspaceName;
    }

    public DescribeAcarLastemissiondataResponse setEmissionsAnalysisFactorNo(String emissionsAnalysisFactorNo) {
        this.emissionsAnalysisFactorNo = emissionsAnalysisFactorNo;
        return this;
    }
    public String getEmissionsAnalysisFactorNo() {
        return this.emissionsAnalysisFactorNo;
    }

    public DescribeAcarLastemissiondataResponse setEmissionsAnalysisFactorValue(String emissionsAnalysisFactorValue) {
        this.emissionsAnalysisFactorValue = emissionsAnalysisFactorValue;
        return this;
    }
    public String getEmissionsAnalysisFactorValue() {
        return this.emissionsAnalysisFactorValue;
    }

    public DescribeAcarLastemissiondataResponse setOccurrenceDate(String occurrenceDate) {
        this.occurrenceDate = occurrenceDate;
        return this;
    }
    public String getOccurrenceDate() {
        return this.occurrenceDate;
    }

    public DescribeAcarLastemissiondataResponse setEmissionDataEntryItemNo(String emissionDataEntryItemNo) {
        this.emissionDataEntryItemNo = emissionDataEntryItemNo;
        return this;
    }
    public String getEmissionDataEntryItemNo() {
        return this.emissionDataEntryItemNo;
    }

    public DescribeAcarLastemissiondataResponse setEmissionDourceDosage(Long emissionDourceDosage) {
        this.emissionDourceDosage = emissionDourceDosage;
        return this;
    }
    public Long getEmissionDourceDosage() {
        return this.emissionDourceDosage;
    }

    public DescribeAcarLastemissiondataResponse setDosageUnit(String dosageUnit) {
        this.dosageUnit = dosageUnit;
        return this;
    }
    public String getDosageUnit() {
        return this.dosageUnit;
    }

    public DescribeAcarLastemissiondataResponse setSubmitterNo(String submitterNo) {
        this.submitterNo = submitterNo;
        return this;
    }
    public String getSubmitterNo() {
        return this.submitterNo;
    }

    public DescribeAcarLastemissiondataResponse setSubmitterName(String submitterName) {
        this.submitterName = submitterName;
        return this;
    }
    public String getSubmitterName() {
        return this.submitterName;
    }

    public DescribeAcarLastemissiondataResponse setSubmissionTime(String submissionTime) {
        this.submissionTime = submissionTime;
        return this;
    }
    public String getSubmissionTime() {
        return this.submissionTime;
    }

    public DescribeAcarLastemissiondataResponse setDataEntryType(String dataEntryType) {
        this.dataEntryType = dataEntryType;
        return this;
    }
    public String getDataEntryType() {
        return this.dataEntryType;
    }

}
