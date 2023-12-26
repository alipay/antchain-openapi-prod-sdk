// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 合约与应用关联信息
    public class ContractBindListResp : TeaModel {
        // 合约关联列表
        [NameInMap("list")]
        [Validation(Required=false)]
        public List<ContractBindResp> List { get; set; }

    }

}
