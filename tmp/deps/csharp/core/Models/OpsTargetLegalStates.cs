// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 合法的运维状态
    public class OpsTargetLegalStates : TeaModel {
        // 目标类型
        [NameInMap("target_type")]
        [Validation(Required=false)]
        public string TargetType { get; set; }

        // 合法状态
        [NameInMap("states")]
        [Validation(Required=false)]
        public List<string> States { get; set; }

    }

}
