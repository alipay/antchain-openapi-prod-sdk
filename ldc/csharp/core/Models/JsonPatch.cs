// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // JsonPatch
    public class JsonPatch : TeaModel {
        // 操作类型
        [NameInMap("op")]
        [Validation(Required=true)]
        public string Op { get; set; }

        // json path 路径
        [NameInMap("path")]
        [Validation(Required=true)]
        public string Path { get; set; }

        // 值
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

        // 值类型，默认 string
        [NameInMap("value_type")]
        [Validation(Required=false)]
        public string ValueType { get; set; }

    }

}
