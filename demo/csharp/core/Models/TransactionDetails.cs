// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    // 交易明细信息
    public class TransactionDetails : TeaModel {
        // 金额
        [NameInMap("amount")]
        [Validation(Required=false)]
        public long? Amount { get; set; }

        // 币种
        [NameInMap("currency")]
        [Validation(Required=false)]
        public string Currency { get; set; }

        // 渠道
        [NameInMap("channel")]
        [Validation(Required=false)]
        public string Channel { get; set; }

        // 地址
        [NameInMap("location")]
        [Validation(Required=false)]
        public string Location { get; set; }

        // 时间
        [NameInMap("time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string Time { get; set; }

    }

}
