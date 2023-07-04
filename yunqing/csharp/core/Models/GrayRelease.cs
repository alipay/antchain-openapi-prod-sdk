// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 灰度发布策略
    public class GrayRelease : TeaModel {
        // 需要更新到的副本数，比如：应用A有10个副本，本次更新updated_replicas=5，则会更新前5个
        [NameInMap("updated_replicas")]
        [Validation(Required=false)]
        public long? UpdatedReplicas { get; set; }

        //     发布策略：TWO_GROUP("TWO_GROUP", "分两组"),
        //     ALL_ONE("ALL_ONE", "共分一组"),
        //     EACH_ONE("EACH_ONE", "每台一组"),
        //     SYSTEM_RECOMMENDATION("SYSTEM_RECOMMENDATION", "系统推荐"),
        //     CUSTOMIZE("CUSTOMIZE", "自定义分组")
        [NameInMap("release_strategy")]
        [Validation(Required=true)]
        public string ReleaseStrategy { get; set; }

    }

}
