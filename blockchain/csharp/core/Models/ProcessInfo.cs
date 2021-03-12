// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 授权服务流程信息
    public class ProcessInfo : TeaModel {
        // 当前处理节点
        [NameInMap("current_node")]
        [Validation(Required=true)]
        public long? CurrentNode { get; set; }

        // 扩展信息
        [NameInMap("extension_info")]
        [Validation(Required=false)]
        public string ExtensionInfo { get; set; }

        // 节点列表
        [NameInMap("nodes")]
        [Validation(Required=true)]
        public List<NodeDetail> Nodes { get; set; }

        // 流程ID
        [NameInMap("process_id")]
        [Validation(Required=true)]
        public string ProcessId { get; set; }

        // 流程状态
        [NameInMap("process_status")]
        [Validation(Required=true)]
        public string ProcessStatus { get; set; }

        // 流程节点总数
        [NameInMap("total_count")]
        [Validation(Required=true)]
        public long? TotalCount { get; set; }

        // 数据对象ID
        [NameInMap("data_id")]
        [Validation(Required=true)]
        public string DataId { get; set; }

    }

}
