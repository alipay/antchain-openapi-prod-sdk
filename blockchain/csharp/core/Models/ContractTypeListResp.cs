// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 合约类型
    public class ContractTypeListResp : TeaModel {
        // 名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 值
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

    }

}
