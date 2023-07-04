// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // AAP 应用亲和性配置
    public class AffinityConfig : TeaModel {
        // 尽量满足的应用列表
        [NameInMap("preferred")]
        [Validation(Required=false)]
        public List<string> Preferred { get; set; }

        // 必须满足的应用列表
        [NameInMap("required")]
        [Validation(Required=false)]
        public List<string> Required { get; set; }

    }

}
