// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 关联奖品列表
    public class PrizeList : TeaModel {
        // 对客展示信息
        [NameInMap("display_info")]
        [Validation(Required=false)]
        public DisplayInfo DisplayInfo { get; set; }

        // 定价策略
        [NameInMap("price_strategy")]
        [Validation(Required=false)]
        public PriceStrategy PriceStrategy { get; set; }

        // 奖品基本信息
        [NameInMap("prize_base_info")]
        [Validation(Required=false)]
        public PrizeBaseInfo PrizeBaseInfo { get; set; }

    }

}
