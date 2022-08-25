// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_6efc6591476e4813ac8f7c9b6359c0b7.Models
{
    // 键值对，兼容map用
    public class KeyValuePair : TeaModel {
        // key
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // value
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

    }

}
