// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 合约查询
    public class ContractQueryDetailReq : TeaModel {
        // 服务ID
        [NameInMap("service_id")]
        [Validation(Required=true, MaxLength=64)]
        public string ServiceId { get; set; }

    }

}
