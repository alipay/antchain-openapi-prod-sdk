// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // KeyValue对属性
    public class KeyValueMap : TeaModel {
        // key-value中的key
        [NameInMap("key")]
        [Validation(Required=false, MaxLength=100)]
        public string Key { get; set; }

        // key-value中的value
        [NameInMap("value")]
        [Validation(Required=false, MaxLength=1000)]
        public string Value { get; set; }

    }

}
