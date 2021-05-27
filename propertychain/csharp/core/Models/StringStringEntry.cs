// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    // key和value均为String的entry
    public class StringStringEntry : TeaModel {
        // 键
        [NameInMap("key")]
        [Validation(Required=false)]
        public string Key { get; set; }

        // 值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
