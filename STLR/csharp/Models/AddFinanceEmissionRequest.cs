// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class AddFinanceEmissionRequest : TeaModel {
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

        // 企业统一社会信用代码
        [NameInMap("company_id")]
        [Validation(Required=true)]
        public string CompanyId { get; set; }

        // 排放盘查方案
        [NameInMap("plan_code")]
        [Validation(Required=true)]
        public string PlanCode { get; set; }

        // 排放量
        [NameInMap("emission_dosage")]
        [Validation(Required=true)]
        public string EmissionDosage { get; set; }

        // 年份
        [NameInMap("year")]
        [Validation(Required=true)]
        public string Year { get; set; }

    }

}
