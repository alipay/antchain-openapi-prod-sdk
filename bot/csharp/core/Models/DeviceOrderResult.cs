// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 订单同步成功列表
    public class DeviceOrderResult : TeaModel {
        // 上链id
        [NameInMap("antchain_id")]
        [Validation(Required=true)]
        public string AntchainId { get; set; }

        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

    }

}
