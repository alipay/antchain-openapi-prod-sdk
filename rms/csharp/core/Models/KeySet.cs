// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 对应Map结构
    public class KeySet : TeaModel {
        // key
        [NameInMap("key")]
        [Validation(Required=false)]
        public string Key { get; set; }

        // value
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

    }

}
