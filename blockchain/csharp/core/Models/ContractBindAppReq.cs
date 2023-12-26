// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 关联应用
    public class ContractBindAppReq : TeaModel {
        // 应用ID
        [NameInMap("application_id")]
        [Validation(Required=true, MaxLength=64)]
        public string ApplicationId { get; set; }

        // 合约服务标识集合
        [NameInMap("service_ids")]
        [Validation(Required=false)]
        public List<string> ServiceIds { get; set; }

    }

}
