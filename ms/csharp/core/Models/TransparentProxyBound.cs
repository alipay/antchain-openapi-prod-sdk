// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 透明劫持出入方向配置
    public class TransparentProxyBound : TeaModel {
        // 端口段
        [NameInMap("port_range")]
        [Validation(Required=true)]
        public List<TransparentProxyPortPair> PortRange { get; set; }

        // 网段
        [NameInMap("ip_range")]
        [Validation(Required=true)]
        public List<TransparentProxyIpPair> IpRange { get; set; }

    }

}
