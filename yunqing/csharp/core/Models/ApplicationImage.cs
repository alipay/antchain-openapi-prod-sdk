// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 应用镜像
    public class ApplicationImage : TeaModel {
        // 架构:amd64，arm64
        [NameInMap("arch")]
        [Validation(Required=true)]
        public string Arch { get; set; }

        // 镜像名称
        [NameInMap("image")]
        [Validation(Required=true)]
        public string Image { get; set; }

    }

}
