// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.FAIROPENNET.Models
{
    // GetNetworkStatus接口输入，包含networkId
    public class GetNetworkStatusInput : TeaModel {
        // 网络的networkId
        [NameInMap("network_id")]
        [Validation(Required=true)]
        public string NetworkId { get; set; }

    }

}
