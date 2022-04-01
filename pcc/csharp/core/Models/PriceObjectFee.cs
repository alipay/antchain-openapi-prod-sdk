// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PCC.Models
{
    // 收费项结果明细
    public class PriceObjectFee : TeaModel {
        // 收费项CODE
        [NameInMap("price_object_code")]
        [Validation(Required=false)]
        public string PriceObjectCode { get; set; }

        // 收费项名称
        [NameInMap("price_object_name")]
        [Validation(Required=false)]
        public string PriceObjectName { get; set; }

        // 高精度价格12位
        [NameInMap("price")]
        [Validation(Required=false)]
        public string Price { get; set; }

        // 价格类型，标准价格，一客一价
        [NameInMap("price_type")]
        [Validation(Required=false)]
        public string PriceType { get; set; }

        // 结算信息
        [NameInMap("settle_type")]
        [Validation(Required=false)]
        public string SettleType { get; set; }

        // 币种
        [NameInMap("currency")]
        [Validation(Required=false)]
        public string Currency { get; set; }

        // 命中的定价计划
        [NameInMap("price_plan_vo")]
        [Validation(Required=false)]
        public PricePlanVO PricePlanVo { get; set; }

        // 命中的定价计划约束
        [NameInMap("price_constraint_vo")]
        [Validation(Required=false)]
        public PriceConstraintVO PriceConstraintVo { get; set; }

        // 扩展信息
        [NameInMap("extends_map")]
        [Validation(Required=false)]
        public string ExtendsMap { get; set; }

        // BD销售价格区间
        [NameInMap("bd_price")]
        [Validation(Required=false)]
        public string BdPrice { get; set; }

        // 最低成本价
        [NameInMap("cost_price")]
        [Validation(Required=false)]
        public string CostPrice { get; set; }

    }

}
