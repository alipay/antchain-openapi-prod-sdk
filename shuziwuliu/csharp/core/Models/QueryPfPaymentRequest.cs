// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class QueryPfPaymentRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务参考号
        [NameInMap("buss_refr_no")]
        [Validation(Required=true, MaxLength=100)]
        public string BussRefrNo { get; set; }

        // 支用id
        [NameInMap("financing_id")]
        [Validation(Required=true, MaxLength=32)]
        public string FinancingId { get; set; }

    }

}
