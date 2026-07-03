// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 商城订单信息
    public class GoodsOrderInfo : TeaModel {
        // 商城订单号
        /// <summary>
        /// <b>Example:</b>
        /// <para>2023343380112</para>
        /// </summary>
        [NameInMap("goods_order_no")]
        [Validation(Required=true)]
        public string GoodsOrderNo { get; set; }

        // 消费金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>1000.00</para>
        /// </summary>
        [NameInMap("amount")]
        [Validation(Required=true)]
        public string Amount { get; set; }

    }

}
