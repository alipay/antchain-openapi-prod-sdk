// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 合约信息
    public class ContractInfo : TeaModel {
        // 合约地址
        [NameInMap("contract")]
        [Validation(Required=false)]
        public string Contract { get; set; }

        // 部署hash
        [NameInMap("hash")]
        [Validation(Required=false)]
        public string Hash { get; set; }

        // 合约部署时间
        [NameInMap("timestamp")]
        [Validation(Required=false)]
        public long? Timestamp { get; set; }

    }

}
