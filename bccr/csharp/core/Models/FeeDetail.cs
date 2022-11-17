// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 费用分项
    public class FeeDetail : TeaModel {
        // 费用描述
        [NameInMap("fee_desc")]
        [Validation(Required=true)]
        public string FeeDesc { get; set; }

        // 费用
        [NameInMap("amount")]
        [Validation(Required=true)]
        public string Amount { get; set; }

    }

}
