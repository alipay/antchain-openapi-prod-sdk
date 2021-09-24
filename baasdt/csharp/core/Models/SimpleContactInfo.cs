// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 联系人信息
    public class SimpleContactInfo : TeaModel {
        // 联系人名称
        [NameInMap("contact_name")]
        [Validation(Required=true)]
        public string ContactName { get; set; }

        // 联系电话
        [NameInMap("contact_phone")]
        [Validation(Required=true)]
        public string ContactPhone { get; set; }

    }

}
