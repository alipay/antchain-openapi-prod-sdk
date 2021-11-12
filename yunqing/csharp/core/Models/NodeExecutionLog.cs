// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 节点执行日志
    public class NodeExecutionLog : TeaModel {
        // 当前节点的动作
        [NameInMap("node_action")]
        [Validation(Required=true)]
        public string NodeAction { get; set; }

        // 当前节点的执行日志信息
        [NameInMap("message")]
        [Validation(Required=true)]
        public string Message { get; set; }

    }

}
