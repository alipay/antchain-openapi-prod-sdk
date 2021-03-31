// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class QueryPfIouRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 客户号
        [NameInMap("customer_no")]
        [Validation(Required=false, MaxLength=20)]
        public string CustomerNo { get; set; }

        // 借据Id
        [NameInMap("debit_id")]
        [Validation(Required=false, MaxLength=16)]
        public string DebitId { get; set; }

        // 支用Id
        [NameInMap("financing_id")]
        [Validation(Required=true, MaxLength=32)]
        public string FinancingId { get; set; }

    }

}
