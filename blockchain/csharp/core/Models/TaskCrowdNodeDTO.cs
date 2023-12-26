// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 任务人群配置
    public class TaskCrowdNodeDTO : TeaModel {
        // 节点ID
        [NameInMap("node_id")]
        [Validation(Required=true)]
        public string NodeId { get; set; }

        // 节点类型
        [NameInMap("node_type")]
        [Validation(Required=true)]
        public string NodeType { get; set; }

        // 是否排除
        [NameInMap("exclude")]
        [Validation(Required=true)]
        public bool? Exclude { get; set; }

        // 节点配置
        [NameInMap("node_config")]
        [Validation(Required=true)]
        public string NodeConfig { get; set; }

    }

}
