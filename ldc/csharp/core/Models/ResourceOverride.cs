// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // V1FederatedAppInstanceRevisionSpecOverridesAppinstance
    public class ResourceOverride : TeaModel {
        // 部署单元名称，ALL 代表所有部署单元
        [NameInMap("cell")]
        [Validation(Required=true)]
        public string Cell { get; set; }

        // fed 资源路径
        [NameInMap("path")]
        [Validation(Required=true)]
        public string Path { get; set; }

        // 值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

        // 值的字段类型，支持 string、number、boolean
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
