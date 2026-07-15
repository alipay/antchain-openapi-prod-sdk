// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 退款商品详细信息
    public class RefundGoodsDetail : TeaModel {
        // 商品编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>apple-01</para>
        /// </summary>
        [NameInMap("goods_id")]
        [Validation(Required=true)]
        public string GoodsId { get; set; }

        // 该商品的退款总金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>19.50</para>
        /// </summary>
        [NameInMap("refund_amount")]
        [Validation(Required=true)]
        public string RefundAmount { get; set; }

    }

}
