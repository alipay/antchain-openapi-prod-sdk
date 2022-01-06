// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 故障隔离App列表
    public class FaultToleranceRuleAppModel : TeaModel {
        // app名称
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // 规则数量
        [NameInMap("rules_num")]
        [Validation(Required=false)]
        public long? RulesNum { get; set; }

    }

}
