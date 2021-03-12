// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 授权流程节点详细信息
    public class NodeDetail : TeaModel {
        // 节点审批意见
        [NameInMap("comment")]
        [Validation(Required=true)]
        public string Comment { get; set; }

        // 节点ID
        [NameInMap("node_id")]
        [Validation(Required=true)]
        public string NodeId { get; set; }

        // 节点名称
        [NameInMap("node_name")]
        [Validation(Required=true)]
        public string NodeName { get; set; }

        // 节点状态
        [NameInMap("node_status")]
        [Validation(Required=true)]
        public string NodeStatus { get; set; }

        // 节点审批时间
        [NameInMap("operate_time")]
        [Validation(Required=true)]
        public long? OperateTime { get; set; }

        // 扩展参数
        [NameInMap("extension_info")]
        [Validation(Required=false)]
        public string ExtensionInfo { get; set; }

    }

}
