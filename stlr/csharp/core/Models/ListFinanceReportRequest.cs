// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class ListFinanceReportRequest : TeaModel {
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

        // 企业统一信用代码或者项目id
        [NameInMap("company_id")]
        [Validation(Required=true)]
        public string CompanyId { get; set; }

        // 报告年，当前年，对比年
        [NameInMap("compare_year")]
        [Validation(Required=true)]
        public string CompareYear { get; set; }

        // 基准年，被对比年
        [NameInMap("base_year")]
        [Validation(Required=true)]
        public string BaseYear { get; set; }

    }

}
