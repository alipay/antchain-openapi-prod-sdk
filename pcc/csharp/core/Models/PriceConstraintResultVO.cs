// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PCC.Models
{
    // 约束结果
    public class PriceConstraintResultVO : TeaModel {
        // 价格id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 价格约束ID
        [NameInMap("price_constraint_id")]
        [Validation(Required=true)]
        public long? PriceConstraintId { get; set; }

        // 基础价格费率
        [NameInMap("base_price")]
        [Validation(Required=false)]
        public string BasePrice { get; set; }

        // 基础保底价
        [NameInMap("adjust_price")]
        [Validation(Required=false)]
        public string AdjustPrice { get; set; }

        // BD销售最低价费率
        [NameInMap("bd_price")]
        [Validation(Required=false)]
        public string BdPrice { get; set; }

        // 成本价费率
        [NameInMap("cost_price")]
        [Validation(Required=false)]
        public string CostPrice { get; set; }

        // 阶梯区间最小值
        [NameInMap("ladder_start")]
        [Validation(Required=false)]
        public string LadderStart { get; set; }

        // 阶梯区间结束值
        [NameInMap("ladder_end")]
        [Validation(Required=false)]
        public string LadderEnd { get; set; }

        // 价格单位，例如：元/每次
        [NameInMap("price_unit")]
        [Validation(Required=false)]
        public string PriceUnit { get; set; }

        // 是否阶梯固定价
        [NameInMap("ladder_price_fixed")]
        [Validation(Required=false)]
        public bool? LadderPriceFixed { get; set; }

    }

}
