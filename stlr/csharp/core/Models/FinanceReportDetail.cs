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
        [NameInMap("report_no")]
        [Validation(Required=true)]
        public string ReportNo { get; set; }

        // 报告名称
        [NameInMap("report_name")]
        [Validation(Required=true)]
        public string ReportName { get; set; }

        // 是否盖章
        [NameInMap("has_sealed")]
        [Validation(Required=true)]
        public bool? HasSealed { get; set; }

        // 报告时间
        [NameInMap("report_time")]
        [Validation(Required=true)]
        public string ReportTime { get; set; }

        // 报告提交人
        [NameInMap("report_submitter")]
        [Validation(Required=true)]
        public string ReportSubmitter { get; set; }

        // 报告生成方式
        [NameInMap("generate_type")]
        [Validation(Required=true)]
        public string GenerateType { get; set; }

        // 对比年，报告年
        [NameInMap("compare_year")]
        [Validation(Required=true)]
        public string CompareYear { get; set; }

        // 基准年
        [NameInMap("base_year")]
        [Validation(Required=true)]
        public string BaseYear { get; set; }

        // 企业名称
        [NameInMap("company_name")]
        [Validation(Required=true)]
        public string CompanyName { get; set; }

        // 区域名称
        [NameInMap("area_name")]
        [Validation(Required=true)]
        public string AreaName { get; set; }

        // 行业名称
        [NameInMap("industry_name")]
        [Validation(Required=true)]
        public string IndustryName { get; set; }

        // 社会统一信用代码
        [NameInMap("company_id")]
        [Validation(Required=true)]
        public string CompanyId { get; set; }

    }

}
