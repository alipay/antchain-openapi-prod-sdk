// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RtopRiskStormCompanyAnnualReport extends TeaModel {
    // 年报个数
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("annual_report_count")
    public Long annualReportCount;

    // 年报是否发生股权转让
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("annual_report_has_equity_transfer")
    public Boolean annualReportHasEquityTransfer;

    // 年报是否对外提供担保
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("annual_report_has_external_guarantee")
    public Boolean annualReportHasExternalGuarantee;

    // 年报是否对外投资
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("annual_report_has_external_invest")
    public Boolean annualReportHasExternalInvest;

    // 营业总收入中主营业务收入
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("annual_report_main_business_income")
    public String annualReportMainBusinessIncome;

    // 年报净利润
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("annual_report_net_profit")
    public String annualReportNetProfit;

    // 年报发布日期
    /**
     * <strong>example:</strong>
     * <p>2018-09-09</p>
     */
    @NameInMap("annual_report_release_date")
    public String annualReportReleaseDate;

    // 年报股东实缴出资额（万元（实缴出资额用两个冒号::分割）
    /**
     * <strong>example:</strong>
     * <p>100::200:2</p>
     */
    @NameInMap("annual_report_sh_actual_paid")
    public String annualReportShActualPaid;

    // 年报公司人数
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("annual_report_staff_count")
    public Long annualReportStaffCount;

    // 资产总额
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("annual_report_total_assets")
    public String annualReportTotalAssets;

    // 负债总额
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("annual_report_total_liabilities")
    public String annualReportTotalLiabilities;

    // 营业总收入
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("annual_report_total_operating_income")
    public String annualReportTotalOperatingIncome;

    // 年报所有者权益合计
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("annual_report_total_owner_equity")
    public String annualReportTotalOwnerEquity;

    // 年报利润总额
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("annual_report_total_profit")
    public String annualReportTotalProfit;

    // 纳税总额
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("annual_report_total_tax")
    public String annualReportTotalTax;

    // 年报报送年度
    /**
     * <strong>example:</strong>
     * <p>2018</p>
     */
    @NameInMap("annual_report_year")
    public String annualReportYear;

    public static RtopRiskStormCompanyAnnualReport build(java.util.Map<String, ?> map) throws Exception {
        RtopRiskStormCompanyAnnualReport self = new RtopRiskStormCompanyAnnualReport();
        return TeaModel.build(map, self);
    }

    public RtopRiskStormCompanyAnnualReport setAnnualReportCount(Long annualReportCount) {
        this.annualReportCount = annualReportCount;
        return this;
    }
    public Long getAnnualReportCount() {
        return this.annualReportCount;
    }

    public RtopRiskStormCompanyAnnualReport setAnnualReportHasEquityTransfer(Boolean annualReportHasEquityTransfer) {
        this.annualReportHasEquityTransfer = annualReportHasEquityTransfer;
        return this;
    }
    public Boolean getAnnualReportHasEquityTransfer() {
        return this.annualReportHasEquityTransfer;
    }

    public RtopRiskStormCompanyAnnualReport setAnnualReportHasExternalGuarantee(Boolean annualReportHasExternalGuarantee) {
        this.annualReportHasExternalGuarantee = annualReportHasExternalGuarantee;
        return this;
    }
    public Boolean getAnnualReportHasExternalGuarantee() {
        return this.annualReportHasExternalGuarantee;
    }

    public RtopRiskStormCompanyAnnualReport setAnnualReportHasExternalInvest(Boolean annualReportHasExternalInvest) {
        this.annualReportHasExternalInvest = annualReportHasExternalInvest;
        return this;
    }
    public Boolean getAnnualReportHasExternalInvest() {
        return this.annualReportHasExternalInvest;
    }

    public RtopRiskStormCompanyAnnualReport setAnnualReportMainBusinessIncome(String annualReportMainBusinessIncome) {
        this.annualReportMainBusinessIncome = annualReportMainBusinessIncome;
        return this;
    }
    public String getAnnualReportMainBusinessIncome() {
        return this.annualReportMainBusinessIncome;
    }

    public RtopRiskStormCompanyAnnualReport setAnnualReportNetProfit(String annualReportNetProfit) {
        this.annualReportNetProfit = annualReportNetProfit;
        return this;
    }
    public String getAnnualReportNetProfit() {
        return this.annualReportNetProfit;
    }

    public RtopRiskStormCompanyAnnualReport setAnnualReportReleaseDate(String annualReportReleaseDate) {
        this.annualReportReleaseDate = annualReportReleaseDate;
        return this;
    }
    public String getAnnualReportReleaseDate() {
        return this.annualReportReleaseDate;
    }

    public RtopRiskStormCompanyAnnualReport setAnnualReportShActualPaid(String annualReportShActualPaid) {
        this.annualReportShActualPaid = annualReportShActualPaid;
        return this;
    }
    public String getAnnualReportShActualPaid() {
        return this.annualReportShActualPaid;
    }

    public RtopRiskStormCompanyAnnualReport setAnnualReportStaffCount(Long annualReportStaffCount) {
        this.annualReportStaffCount = annualReportStaffCount;
        return this;
    }
    public Long getAnnualReportStaffCount() {
        return this.annualReportStaffCount;
    }

    public RtopRiskStormCompanyAnnualReport setAnnualReportTotalAssets(String annualReportTotalAssets) {
        this.annualReportTotalAssets = annualReportTotalAssets;
        return this;
    }
    public String getAnnualReportTotalAssets() {
        return this.annualReportTotalAssets;
    }

    public RtopRiskStormCompanyAnnualReport setAnnualReportTotalLiabilities(String annualReportTotalLiabilities) {
        this.annualReportTotalLiabilities = annualReportTotalLiabilities;
        return this;
    }
    public String getAnnualReportTotalLiabilities() {
        return this.annualReportTotalLiabilities;
    }

    public RtopRiskStormCompanyAnnualReport setAnnualReportTotalOperatingIncome(String annualReportTotalOperatingIncome) {
        this.annualReportTotalOperatingIncome = annualReportTotalOperatingIncome;
        return this;
    }
    public String getAnnualReportTotalOperatingIncome() {
        return this.annualReportTotalOperatingIncome;
    }

    public RtopRiskStormCompanyAnnualReport setAnnualReportTotalOwnerEquity(String annualReportTotalOwnerEquity) {
        this.annualReportTotalOwnerEquity = annualReportTotalOwnerEquity;
        return this;
    }
    public String getAnnualReportTotalOwnerEquity() {
        return this.annualReportTotalOwnerEquity;
    }

    public RtopRiskStormCompanyAnnualReport setAnnualReportTotalProfit(String annualReportTotalProfit) {
        this.annualReportTotalProfit = annualReportTotalProfit;
        return this;
    }
    public String getAnnualReportTotalProfit() {
        return this.annualReportTotalProfit;
    }

    public RtopRiskStormCompanyAnnualReport setAnnualReportTotalTax(String annualReportTotalTax) {
        this.annualReportTotalTax = annualReportTotalTax;
        return this;
    }
    public String getAnnualReportTotalTax() {
        return this.annualReportTotalTax;
    }

    public RtopRiskStormCompanyAnnualReport setAnnualReportYear(String annualReportYear) {
        this.annualReportYear = annualReportYear;
        return this;
    }
    public String getAnnualReportYear() {
        return this.annualReportYear;
    }

}
