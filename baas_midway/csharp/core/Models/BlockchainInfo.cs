// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAAS_MIDWAY.Models
{
    // 区块链信息
    public class BlockchainInfo : TeaModel {
        // 链节点ID
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 区块链名称
        [NameInMap("blockchain_name")]
        [Validation(Required=true)]
        public string BlockchainName { get; set; }

        // 当前链如果为主链，该字段为空；否则该字段为子链对应的主链ID
        [NameInMap("parent_biz_id")]
        [Validation(Required=false)]
        public string ParentBizId { get; set; }

    }

}
