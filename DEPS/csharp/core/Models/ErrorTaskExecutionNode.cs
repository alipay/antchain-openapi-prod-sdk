// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 执行失败任务节点
    public class ErrorTaskExecutionNode : TeaModel {
        // 节点 ID
        [NameInMap("node_id")]
        [Validation(Required=false)]
        public string NodeId { get; set; }

        // 节点名
        [NameInMap("node_name")]
        [Validation(Required=false)]
        public string NodeName { get; set; }

        // 错误码
        [NameInMap("code")]
        [Validation(Required=false)]
        public string Code { get; set; }

        // 错误信息
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

    }

}
