// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 企业年报信息
    public class RtopRiskStormCompanyAnnualReport : TeaModel {
        // 年报个数
        /// <summary>
        /// <b>Example:</b>
        /// <para>2</para>
        /// </summary>
        [NameInMap("annual_report_count")]
        [Validation(Required=false)]
        public long? AnnualReportCount { get; set; }

        // 年报是否发生股权转让
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("annual_report_has_equity_transfer")]
        [Validation(Required=false)]
        public bool? AnnualReportHasEquityTransfer { get; set; }

        // 年报是否对外提供担保
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("annual_report_has_external_guarantee")]
        [Validation(Required=false)]
        public bool? AnnualReportHasExternalGuarantee { get; set; }

        // 年报是否对外投资
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("annual_report_has_external_invest")]
        [Validation(Required=false)]
        public bool? AnnualReportHasExternalInvest { get; set; }

        // 营业总收入中主营业务收入
        /// <summary>
        /// <b>Example:</b>
        /// <para>1000</para>
        /// </summary>
        [NameInMap("annual_report_main_business_income")]
        [Validation(Required=false)]
        public string AnnualReportMainBusinessIncome { get; set; }

        // 年报净利润
        /// <summary>
        /// <b>Example:</b>
        /// <para>1000</para>
        /// </summary>
        [NameInMap("annual_report_net_profit")]
        [Validation(Required=false)]
        public string AnnualReportNetProfit { get; set; }

        // 年报发布日期
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-09-09</para>
        /// </summary>
        [NameInMap("annual_report_release_date")]
        [Validation(Required=false)]
        public string AnnualReportReleaseDate { get; set; }

        // 年报股东实缴出资额（万元（实缴出资额用两个冒号::分割）
        /// <summary>
        /// <b>Example:</b>
        /// <para>100::200:2</para>
        /// </summary>
        [NameInMap("annual_report_sh_actual_paid")]
        [Validation(Required=false)]
        public string AnnualReportShActualPaid { get; set; }

        // 年报公司人数
        /// <summary>
        /// <b>Example:</b>
        /// <para>200</para>
        /// </summary>
        [NameInMap("annual_report_staff_count")]
        [Validation(Required=false)]
        public long? AnnualReportStaffCount { get; set; }

        // 资产总额
        /// <summary>
        /// <b>Example:</b>
        /// <para>1000</para>
        /// </summary>
        [NameInMap("annual_report_total_assets")]
        [Validation(Required=false)]
        public string AnnualReportTotalAssets { get; set; }

        // 负债总额
        /// <summary>
        /// <b>Example:</b>
        /// <para>1000</para>
        /// </summary>
        [NameInMap("annual_report_total_liabilities")]
        [Validation(Required=false)]
        public string AnnualReportTotalLiabilities { get; set; }

        // 营业总收入
        /// <summary>
        /// <b>Example:</b>
        /// <para>1000</para>
        /// </summary>
        [NameInMap("annual_report_total_operating_income")]
        [Validation(Required=false)]
        public string AnnualReportTotalOperatingIncome { get; set; }

        // 年报所有者权益合计
        /// <summary>
        /// <b>Example:</b>
        /// <para>1000</para>
        /// </summary>
        [NameInMap("annual_report_total_owner_equity")]
        [Validation(Required=false)]
        public string AnnualReportTotalOwnerEquity { get; set; }

        // 年报利润总额
        /// <summary>
        /// <b>Example:</b>
        /// <para>1000</para>
        /// </summary>
        [NameInMap("annual_report_total_profit")]
        [Validation(Required=false)]
        public string AnnualReportTotalProfit { get; set; }

        // 纳税总额
        /// <summary>
        /// <b>Example:</b>
        /// <para>1000</para>
        /// </summary>
        [NameInMap("annual_report_total_tax")]
        [Validation(Required=false)]
        public string AnnualReportTotalTax { get; set; }

        // 年报报送年度
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018</para>
        /// </summary>
        [NameInMap("annual_report_year")]
        [Validation(Required=false)]
        public string AnnualReportYear { get; set; }

    }

}
