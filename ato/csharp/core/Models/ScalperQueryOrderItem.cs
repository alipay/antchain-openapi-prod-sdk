// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 订单所有商品信息模型
    public class ScalperQueryOrderItem : TeaModel {
        // 订单商品名称
        [NameInMap("order_items_name")]
        [Validation(Required=false, MaxLength=256)]
        public string OrderItemsName { get; set; }

        // 订单商品数量
        [NameInMap("order_items_quantity")]
        [Validation(Required=false)]
        public long? OrderItemsQuantity { get; set; }

        // 订单商品价格，单位：分
        [NameInMap("order_items_price")]
        [Validation(Required=false)]
        public long? OrderItemsPrice { get; set; }

    }

}
