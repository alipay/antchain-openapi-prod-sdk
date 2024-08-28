// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECHGUARD.Models
{
    // 键值对
    public class AiMap : TeaModel {
        // 键
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // 值
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

    }

}
