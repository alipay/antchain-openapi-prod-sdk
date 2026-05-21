// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SDS.Models
{
    // 【减至批次特定信息】 单品优惠特定信息
    public class CutToMessage : TeaModel {
        // 【可用优惠的商品最高单价】 可用优惠的商品最高单价，单位：分。
        [NameInMap("single_price_max")]
        [Validation(Required=true)]
        public long? SinglePriceMax { get; set; }

        // 【减至后的优惠单价】 减至后的优惠单价，单位：分。
        [NameInMap("cut_to_price")]
        [Validation(Required=true)]
        public long? CutToPrice { get; set; }

    }

}
