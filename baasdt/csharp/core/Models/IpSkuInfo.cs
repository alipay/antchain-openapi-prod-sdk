// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // ip的sku信息
    public class IpSkuInfo : TeaModel {
        // ip的链上id
        [NameInMap("ip_id")]
        [Validation(Required=true)]
        public string IpId { get; set; }

        // ip的渠道名字
        [NameInMap("channel_name")]
        [Validation(Required=true)]
        public string ChannelName { get; set; }

        // 售卖的商品价格范围
        [NameInMap("price_range")]
        [Validation(Required=true)]
        public string PriceRange { get; set; }

        // ip售卖单价
        [NameInMap("purchase_price")]
        [Validation(Required=true)]
        public string PurchasePrice { get; set; }

        // 套餐中ip的数量
        [NameInMap("sale_num")]
        [Validation(Required=true)]
        public string SaleNum { get; set; }

    }

}
