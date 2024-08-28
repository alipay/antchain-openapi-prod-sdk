// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_63625f64df2048aca9ff5bea9e227854.Models
{
    // 键值对
    public class Map : TeaModel {
        // 键
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // 值
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

    }

}
