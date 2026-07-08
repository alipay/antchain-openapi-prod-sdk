// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class CreateFinanceReportRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 银行碳账户
        [NameInMap("enterprise_no")]
        [Validation(Required=true)]
        public string EnterpriseNo { get; set; }

        // 企业社会统一信用编码
        [NameInMap("company_id")]
        [Validation(Required=true)]
        public string CompanyId { get; set; }

        // 对比年
        [NameInMap("compare_year")]
        [Validation(Required=true)]
        public string CompareYear { get; set; }

        // 基准年份
        [NameInMap("base_year")]
        [Validation(Required=true)]
        public string BaseYear { get; set; }

        // 转型路径分析
        [NameInMap("transfer_path_analysis_list")]
        [Validation(Required=true)]
        public List<TransferPathAnalysis> TransferPathAnalysisList { get; set; }

    }

}
