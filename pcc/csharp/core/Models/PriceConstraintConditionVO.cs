// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PCC.Models
{
    // 约束条件列表
    public class PriceConstraintConditionVO : TeaModel {
        // 约束ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 价格约束ID
        [NameInMap("price_constraint_id")]
        [Validation(Required=true)]
        public long? PriceConstraintId { get; set; }

        // 规格条件CODE
        [NameInMap("spec_condition_code")]
        [Validation(Required=false)]
        public string SpecConditionCode { get; set; }

        // 条件关系比较符
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // 待比较对象的值
        [NameInMap("target_value")]
        [Validation(Required=false)]
        public string TargetValue { get; set; }

        // 特定场景下set才会有值
        [NameInMap("spec_condition_name")]
        [Validation(Required=false)]
        public string SpecConditionName { get; set; }

        // 特定场景下set才会有值
        [NameInMap("target_value_name")]
        [Validation(Required=false)]
        public string TargetValueName { get; set; }

        // 描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

    }

}
