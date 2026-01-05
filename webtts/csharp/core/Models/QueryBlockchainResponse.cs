// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTTS.Models
{
    // 区块链response
    public class QueryBlockchainResponse : TeaModel {
        // 链名称
        [NameInMap("blockchain")]
        [Validation(Required=true)]
        public string Blockchain { get; set; }

        // 链类型
        [NameInMap("chain_type")]
        [Validation(Required=true)]
        public string ChainType { get; set; }

    }

}
