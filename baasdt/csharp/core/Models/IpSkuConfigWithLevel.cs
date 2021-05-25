// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // sku配置加上ip等级
    public class IpSkuConfigWithLevel : TeaModel {
        // 价格区间
        [NameInMap("price_range")]
        [Validation(Required=true)]
        public string PriceRange { get; set; }

        // 单价
        [NameInMap("purchase_price")]
        [Validation(Required=true)]
        public string PurchasePrice { get; set; }

        // 销售数量
        [NameInMap("sale_num")]
        [Validation(Required=true)]
        public long? SaleNum { get; set; }

        // ip等级
        [NameInMap("ip_level")]
        [Validation(Required=true)]
        public long? IpLevel { get; set; }

    }

}
