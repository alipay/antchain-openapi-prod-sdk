// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 内部建链信息查询
    public class CreateBlockchainInfo : TeaModel {
        // 链id
        [NameInMap("bizid")]
        [Validation(Required=true)]
        public string Bizid { get; set; }

        // 链的状态
        [NameInMap("blockchain_status")]
        [Validation(Required=true)]
        public string BlockchainStatus { get; set; }

        // 链的类型
        [NameInMap("blockchain_type")]
        [Validation(Required=true)]
        public string BlockchainType { get; set; }

        // 链的名称
        [NameInMap("blockchain_name")]
        [Validation(Required=true)]
        public string BlockchainName { get; set; }

        // 节点数量
        [NameInMap("blockchan_node_num")]
        [Validation(Required=true)]
        public long? BlockchanNodeNum { get; set; }

        // 创建时间
        [NameInMap("blockchain_create_time")]
        [Validation(Required=true)]
        public long? BlockchainCreateTime { get; set; }

    }

}
