// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 融资租赁订单额外信息
    public class LeaseOrderExtra : TeaModel {
        // 额外信息的主键
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // 额外信息的值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
