// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class CreateOrderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 幂等字段
        [NameInMap("client_token")]
        [Validation(Required=true)]
        public string ClientToken { get; set; }

        // 幂等id【标废弃， 幂等id已client_token为准】
        [NameInMap("request_id")]
        [Validation(Required=false)]
        public string RequestId { get; set; }

        // 发票信息
        [NameInMap("invoice_info")]
        [Validation(Required=true)]
        public InvoiceInfo InvoiceInfo { get; set; }

        // 订单明细列表
        [NameInMap("order_item")]
        [Validation(Required=true)]
        public List<OrderItem> OrderItem { get; set; }

    }

}
