// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 订单商品
    public class OrderProductInfo : TeaModel {
        // 商品编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>123456789012446</para>
        /// </summary>
        [NameInMap("product_id")]
        [Validation(Required=false)]
        public string ProductId { get; set; }

        // 商品名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>苹果手机</para>
        /// </summary>
        [NameInMap("product_name")]
        [Validation(Required=false)]
        public string ProductName { get; set; }

        // 商品数量
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("product_number")]
        [Validation(Required=false)]
        public long? ProductNumber { get; set; }

    }

}
