// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 租赁订单关联的商品
    public class BclOrderProductInfo : TeaModel {
        // 创建商品后返回的商品id
        [NameInMap("product_id")]
        [Validation(Required=true, MaxLength=32)]
        public string ProductId { get; set; }

        // 商品数量
        // 目前只允许一个商品
        [NameInMap("product_number")]
        [Validation(Required=true)]
        public long? ProductNumber { get; set; }

    }

}
