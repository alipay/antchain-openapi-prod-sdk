// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgeSearchContractRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 原用信订单号
        [NameInMap("original_order_no")]
        [Validation(Required=true)]
        public string OriginalOrderNo { get; set; }

        // 客户号
        [NameInMap("customer_no")]
        [Validation(Required=true)]
        public string CustomerNo { get; set; }

        // 合同类型
        [NameInMap("contract_type")]
        [Validation(Required=false)]
        public string ContractType { get; set; }

    }

}
