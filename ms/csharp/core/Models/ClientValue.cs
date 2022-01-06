// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 客户端内存值
    public class ClientValue : TeaModel {
        // 客户端内存里的值
        [NameInMap("data")]
        [Validation(Required=false)]
        public string Data { get; set; }

        // 客户端 IP
        [NameInMap("ip")]
        [Validation(Required=false)]
        public string Ip { get; set; }

        // 是否查询成功
        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

    }

}
