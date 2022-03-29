// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 二元组
    public class Pair : TeaModel {
        // 键值对中的 键
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // 键值对中的值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
