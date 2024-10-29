// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 订单商品
    public class OrderProductInfo : TeaModel {
        // 商品编码
        [NameInMap("product_id")]
        [Validation(Required=false)]
        public string ProductId { get; set; }

        // 商品名称
        [NameInMap("product_name")]
        [Validation(Required=false)]
        public string ProductName { get; set; }

        // 商品数量
        [NameInMap("product_number")]
        [Validation(Required=false)]
        public long? ProductNumber { get; set; }

    }

}
