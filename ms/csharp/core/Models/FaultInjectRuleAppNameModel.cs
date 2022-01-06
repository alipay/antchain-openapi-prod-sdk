// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 故障注入规则应用名
    public class FaultInjectRuleAppNameModel : TeaModel {
        // 应用名称
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // 规则数量
        [NameInMap("rule_num")]
        [Validation(Required=false)]
        public long? RuleNum { get; set; }

    }

}
