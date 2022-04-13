// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // Secret数据
    public class SecretData : TeaModel {
        // secret data key
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // secret data value
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
