// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TRADE.Models
{
    // 支付选项
    public class PayOptions : TeaModel {
        // 系统自动会根据账号类型、当前OU进行付费渠道判定；如果传入的付款渠道不满足，则报错
        [NameInMap("pay_channel")]
        [Validation(Required=false)]
        public string PayChannel { get; set; }

    }

}
