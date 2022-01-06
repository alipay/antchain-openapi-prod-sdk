// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // appName模型
    public class CircuitBreakerRuleAppNamesModel : TeaModel {
        // 应用名
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 规则个数
        [NameInMap("rules_num")]
        [Validation(Required=true)]
        public long? RulesNum { get; set; }

    }

}
