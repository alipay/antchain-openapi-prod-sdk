// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // GoodsIdAndCount
    public class GoodsIdAndCount : TeaModel {
        // 商品id
        /// <summary>
        /// <b>Example:</b>
        /// <para>23123131</para>
        /// </summary>
        [NameInMap("goods_sku_id")]
        [Validation(Required=true)]
        public long? GoodsSkuId { get; set; }

        // 商品采购数量
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("count")]
        [Validation(Required=true)]
        public long? Count { get; set; }

    }

}
