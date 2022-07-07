// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 用户借款是否结清
    public class CustomReceiptStatus : TeaModel {
        // 是否结清
        [NameInMap("receipt_flag")]
        [Validation(Required=false)]
        public bool? ReceiptFlag { get; set; }

    }

}
