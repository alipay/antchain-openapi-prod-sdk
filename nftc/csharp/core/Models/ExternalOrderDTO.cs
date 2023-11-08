// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTC.Models
{
    // 外部订单对象
    public class ExternalOrderDTO : TeaModel {
        // 订单的状态
        // PAID 已支付
        // PENDING 待支付
        // NOT_EXIST 不存在
        [NameInMap("order_status")]
        [Validation(Required=true)]
        public string OrderStatus { get; set; }

        // 只有在PAID状态下，此字段才会有值
        // 由于当前一笔订单只会购买一个资产，因此当前list中只会有一个值
        [NameInMap("order_item_list")]
        [Validation(Required=false)]
        public List<ExternalOrderItemDTO> OrderItemList { get; set; }

    }

}
