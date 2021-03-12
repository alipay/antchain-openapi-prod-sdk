// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 数据授权服务审批流程节点结构体
    public class ProcessNode : TeaModel {
        // 审批节点ID
        [NameInMap("node_id")]
        [Validation(Required=true, MaxLength=100)]
        public string NodeId { get; set; }

        // 节点名称
        [NameInMap("node_name")]
        [Validation(Required=true, MaxLength=64)]
        public string NodeName { get; set; }

        // 节点序号，从1开始编号
        [NameInMap("node_num")]
        [Validation(Required=true)]
        public long? NodeNum { get; set; }

    }

}
