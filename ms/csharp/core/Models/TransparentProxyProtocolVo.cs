// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 透明劫持支持协议Vo
    public class TransparentProxyProtocolVo : TeaModel {
        // 最大请求数
        [NameInMap("max_req")]
        [Validation(Required=false)]
        public long? MaxReq { get; set; }

        // 端口
        [NameInMap("port")]
        [Validation(Required=true)]
        public long? Port { get; set; }

        // 协议
        [NameInMap("protocol")]
        [Validation(Required=true)]
        public string Protocol { get; set; }

    }

}
