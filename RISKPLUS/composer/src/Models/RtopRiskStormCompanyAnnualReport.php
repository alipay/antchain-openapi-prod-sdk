<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RtopRiskStormCompanyAnnualReport extends Model
{
    // 年报个数
    /**
     * @example 2
     *
     * @var int
     */
    public $annualReportCount;

    // 年报是否发生股权转让
    /**
     * @example true
     *
     * @var bool
     */
    public $annualReportHasEquityTransfer;

    // 年报是否对外提供担保
    /**
     * @example true
     *
     * @var bool
     */
    public $annualReportHasExternalGuarantee;

    // 年报是否对外投资
    /**
     * @example true
     *
     * @var bool
     */
    public $annualReportHasExternalInvest;

    // 营业总收入中主营业务收入
    /**
     * @example 1000
     *
     * @var string
     */
    public $annualReportMainBusinessIncome;

    // 年报净利润
    /**
     * @example 1000
     *
     * @var string
     */
    public $annualReportNetProfit;

    // 年报发布日期
    /**
     * @example 2018-09-09
     *
     * @var string
     */
    public $annualReportReleaseDate;

    // 年报股东实缴出资额（万元（实缴出资额用两个冒号::分割）
    /**
     * @example 100::200:2
     *
     * @var string
     */
    public $annualReportShActualPaid;

    // 年报公司人数
    /**
     * @example 200
     *
     * @var int
     */
    public $annualReportStaffCount;

    // 资产总额
    /**
     * @example 1000
     *
     * @var string
     */
    public $annualReportTotalAssets;

    // 负债总额
    /**
     * @example 1000
     *
     * @var string
     */
    public $annualReportTotalLiabilities;

    // 营业总收入
    /**
     * @example 1000
     *
     * @var string
     */
    public $annualReportTotalOperatingIncome;

    // 年报所有者权益合计
    /**
     * @example 1000
     *
     * @var string
     */
    public $annualReportTotalOwnerEquity;

    // 年报利润总额
    /**
     * @example 1000
     *
     * @var string
     */
    public $annualReportTotalProfit;

    // 纳税总额
    /**
     * @example 1000
     *
     * @var string
     */
    public $annualReportTotalTax;

    // 年报报送年度
    /**
     * @example 2018
     *
     * @var string
     */
    public $annualReportYear;
    protected $_name = [
        'annualReportCount'                => 'annual_report_count',
        'annualReportHasEquityTransfer'    => 'annual_report_has_equity_transfer',
        'annualReportHasExternalGuarantee' => 'annual_report_has_external_guarantee',
        'annualReportHasExternalInvest'    => 'annual_report_has_external_invest',
        'annualReportMainBusinessIncome'   => 'annual_report_main_business_income',
        'annualReportNetProfit'            => 'annual_report_net_profit',
        'annualReportReleaseDate'          => 'annual_report_release_date',
        'annualReportShActualPaid'         => 'annual_report_sh_actual_paid',
        'annualReportStaffCount'           => 'annual_report_staff_count',
        'annualReportTotalAssets'          => 'annual_report_total_assets',
        'annualReportTotalLiabilities'     => 'annual_report_total_liabilities',
        'annualReportTotalOperatingIncome' => 'annual_report_total_operating_income',
        'annualReportTotalOwnerEquity'     => 'annual_report_total_owner_equity',
        'annualReportTotalProfit'          => 'annual_report_total_profit',
        'annualReportTotalTax'             => 'annual_report_total_tax',
        'annualReportYear'                 => 'annual_report_year',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->annualReportCount) {
            $res['annual_report_count'] = $this->annualReportCount;
        }
        if (null !== $this->annualReportHasEquityTransfer) {
            $res['annual_report_has_equity_transfer'] = $this->annualReportHasEquityTransfer;
        }
        if (null !== $this->annualReportHasExternalGuarantee) {
            $res['annual_report_has_external_guarantee'] = $this->annualReportHasExternalGuarantee;
        }
        if (null !== $this->annualReportHasExternalInvest) {
            $res['annual_report_has_external_invest'] = $this->annualReportHasExternalInvest;
        }
        if (null !== $this->annualReportMainBusinessIncome) {
            $res['annual_report_main_business_income'] = $this->annualReportMainBusinessIncome;
        }
        if (null !== $this->annualReportNetProfit) {
            $res['annual_report_net_profit'] = $this->annualReportNetProfit;
        }
        if (null !== $this->annualReportReleaseDate) {
            $res['annual_report_release_date'] = $this->annualReportReleaseDate;
        }
        if (null !== $this->annualReportShActualPaid) {
            $res['annual_report_sh_actual_paid'] = $this->annualReportShActualPaid;
        }
        if (null !== $this->annualReportStaffCount) {
            $res['annual_report_staff_count'] = $this->annualReportStaffCount;
        }
        if (null !== $this->annualReportTotalAssets) {
            $res['annual_report_total_assets'] = $this->annualReportTotalAssets;
        }
        if (null !== $this->annualReportTotalLiabilities) {
            $res['annual_report_total_liabilities'] = $this->annualReportTotalLiabilities;
        }
        if (null !== $this->annualReportTotalOperatingIncome) {
            $res['annual_report_total_operating_income'] = $this->annualReportTotalOperatingIncome;
        }
        if (null !== $this->annualReportTotalOwnerEquity) {
            $res['annual_report_total_owner_equity'] = $this->annualReportTotalOwnerEquity;
        }
        if (null !== $this->annualReportTotalProfit) {
            $res['annual_report_total_profit'] = $this->annualReportTotalProfit;
        }
        if (null !== $this->annualReportTotalTax) {
            $res['annual_report_total_tax'] = $this->annualReportTotalTax;
        }
        if (null !== $this->annualReportYear) {
            $res['annual_report_year'] = $this->annualReportYear;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RtopRiskStormCompanyAnnualReport
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['annual_report_count'])) {
            $model->annualReportCount = $map['annual_report_count'];
        }
        if (isset($map['annual_report_has_equity_transfer'])) {
            $model->annualReportHasEquityTransfer = $map['annual_report_has_equity_transfer'];
        }
        if (isset($map['annual_report_has_external_guarantee'])) {
            $model->annualReportHasExternalGuarantee = $map['annual_report_has_external_guarantee'];
        }
        if (isset($map['annual_report_has_external_invest'])) {
            $model->annualReportHasExternalInvest = $map['annual_report_has_external_invest'];
        }
        if (isset($map['annual_report_main_business_income'])) {
            $model->annualReportMainBusinessIncome = $map['annual_report_main_business_income'];
        }
        if (isset($map['annual_report_net_profit'])) {
            $model->annualReportNetProfit = $map['annual_report_net_profit'];
        }
        if (isset($map['annual_report_release_date'])) {
            $model->annualReportReleaseDate = $map['annual_report_release_date'];
        }
        if (isset($map['annual_report_sh_actual_paid'])) {
            $model->annualReportShActualPaid = $map['annual_report_sh_actual_paid'];
        }
        if (isset($map['annual_report_staff_count'])) {
            $model->annualReportStaffCount = $map['annual_report_staff_count'];
        }
        if (isset($map['annual_report_total_assets'])) {
            $model->annualReportTotalAssets = $map['annual_report_total_assets'];
        }
        if (isset($map['annual_report_total_liabilities'])) {
            $model->annualReportTotalLiabilities = $map['annual_report_total_liabilities'];
        }
        if (isset($map['annual_report_total_operating_income'])) {
            $model->annualReportTotalOperatingIncome = $map['annual_report_total_operating_income'];
        }
        if (isset($map['annual_report_total_owner_equity'])) {
            $model->annualReportTotalOwnerEquity = $map['annual_report_total_owner_equity'];
        }
        if (isset($map['annual_report_total_profit'])) {
            $model->annualReportTotalProfit = $map['annual_report_total_profit'];
        }
        if (isset($map['annual_report_total_tax'])) {
            $model->annualReportTotalTax = $map['annual_report_total_tax'];
        }
        if (isset($map['annual_report_year'])) {
            $model->annualReportYear = $map['annual_report_year'];
        }

        return $model;
    }
}
