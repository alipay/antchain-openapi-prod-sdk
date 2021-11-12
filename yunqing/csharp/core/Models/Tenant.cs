// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 租户
    public class Tenant : TeaModel {
        // 租户名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 租户id
        [NameInMap("tanent_id")]
        [Validation(Required=false)]
        public string TanentId { get; set; }

    }

}
