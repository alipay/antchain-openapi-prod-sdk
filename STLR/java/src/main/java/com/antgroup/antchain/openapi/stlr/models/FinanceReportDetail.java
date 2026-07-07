// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class FinanceReportDetail extends TeaModel {
    // 文件
    @NameInMap("file")
    @Validation(required = true)
    public EnterpriseDocumentFile file;

    // 报告编号
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("report_no")
    @Validation(required = true)
    public String reportNo;

    // 报告名称
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("report_name")
    @Validation(required = true)
    public String reportName;

    // 是否盖章
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("has_sealed")
    @Validation(required = true)
    public Boolean hasSealed;

    // 报告时间
    /**
     * <strong>example:</strong>
     * <p>2025-01-20</p>
     */
    @NameInMap("report_time")
    @Validation(required = true)
    public String reportTime;

    // 报告提交人
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("report_submitter")
    @Validation(required = true)
    public String reportSubmitter;

    // 报告生成方式
    /**
     * <strong>example:</strong>
     * <p>MANUAL , INTERFACE</p>
     */
    @NameInMap("generate_type")
    @Validation(required = true)
    public String generateType;

    // 对比年，报告年
    /**
     * <strong>example:</strong>
     * <p>2025</p>
     */
    @NameInMap("compare_year")
    @Validation(required = true)
    public String compareYear;

    // 基准年
    /**
     * <strong>example:</strong>
     * <p>2024</p>
     */
    @NameInMap("base_year")
    @Validation(required = true)
    public String baseYear;

    // 企业名称
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("company_name")
    @Validation(required = true)
    public String companyName;

    // 区域名称
    /**
     * <strong>example:</strong>
     * <p>北京</p>
     */
    @NameInMap("area_name")
    @Validation(required = true)
    public String areaName;

    // 行业名称
    /**
     * <strong>example:</strong>
     * <p>能源</p>
     */
    @NameInMap("industry_name")
    @Validation(required = true)
    public String industryName;

    // 社会统一信用代码
    /**
     * <strong>example:</strong>
     * <p>28382372323232434</p>
     */
    @NameInMap("company_id")
    @Validation(required = true)
    public String companyId;

    public static FinanceReportDetail build(java.util.Map<String, ?> map) throws Exception {
        FinanceReportDetail self = new FinanceReportDetail();
        return TeaModel.build(map, self);
    }

    public FinanceReportDetail setFile(EnterpriseDocumentFile file) {
        this.file = file;
        return this;
    }
    public EnterpriseDocumentFile getFile() {
        return this.file;
    }

    public FinanceReportDetail setReportNo(String reportNo) {
        this.reportNo = reportNo;
        return this;
    }
    public String getReportNo() {
        return this.reportNo;
    }

    public FinanceReportDetail setReportName(String reportName) {
        this.reportName = reportName;
        return this;
    }
    public String getReportName() {
        return this.reportName;
    }

    public FinanceReportDetail setHasSealed(Boolean hasSealed) {
        this.hasSealed = hasSealed;
        return this;
    }
    public Boolean getHasSealed() {
        return this.hasSealed;
    }

    public FinanceReportDetail setReportTime(String reportTime) {
        this.reportTime = reportTime;
        return this;
    }
    public String getReportTime() {
        return this.reportTime;
    }

    public FinanceReportDetail setReportSubmitter(String reportSubmitter) {
        this.reportSubmitter = reportSubmitter;
        return this;
    }
    public String getReportSubmitter() {
        return this.reportSubmitter;
    }

    public FinanceReportDetail setGenerateType(String generateType) {
        this.generateType = generateType;
        return this;
    }
    public String getGenerateType() {
        return this.generateType;
    }

    public FinanceReportDetail setCompareYear(String compareYear) {
        this.compareYear = compareYear;
        return this;
    }
    public String getCompareYear() {
        return this.compareYear;
    }

    public FinanceReportDetail setBaseYear(String baseYear) {
        this.baseYear = baseYear;
        return this;
    }
    public String getBaseYear() {
        return this.baseYear;
    }

    public FinanceReportDetail setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public FinanceReportDetail setAreaName(String areaName) {
        this.areaName = areaName;
        return this;
    }
    public String getAreaName() {
        return this.areaName;
    }

    public FinanceReportDetail setIndustryName(String industryName) {
        this.industryName = industryName;
        return this;
    }
    public String getIndustryName() {
        return this.industryName;
    }

    public FinanceReportDetail setCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }
    public String getCompanyId() {
        return this.companyId;
    }

}
