// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 发布版本信息
    public class ReleaseVersion : TeaModel {
        // 镜像
        [NameInMap("image")]
        [Validation(Required=true)]
        public string Image { get; set; }

    }

}
