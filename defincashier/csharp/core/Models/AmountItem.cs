// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEFINCASHIER.Models
{
    // 金额
    public class AmountItem : TeaModel {
        // 余额，单位元
        [NameInMap("balance_amount")]
        [Validation(Required=true)]
        public string BalanceAmount { get; set; }

        // 币种，CNY-人民币
        [NameInMap("currency")]
        [Validation(Required=true)]
        public string Currency { get; set; }

        // 冻结余额，单位元
        [NameInMap("frozen_balance_amount")]
        [Validation(Required=true)]
        public string FrozenBalanceAmount { get; set; }

    }

}
