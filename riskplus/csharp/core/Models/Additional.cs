// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 补充信息
    public class Additional : TeaModel {
        // 骑手标识；1-骑手
        [NameInMap("deliveryman")]
        [Validation(Required=false)]
        public string Deliveryman { get; set; }

        // 关键词
        [NameInMap("key_word")]
        [Validation(Required=false)]
        public string KeyWord { get; set; }

    }

}
