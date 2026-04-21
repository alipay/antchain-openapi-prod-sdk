// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 对客展示信息
    public class DisplayInfo : TeaModel {
        // 权益名称
        [NameInMap("benefit_name")]
        [Validation(Required=false)]
        public string BenefitName { get; set; }

        // 展示金额文案
        [NameInMap("show_amount_text")]
        [Validation(Required=false)]
        public string ShowAmountText { get; set; }

        // 门槛金额文案
        [NameInMap("threshold_amount_text")]
        [Validation(Required=false)]
        public string ThresholdAmountText { get; set; }

        // 使用说明
        [NameInMap("benefit_usage_desc")]
        [Validation(Required=false)]
        public string BenefitUsageDesc { get; set; }

        // 规则描述
        [NameInMap("benefit_rule_desc")]
        [Validation(Required=false)]
        public string BenefitRuleDesc { get; set; }

    }

}
