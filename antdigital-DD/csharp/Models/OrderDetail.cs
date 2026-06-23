// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 订单详情
    public class OrderDetail : TeaModel {
        // 商品名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>商品A</para>
        /// </summary>
        [NameInMap("item_name")]
        [Validation(Required=true)]
        public string ItemName { get; set; }

        // 数量
        /// <summary>
        /// <b>Example:</b>
        /// <para>2</para>
        /// </summary>
        [NameInMap("quantity")]
        [Validation(Required=true)]
        public long? Quantity { get; set; }

        // 单价
        /// <summary>
        /// <b>Example:</b>
        /// <para>50</para>
        /// </summary>
        [NameInMap("price")]
        [Validation(Required=true)]
        public long? Price { get; set; }

    }

}
