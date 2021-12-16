// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COMMERCIAL.Models
{
    // MultiCurrencyMoneyVO
    public class MultiCurrencyMoneyVO : TeaModel {
        // amount
        [NameInMap("amt")]
        [Validation(Required=true)]
        public string Amt { get; set; }

        // ccy
        [NameInMap("ccy")]
        [Validation(Required=true)]
        public string Ccy { get; set; }

    }

}
