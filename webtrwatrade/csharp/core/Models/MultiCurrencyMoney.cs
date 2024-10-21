// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE.Models
{
    // 多币种金额
    public class MultiCurrencyMoney : TeaModel {
        // 金额，以分为单位
        [NameInMap("cent")]
        [Validation(Required=true)]
        public string Cent { get; set; }

        // 币种编码
        [NameInMap("currency")]
        [Validation(Required=true)]
        public string Currency { get; set; }

        // 金额，以元为单位，保留6位小数
        [NameInMap("amount")]
        [Validation(Required=true)]
        public string Amount { get; set; }

    }

}
