// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // http接入方式
    public class HttpEntry : TeaModel {
        // 端口
        [NameInMap("port")]
        [Validation(Required=true)]
        public long? Port { get; set; }

        // 是否使用websocket连接方式
        [NameInMap("websocket_connect")]
        [Validation(Required=true)]
        public bool? WebsocketConnect { get; set; }

    }

}
