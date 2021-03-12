// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 服务发现结果
    public class ServiceDiscoveryResult : TeaModel {
        // 提供该服务能力的did
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 提供该服务能力的endpoint信息
        [NameInMap("services")]
        [Validation(Required=true)]
        public List<DidDocServicesInfo> Services { get; set; }

    }

}
