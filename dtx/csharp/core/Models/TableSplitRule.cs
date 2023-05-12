// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    // 分表规则
    public class TableSplitRule : TeaModel {
        // 分表规则名
        [NameInMap("rule_name")]
        [Validation(Required=true)]
        public string RuleName { get; set; }

        // 格式模板
        [NameInMap("rule_template")]
        [Validation(Required=true)]
        public string RuleTemplate { get; set; }

    }

}
