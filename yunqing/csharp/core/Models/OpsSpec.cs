// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 运维配置
    public class OpsSpec : TeaModel {
        // 需要下线的pod列表
        [NameInMap("offline_pod")]
        [Validation(Required=false)]
        public List<string> OfflinePod { get; set; }

        // 发布灰度策略
        [NameInMap("gray_release")]
        [Validation(Required=false)]
        public GrayRelease GrayRelease { get; set; }

    }

}
