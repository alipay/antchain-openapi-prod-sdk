// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 客户端信息
    public class ClientInfo : TeaModel {
        // 订阅客户端地址列表
        [NameInMap("ip")]
        [Validation(Required=false)]
        public string Ip { get; set; }

    }

}
