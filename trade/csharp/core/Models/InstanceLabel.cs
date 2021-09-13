// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TRADE.Models
{
    // 标签对象
    public class InstanceLabel : TeaModel {
        // 标签名。
        // 传递isvId
        [NameInMap("instance_key")]
        [Validation(Required=true)]
        public string InstanceKey { get; set; }

        // 标签值
        [NameInMap("instance_value")]
        [Validation(Required=true)]
        public string InstanceValue { get; set; }

    }

}
