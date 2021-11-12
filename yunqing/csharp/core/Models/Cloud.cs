// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 云
    public class Cloud : TeaModel {
        // 云的ID
        [NameInMap("cloud_id")]
        [Validation(Required=true)]
        public string CloudId { get; set; }

        // 云的名字
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

    }

}
