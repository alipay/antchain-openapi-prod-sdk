// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 订单还款承诺
    public class OrderPromiseInfo : TeaModel {
        // 订单还款策略
        [NameInMap("repay_strategy_list")]
        [Validation(Required=false)]
        public List<OrderRepayStrategy> RepayStrategyList { get; set; }

    }

}
