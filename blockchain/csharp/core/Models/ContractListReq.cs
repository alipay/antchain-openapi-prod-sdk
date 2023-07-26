// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 合约服务列表查询
    public class ContractListReq : TeaModel {
        // 合约服务类别
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
