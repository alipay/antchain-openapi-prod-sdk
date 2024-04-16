// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTC.Models
{
    // 订单商品对象
    public class ExternalOrderItemDTO : TeaModel {
        // 购买的sku id
        [NameInMap("sku_id")]
        [Validation(Required=true)]
        public long? SkuId { get; set; }

        // 购买后对应发放的藏品nftId，仅当orderStatus为FINISH时返回
        [NameInMap("nft_id")]
        [Validation(Required=true)]
        public string NftId { get; set; }

    }

}
