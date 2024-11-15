// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACOPM.Models
{
    // 商业化规则
    public class BusinessRule : TeaModel {
        // 规则类型（BUSINESS/INSTANCE/TENANT_WHITELIST）
        [NameInMap("rule_type")]
        [Validation(Required=true)]
        public string RuleType { get; set; }

        // 规则项列表
        [NameInMap("rule_items")]
        [Validation(Required=true)]
        public List<BusinessRuleItem> RuleItems { get; set; }

    }

}
