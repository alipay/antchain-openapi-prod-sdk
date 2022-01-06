// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 客户端
    public class Client : TeaModel {
        // 所属的 cell
        [NameInMap("cell")]
        [Validation(Required=false)]
        public string Cell { get; set; }

        // 客户端内存里的值
        [NameInMap("data")]
        [Validation(Required=false)]
        public string Data { get; set; }

        // 客户端 IP
        [NameInMap("ip")]
        [Validation(Required=false)]
        public string Ip { get; set; }

        // 推送的值
        [NameInMap("push_data")]
        [Validation(Required=false)]
        public string PushData { get; set; }

    }

}
