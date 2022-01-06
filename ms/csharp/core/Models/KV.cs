// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // key，value数据结构
    public class KV : TeaModel {
        // 键
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // 值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
