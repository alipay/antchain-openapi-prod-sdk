// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 智能合约市场列表
    public class ContractTemplateListResp : TeaModel {
        // 合约市场列表
        [NameInMap("list")]
        [Validation(Required=false)]
        public List<ContractTemplateResp> List { get; set; }

        // 总数
        [NameInMap("total")]
        [Validation(Required=false)]
        public long? Total { get; set; }

    }

}
