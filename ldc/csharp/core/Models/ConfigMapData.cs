// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 配置项数据
    public class ConfigMapData : TeaModel {
        // configmap data key
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // configmap data value
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
