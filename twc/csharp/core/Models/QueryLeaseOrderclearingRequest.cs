// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryLeaseOrderclearingRequest : TeaModel {
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

        // 期数
        [NameInMap("term")]
        [Validation(Required=true)]
        public long? Term { get; set; }

        // 融资租赁合约id
        [NameInMap("application_id")]
        [Validation(Required=false)]
        public string ApplicationId { get; set; }

        // 清分单号
        [NameInMap("clearing_order_id")]
        [Validation(Required=true)]
        public string ClearingOrderId { get; set; }

        // 租赁机构id
        [NameInMap("lease_id")]
        [Validation(Required=false)]
        public string LeaseId { get; set; }

    }

}
