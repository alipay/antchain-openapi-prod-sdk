// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MDIP.Models
{
    // 退款订单信息
    public class RefoundGoodOrderInfo : TeaModel {
        // 商城订单号
        /// <summary>
        /// <b>Example:</b>
        /// <para>2023343380112</para>
        /// </summary>
        [NameInMap("goods_order_no")]
        [Validation(Required=true)]
        public string GoodsOrderNo { get; set; }

        // 退款金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>1000.00</para>
        /// </summary>
        [NameInMap("amount")]
        [Validation(Required=true)]
        public string Amount { get; set; }

    }

}
