// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class AllSignTemplateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 合同类型，如果不传则返回所有
        [NameInMap("contract_type")]
        [Validation(Required=false)]
        public string ContractType { get; set; }

        // ● FINANCE 融资
        // ● NON_FINANCE 非融资
        [NameInMap("fund_type")]
        [Validation(Required=false)]
        public string FundType { get; set; }

        // 查询融资类型时，需要传入资方统一社会信用代码
        [NameInMap("fund_id")]
        [Validation(Required=false)]
        public string FundId { get; set; }

    }

}
