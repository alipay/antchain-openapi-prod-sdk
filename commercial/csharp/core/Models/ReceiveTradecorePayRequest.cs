// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COMMERCIAL.Models
{
    public class ReceiveTradecorePayRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 支付宝回调参数，参数可能变化，返回字符串
        [NameInMap("notify_data")]
        [Validation(Required=true)]
        public string NotifyData { get; set; }

    }

}
