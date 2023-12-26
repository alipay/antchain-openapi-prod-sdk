// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 合约绑定关系
    public class ContractBindResp : TeaModel {
        // 合约标识
        [NameInMap("service_id")]
        [Validation(Required=false)]
        public string ServiceId { get; set; }

        // 合约名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 是否已关联
        [NameInMap("bind")]
        [Validation(Required=false)]
        public bool? Bind { get; set; }

    }

}
