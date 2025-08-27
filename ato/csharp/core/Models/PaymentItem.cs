// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 付款项目
    public class PaymentItem : TeaModel {
        // 付款金额，单位分
        [NameInMap("amount")]
        [Validation(Required=false)]
        public long? Amount { get; set; }

        // 付款项目类型
        [NameInMap("payment_type")]
        [Validation(Required=false)]
        public string PaymentType { get; set; }

    }

}
