// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COMMERCIAL.Models
{
    // 定价计划信息VO
    public class PricePlanVO : TeaModel {
        // 规格Code
        [NameInMap("spec_code")]
        [Validation(Required=true)]
        public string SpecCode { get; set; }

        // 定价类型
        [NameInMap("price_type")]
        [Validation(Required=true)]
        public string PriceType { get; set; }

        // 定价计划描述
        [NameInMap("price_plan_desc")]
        [Validation(Required=true)]
        public string PricePlanDesc { get; set; }

        // 定价约束列表
        [NameInMap("price_constraint")]
        [Validation(Required=true)]
        public List<PriceConstraintVO> PriceConstraint { get; set; }

    }

}
