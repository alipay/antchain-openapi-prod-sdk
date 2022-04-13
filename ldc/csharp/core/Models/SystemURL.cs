// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 系统url
    public class SystemURL : TeaModel {
        // 平台名称
        [NameInMap("platform_name")]
        [Validation(Required=true)]
        public string PlatformName { get; set; }

        // url
        [NameInMap("url")]
        [Validation(Required=true)]
        public string Url { get; set; }

        // 上线问配置
        [NameInMap("context")]
        [Validation(Required=false)]
        public string Context { get; set; }

    }

}
