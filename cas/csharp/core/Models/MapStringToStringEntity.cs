// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 一个 key-value 键值对
    public class MapStringToStringEntity : TeaModel {
        // 键名
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // 键值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
