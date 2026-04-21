// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 定价策略
    public class PriceStrategy : TeaModel {
        // 定价策略类型
        [NameInMap("strategy_type")]
        [Validation(Required=false)]
        public string StrategyType { get; set; }

        // 策略值
        [NameInMap("strategy_value")]
        [Validation(Required=false)]
        public string StrategyValue { get; set; }

        // 最小金额（单位：分）
        [NameInMap("min_price")]
        [Validation(Required=false)]
        public long? MinPrice { get; set; }

        // 最大金额（单位：分）
        [NameInMap("max_price")]
        [Validation(Required=false)]
        public long? MaxPrice { get; set; }

        // 门槛金额（单位：分）
        [NameInMap("threshold")]
        [Validation(Required=false)]
        public long? Threshold { get; set; }

        // 门槛类型
        [NameInMap("threshold_type")]
        [Validation(Required=false)]
        public string ThresholdType { get; set; }

    }

}
