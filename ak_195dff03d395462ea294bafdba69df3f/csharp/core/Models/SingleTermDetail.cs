// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_195dff03d395462ea294bafdba69df3f.Models
{
    // 单期明细
    public class SingleTermDetail : TeaModel {
        // 期数
        [NameInMap("period_num")]
        [Validation(Required=true)]
        public long? PeriodNum { get; set; }

        // 支付金额
        [NameInMap("pay_amount")]
        [Validation(Required=true)]
        public long? PayAmount { get; set; }

    }

}
