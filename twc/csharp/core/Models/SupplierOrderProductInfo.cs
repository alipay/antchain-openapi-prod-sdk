// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 共享项目，资产端的采购平台回传的订单商品信息
    public class SupplierOrderProductInfo : TeaModel {
        // 商品id
        [NameInMap("product_id")]
        [Validation(Required=true)]
        public string ProductId { get; set; }

        // 商品采购单价，单位：毫厘
        [NameInMap("product_price")]
        [Validation(Required=true)]
        public long? ProductPrice { get; set; }

        // 商品的sn信息
        [NameInMap("sn_list")]
        [Validation(Required=true)]
        public List<string> SnList { get; set; }

    }

}
