// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 再融资订单信息
    public class RefinanceOrderInfoResponse : TeaModel {
        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 合约id
        [NameInMap("application_id")]
        [Validation(Required=true)]
        public string ApplicationId { get; set; }

    }

}
