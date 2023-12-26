// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 智能合约市场列表查询
    public class ContractTemplateQueryReq : TeaModel {
        // 页码
        [NameInMap("num")]
        [Validation(Required=true)]
        public long? Num { get; set; }

        // 页大小
        [NameInMap("size")]
        [Validation(Required=true)]
        public long? Size { get; set; }

    }

}
