// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE.Models
{
    // 净值信息
    public class NetValueInfo : TeaModel {
        // 净值
        [NameInMap("net_value")]
        [Validation(Required=true)]
        public string NetValue { get; set; }

        // 币种（目前支持USD、HKD）
        [NameInMap("currency")]
        [Validation(Required=true)]
        public string Currency { get; set; }

        // 更新时间戳
        [NameInMap("update_time")]
        [Validation(Required=true)]
        public long? UpdateTime { get; set; }

    }

}
