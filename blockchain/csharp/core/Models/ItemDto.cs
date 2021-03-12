// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 营销分销商品信息
    public class ItemDto : TeaModel {
        // 商品id
        [NameInMap("product_id")]
        [Validation(Required=true)]
        public string ProductId { get; set; }

        // 商户id
        [NameInMap("shop_id")]
        [Validation(Required=true)]
        public string ShopId { get; set; }

        // 链上地址
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

    }

}
