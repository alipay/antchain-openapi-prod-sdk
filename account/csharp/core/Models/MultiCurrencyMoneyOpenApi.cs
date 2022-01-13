// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACCOUNT.Models
{
    // 金额类
    public class MultiCurrencyMoneyOpenApi : TeaModel {
        // 最小币种单位
        [NameInMap("cent")]
        [Validation(Required=true)]
        public string Cent { get; set; }

        // 币种
        [NameInMap("currency_value")]
        [Validation(Required=true)]
        public string CurrencyValue { get; set; }

    }

}
