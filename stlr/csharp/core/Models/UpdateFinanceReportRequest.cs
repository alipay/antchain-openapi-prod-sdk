// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class UpdateFinanceReportRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 银行碳账号
        [NameInMap("enterprise_no")]
        [Validation(Required=true)]
        public string EnterpriseNo { get; set; }

        // 报告盖章人
        [NameInMap("report_singer")]
        [Validation(Required=true)]
        public string ReportSinger { get; set; }

        // 可以直接公网可以下载的oss地址
        [NameInMap("report_oss_url")]
        [Validation(Required=true)]
        public string ReportOssUrl { get; set; }

        // 社会统一信用参数
        [NameInMap("company_id")]
        [Validation(Required=true)]
        public string CompanyId { get; set; }

        // 是否盖章
        [NameInMap("is_seal")]
        [Validation(Required=true)]
        public bool? IsSeal { get; set; }

        // 报告年份
        [NameInMap("report_year")]
        [Validation(Required=true)]
        public string ReportYear { get; set; }

        // 基准年份
        [NameInMap("base_year")]
        [Validation(Required=true)]
        public string BaseYear { get; set; }

    }

}
