// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 阿里云链信息
    public class ALiYunChainInfo : TeaModel {
        // abnormal_nodes
        [NameInMap("abnormal_nodes")]
        [Validation(Required=false)]
        public long? AbnormalNodes { get; set; }

        // ant_chain_id
        [NameInMap("ant_chain_id")]
        [Validation(Required=false)]
        public string AntChainId { get; set; }

        // block_height
        [NameInMap("block_height")]
        [Validation(Required=false)]
        public long? BlockHeight { get; set; }

        // create_time
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

        // is_role
        [NameInMap("is_role")]
        [Validation(Required=false)]
        public bool? IsRole { get; set; }

        // node_number
        [NameInMap("node_number")]
        [Validation(Required=false)]
        public long? NodeNumber { get; set; }

        // normal
        [NameInMap("normal")]
        [Validation(Required=false)]
        public bool? Normal { get; set; }

        // transaction_sum
        [NameInMap("transaction_sum")]
        [Validation(Required=false)]
        public long? TransactionSum { get; set; }

        // Version
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

        // node_infos
        [NameInMap("node_infos")]
        [Validation(Required=false)]
        public List<ALiYunChainNodeInfo> NodeInfos { get; set; }

    }

}
