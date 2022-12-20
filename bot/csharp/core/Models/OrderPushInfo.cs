// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 订单计费数据
    public class OrderPushInfo : TeaModel {
        // 订单号
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 时间戳，取订单上链timestamp字段
        [NameInMap("order_collect_time")]
        [Validation(Required=true)]
        public string OrderCollectTime { get; set; }

        // 订单总金额
        [NameInMap("total_amount")]
        [Validation(Required=true)]
        public string TotalAmount { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

    }

}
