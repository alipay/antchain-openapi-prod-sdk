// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // sku的基础信息
    public class IpSkuEmphasisInfo : TeaModel {
        // 价格区间，不做校验
        [NameInMap("price_range")]
        [Validation(Required=true)]
        public string PriceRange { get; set; }

        // 单价
        [NameInMap("purchase_price")]
        [Validation(Required=true)]
        public string PurchasePrice { get; set; }

        // 套餐数量
        [NameInMap("sale_num")]
        [Validation(Required=true)]
        public string SaleNum { get; set; }

    }

}
