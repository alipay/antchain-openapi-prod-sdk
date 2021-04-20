// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENT.Models
{
    // 订单详情
    public class Order : TeaModel {
        // 实付金额，单位分
        [NameInMap("actual_total_amount")]
        [Validation(Required=true)]
        public long? ActualTotalAmount { get; set; }

        // 币种，目前仅支持 CNY
        [NameInMap("currency")]
        [Validation(Required=false)]
        public string Currency { get; set; }

        // 数量
        [NameInMap("item_count")]
        [Validation(Required=true)]
        public long? ItemCount { get; set; }

        // 唯一订单号
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 订单状态，ORDER_CREATE：订单创建，ORDER_CANCEL：订单取消
        [NameInMap("order_status")]
        [Validation(Required=true)]
        public string OrderStatus { get; set; }

        // 原始金额，单位分
        [NameInMap("original_total_amount")]
        [Validation(Required=true)]
        public long? OriginalTotalAmount { get; set; }

        // 确认类型，DIRECT：直接发放，TWO_STEP：两部发放。该字段可为空，默认为 TWO_STEP
        [NameInMap("confirm_type")]
        [Validation(Required=false)]
        public string ConfirmType { get; set; }

    }

}
