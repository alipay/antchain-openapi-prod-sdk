// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 表示容器的环境变量来源。
    public class EnvVarSource : TeaModel {
        // 对应的ConfigMap或Secret名称。
        [NameInMap("object_name")]
        [Validation(Required=true)]
        public string ObjectName { get; set; }

        // 对应的Object类型。
        // 取值：ConfigMap | Secret
        [NameInMap("object_type")]
        [Validation(Required=true)]
        public string ObjectType { get; set; }

        // 引用的ConfigMap或则Secret的key。
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

    }

}
