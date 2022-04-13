// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // App配置依赖
    public class AppReleaseConfigDependOn : TeaModel {
        // 类型
        [NameInMap("kind")]
        [Validation(Required=true)]
        public string Kind { get; set; }

        // 名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

    }

}
