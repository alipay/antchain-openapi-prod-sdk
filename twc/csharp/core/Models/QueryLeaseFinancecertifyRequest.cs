// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryLeaseFinancecertifyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 租赁商户金融科技租户id
        [NameInMap("lease_id")]
        [Validation(Required=false)]
        public string LeaseId { get; set; }

        // 核验凭证
        [NameInMap("lease_certify_id")]
        [Validation(Required=true)]
        public string LeaseCertifyId { get; set; }

    }

}
