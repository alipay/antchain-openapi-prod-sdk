// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SAAS_SECURITY.Models
{
    // 键值对
    public class KeyValuePair : TeaModel {
        // 23
        [NameInMap("key")]
        [Validation(Required=false)]
        public string Key { get; set; }

        // 123
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

    }

}
