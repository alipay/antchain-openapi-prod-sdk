// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 合约列表
    public class ContractPageResp : TeaModel {
        // 合约列表
        [NameInMap("list")]
        [Validation(Required=false)]
        public List<ContractPageListResp> List { get; set; }

        // 总数
        [NameInMap("total")]
        [Validation(Required=false)]
        public long? Total { get; set; }

    }

}
