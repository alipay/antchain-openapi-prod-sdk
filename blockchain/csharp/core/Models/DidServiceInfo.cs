// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // Did doc中的service info
    public class DidServiceInfo : TeaModel {
        // 服务的end point info
        [NameInMap("end_point")]
        [Validation(Required=true)]
        public string EndPoint { get; set; }

        // 扩展字段信息
        [NameInMap("extension_info")]
        [Validation(Required=true)]
        public string ExtensionInfo { get; set; }

    }

}
