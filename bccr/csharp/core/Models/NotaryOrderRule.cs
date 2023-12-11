// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 公证申请出证规则
    public class NotaryOrderRule : TeaModel {
        // 公证出证支持公证书类型
        [NameInMap("order_type")]
        [Validation(Required=false)]
        public string OrderType { get; set; }

    }

}
