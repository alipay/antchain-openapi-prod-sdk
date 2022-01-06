// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 应用名及应用下的规则数
    public class AppNameCountModel : TeaModel {
        // 应用名
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // 规则数
        [NameInMap("rule_num")]
        [Validation(Required=false)]
        public long? RuleNum { get; set; }

    }

}
