// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 站点信息
    public class SiteInfo : TeaModel {
        // 站点名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 站点code
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

    }

}
