// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TRADE.Models
{
    // 预付金额
    public class PrepayAmount : TeaModel {
        // 指定预付费金额
        [NameInMap("amount")]
        [Validation(Required=true)]
        public string Amount { get; set; }

        // 币种单位，CNY\USD等标准币种单位编码
        [NameInMap("currency")]
        [Validation(Required=true)]
        public string Currency { get; set; }

    }

}
