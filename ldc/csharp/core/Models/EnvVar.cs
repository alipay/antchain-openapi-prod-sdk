// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 表示容器的环境变量。
    public class EnvVar : TeaModel {
        // 环境变量名称。
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 环境变量value。
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

        // 环境变量的取值来源。
        [NameInMap("value_from")]
        [Validation(Required=false)]
        public EnvVarSource ValueFrom { get; set; }

        // EnvVar类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
