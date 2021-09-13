// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TRADE.Models
{
    // 订单周期结构
    public class OrderDuration : TeaModel {
        // 周期类型，YEAR：年；MONTH：月；DAY：日
        [NameInMap("duration_type")]
        [Validation(Required=true)]
        public string DurationType { get; set; }

        // 订购周期值
        [NameInMap("duration_value")]
        [Validation(Required=true)]
        public long? DurationValue { get; set; }

    }

}
