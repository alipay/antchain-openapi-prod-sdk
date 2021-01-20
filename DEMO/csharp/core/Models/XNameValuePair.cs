// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    // 键值对
    public class XNameValuePair : TeaModel {
        // 键名
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 键值
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

    }

}
