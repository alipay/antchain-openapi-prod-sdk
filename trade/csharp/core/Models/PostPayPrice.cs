// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TRADE.Models
{
    // 后付商品签约价，用于在履约阶段生成一客一价
    public class PostPayPrice : TeaModel {
        //  币种单位值，156（CNY)
        [NameInMap("currency_value")]
        [Validation(Required=false)]
        public string CurrencyValue { get; set; }

        //  价格周期
        [NameInMap("duration")]
        [Validation(Required=false)]
        public OrderDuration Duration { get; set; }

        // 非继承型一客一价
        [NameInMap("no_extend_prices")]
        [Validation(Required=false)]
        public List<NoExtendPrice> NoExtendPrices { get; set; }

    }

}
