// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 转型金融报告详情
    public class FinanceReportDetail : TeaModel {
        // 文件
        [NameInMap("file")]
        [Validation(Required=true)]
        public EnterpriseDocumentFile File { get; set; }

        // 报告编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("report_no")]
        [Validation(Required=true)]
        public string ReportNo { get; set; }

        // 报告名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("report_name")]
        [Validation(Required=true)]
        public string ReportName { get; set; }

        // 是否盖章
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("has_sealed")]
        [Validation(Required=true)]
        public bool? HasSealed { get; set; }

        // 报告时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2025-01-20</para>
        /// </summary>
        [NameInMap("report_time")]
        [Validation(Required=true)]
        public string ReportTime { get; set; }

        // 报告提交人
        /// <summary>
        /// <b>Example:</b>
        /// <para>张三</para>
        /// </summary>
        [NameInMap("report_submitter")]
        [Validation(Required=true)]
        public string ReportSubmitter { get; set; }

        // 报告生成方式
        /// <summary>
        /// <b>Example:</b>
        /// <para>MANUAL , INTERFACE</para>
        /// </summary>
        [NameInMap("generate_type")]
        [Validation(Required=true)]
        public string GenerateType { get; set; }

        // 对比年，报告年
        /// <summary>
        /// <b>Example:</b>
        /// <para>2025</para>
        /// </summary>
        [NameInMap("compare_year")]
        [Validation(Required=true)]
        public string CompareYear { get; set; }

        // 基准年
        /// <summary>
        /// <b>Example:</b>
        /// <para>2024</para>
        /// </summary>
        [NameInMap("base_year")]
        [Validation(Required=true)]
        public string BaseYear { get; set; }

        // 企业名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("company_name")]
        [Validation(Required=true)]
        public string CompanyName { get; set; }

        // 区域名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>北京</para>
        /// </summary>
        [NameInMap("area_name")]
        [Validation(Required=true)]
        public string AreaName { get; set; }

        // 行业名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>能源</para>
        /// </summary>
        [NameInMap("industry_name")]
        [Validation(Required=true)]
        public string IndustryName { get; set; }

        // 社会统一信用代码
        /// <summary>
        /// <b>Example:</b>
        /// <para>28382372323232434</para>
        /// </summary>
        [NameInMap("company_id")]
        [Validation(Required=true)]
        public string CompanyId { get; set; }

    }

}
