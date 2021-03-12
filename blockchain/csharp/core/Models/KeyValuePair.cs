// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // {"key":"value"}
    public class KeyValuePair : TeaModel {
        // 键名
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // 值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
