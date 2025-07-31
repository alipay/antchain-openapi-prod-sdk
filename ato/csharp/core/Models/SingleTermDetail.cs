// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
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
