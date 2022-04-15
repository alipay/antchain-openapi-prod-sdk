// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUQING.Models
{
    // 钉钉FeedCard
    public class FeedCard : TeaModel {
        // 卡片流
        [NameInMap("links")]
        [Validation(Required=false)]
        public List<Link> Links { get; set; }

    }

}
