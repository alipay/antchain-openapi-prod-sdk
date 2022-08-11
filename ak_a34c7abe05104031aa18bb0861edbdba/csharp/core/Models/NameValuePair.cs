// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_a34c7abe05104031aa18bb0861edbdba.Models
{
    // 键值对，兼容map用
    public class NameValuePair : TeaModel {
        // 键名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 键值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
