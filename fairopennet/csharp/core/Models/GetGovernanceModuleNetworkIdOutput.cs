// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.FAIROPENNET.Models
{
    // 如果非治理模式启动，返回错误码
    public class GetGovernanceModuleNetworkIdOutput : TeaModel {
        // networkID
        [NameInMap("network_id")]
        [Validation(Required=true)]
        public string NetworkId { get; set; }

    }

}
