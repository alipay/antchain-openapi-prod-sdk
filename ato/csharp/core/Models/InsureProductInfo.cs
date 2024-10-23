// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 投保商品信息
    public class InsureProductInfo : TeaModel {
        // 商品库id
        [NameInMap("product_id")]
        [Validation(Required=true, MaxLength=128)]
        public string ProductId { get; set; }

        // 商品设备编号
        [NameInMap("product_imei_id")]
        [Validation(Required=true, MaxLength=256)]
        public string ProductImeiId { get; set; }

        // 商品采购价，单位：分
        [NameInMap("purchase_amount")]
        [Validation(Required=true)]
        public long? PurchaseAmount { get; set; }

    }

}
