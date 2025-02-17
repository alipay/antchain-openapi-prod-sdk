// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    // Das平台自定义pair，key和value只能为String类型
    public class StringPair : TeaModel {
        // key
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // 对应key的具体value
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
