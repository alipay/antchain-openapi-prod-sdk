// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    // 标签
    public class Label : TeaModel {
        // 标签key
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // 标签value
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
