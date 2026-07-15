// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CLIPRODUCT.Models
{
    // 商品明细
    public class OrderItem : TeaModel {
        // 商品ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>SKU001</para>
        /// </summary>
        [NameInMap("item_id")]
        [Validation(Required=true)]
        public string ItemId { get; set; }

        // 数量
        /// <summary>
        /// <b>Example:</b>
        /// <para>2</para>
        /// </summary>
        [NameInMap("quantity")]
        [Validation(Required=true)]
        public long? Quantity { get; set; }

    }

}
