// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENT.Models
{
    // 交易订单信息
    public class TradeOrder : TeaModel {
        // 订单唯一编号
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 订单原始金额，单位分
        [NameInMap("original_total_amount")]
        [Validation(Required=true)]
        public long? OriginalTotalAmount { get; set; }

        // 订单实付金额，单位分
        [NameInMap("actual_total_amount")]
        [Validation(Required=true)]
        public long? ActualTotalAmount { get; set; }

        // 数量
        [NameInMap("item_count")]
        [Validation(Required=true)]
        public long? ItemCount { get; set; }

        // 币种，暂时只支持人民币 CNY
        [NameInMap("currency")]
        [Validation(Required=false)]
        public string Currency { get; set; }

    }

}
