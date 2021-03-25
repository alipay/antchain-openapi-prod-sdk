// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 记录额外信息，核心是一个 Key-Value 对
    public class Tag : TeaModel {
        // 可读键名
        [NameInMap("display_name")]
        [Validation(Required=false)]
        public string DisplayName { get; set; }

        // 键名
        [NameInMap("key")]
        [Validation(Required=false)]
        public string Key { get; set; }

        // 映射类型，可选
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 键值
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

    }

}
