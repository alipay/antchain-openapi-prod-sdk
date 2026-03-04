// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    // 卡片信息
    public class CardInfos : TeaModel {
        // x
        [NameInMap("domian_info")]
        [Validation(Required=true)]
        public Identity DomianInfo { get; set; }

        // 12
        [NameInMap("test")]
        [Validation(Required=true)]
        public string Test { get; set; }

    }

}
