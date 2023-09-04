// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_320bc483f2434f39a3af9ec9f04d3cc0.Models
{
    // 退保失败订单信息
    public class FailOrderInfo : TeaModel {
        // 退保失败订单号
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 失败原因
        [NameInMap("fail_reason")]
        [Validation(Required=true)]
        public string FailReason { get; set; }

    }

}
