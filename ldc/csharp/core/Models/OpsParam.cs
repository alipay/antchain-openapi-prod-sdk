// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 部署参数
    public class OpsParam : TeaModel {
        // 部署参数键值
        [NameInMap("key")]
        [Validation(Required=false)]
        public string Key { get; set; }

        // 部署参数值
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

    }

}
