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
        [NameInMap("goods_order_no")]
        [Validation(Required=true)]
        public string GoodsOrderNo { get; set; }

        // 消费金额
        [NameInMap("amount")]
        [Validation(Required=true)]
        public string Amount { get; set; }

    }

}
