// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // Container Spec 字段 Override 对象
    public class FieldOverride : TeaModel {
        // 部署单元名称
        [NameInMap("cell")]
        [Validation(Required=true)]
        public string Cell { get; set; }

        // 字段名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 字段值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
