// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 阿里云链节点信息
    public class ALiYunChainNodeInfo : TeaModel {
        // block_height
        [NameInMap("block_height")]
        [Validation(Required=false)]
        public long? BlockHeight { get; set; }

        // node_name
        [NameInMap("node_name")]
        [Validation(Required=false)]
        public string NodeName { get; set; }

        // status
        [NameInMap("status")]
        [Validation(Required=false)]
        public bool? Status { get; set; }

        // version
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

        // 节点id
        [NameInMap("node_id")]
        [Validation(Required=false)]
        public string NodeId { get; set; }

        // 节点ip
        [NameInMap("node_ip")]
        [Validation(Required=false)]
        public string NodeIp { get; set; }

        // 节点的端口
        [NameInMap("node_port")]
        [Validation(Required=false)]
        public string NodePort { get; set; }

        // 节点类型
        [NameInMap("node_type")]
        [Validation(Required=false)]
        public string NodeType { get; set; }

        // 节点状态
        [NameInMap("node_state")]
        [Validation(Required=false)]
        public string NodeState { get; set; }

        // 节点来源
        [NameInMap("node_source")]
        [Validation(Required=false)]
        public string NodeSource { get; set; }

        // 节点存储空间使用量
        [NameInMap("disk_use")]
        [Validation(Required=false)]
        public string DiskUse { get; set; }

        // 节点存储总空间大小
        [NameInMap("disk_total")]
        [Validation(Required=false)]
        public string DiskTotal { get; set; }

        // 节点公钥
        [NameInMap("public_key")]
        [Validation(Required=false)]
        public string PublicKey { get; set; }

    }

}
