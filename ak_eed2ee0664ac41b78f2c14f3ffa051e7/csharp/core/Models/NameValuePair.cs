// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_eed2ee0664ac41b78f2c14f3ffa051e7.Models
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
