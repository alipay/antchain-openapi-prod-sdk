// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PCC.Models
{
    // 定价计划对应的约束
    public class PriceConstraintVO : TeaModel {
        // 定价计划ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 定价计划ID
        [NameInMap("price_plan_id")]
        [Validation(Required=true)]
        public long? PricePlanId { get; set; }

        // 定价计划名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 约束条件列表
        [NameInMap("price_constraint_condition_vo_list")]
        [Validation(Required=false)]
        public List<PriceConstraintConditionVO> PriceConstraintConditionVoList { get; set; }

        // 约束结果列表
        [NameInMap("price_constraint_result_vo_list")]
        [Validation(Required=false)]
        public List<PriceConstraintResultVO> PriceConstraintResultVoList { get; set; }

    }

}
