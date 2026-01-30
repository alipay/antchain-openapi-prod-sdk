// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TRADE.Models
{
    // 履约开通参数
    public class ProvisionOption : TeaModel {
        // 订单开始时间 (ISO 8601 UTC)，可自定义覆盖默认值
        [NameInMap("order_start_time")]
        [Validation(Required=false)]
        public string OrderStartTime { get; set; }

    }

}
