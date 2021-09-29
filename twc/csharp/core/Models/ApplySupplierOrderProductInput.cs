// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 采购商品信息
    public class ApplySupplierOrderProductInput : TeaModel {
        // 采购商品id
        [NameInMap("product_id")]
        [Validation(Required=true)]
        public string ProductId { get; set; }

        // 采购商品数量
        [NameInMap("product_num")]
        [Validation(Required=true)]
        public long? ProductNum { get; set; }

    }

}
