// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 环境变量配置覆盖。
    public class EnvVarOverride : TeaModel {
        // 部署单元名称。
        [NameInMap("cell")]
        [Validation(Required=true)]
        public string Cell { get; set; }

        // 环境变量名称。
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 环境变量取值。
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
