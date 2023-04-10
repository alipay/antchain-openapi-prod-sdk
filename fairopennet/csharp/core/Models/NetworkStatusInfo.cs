// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.FAIROPENNET.Models
{
    // getNetworkStatus接口输出
    public class NetworkStatusInfo : TeaModel {
        // 协作网络状态枚举类型
        [NameInMap("network_status")]
        [Validation(Required=true)]
        public string NetworkStatus { get; set; }

    }

}
