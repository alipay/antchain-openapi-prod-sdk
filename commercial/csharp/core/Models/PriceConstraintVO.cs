// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COMMERCIAL.Models
{
    // 定价约束信息VO
    public class PriceConstraintVO : TeaModel {
        // 规格条件Code
        [NameInMap("spec_condition_code")]
        [Validation(Required=true)]
        public string SpecConditionCode { get; set; }

        // 当前规格条件下可选值
        [NameInMap("target_value")]
        [Validation(Required=true)]
        public string TargetValue { get; set; }

        // 基础价格
        [NameInMap("base_price")]
        [Validation(Required=true)]
        public string BasePrice { get; set; }

        // bd价格
        [NameInMap("bd_price")]
        [Validation(Required=true)]
        public string BdPrice { get; set; }

        // 成本价格
        [NameInMap("cost_price")]
        [Validation(Required=true)]
        public string CostPrice { get; set; }

    }

}
