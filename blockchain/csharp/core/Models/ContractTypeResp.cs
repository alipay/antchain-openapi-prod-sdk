// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 合约类型
    public class ContractTypeResp : TeaModel {
        // 合约服务类型
        [NameInMap("type_list")]
        [Validation(Required=false)]
        public List<ContractTypeListResp> TypeList { get; set; }

    }

}
