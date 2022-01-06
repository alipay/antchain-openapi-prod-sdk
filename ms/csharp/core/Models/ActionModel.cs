// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 执行策略 拦截/监控
    public class ActionModel : TeaModel {
        // 拓展信息
        [NameInMap("extension")]
        [Validation(Required=false)]
        public string Extension { get; set; }

        // REJECT/PASS
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
