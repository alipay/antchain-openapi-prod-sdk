// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 承诺详情
    public class BclCreatePromiseDetailInfo : TeaModel {
        // 承诺期数
        [NameInMap("period")]
        [Validation(Required=true)]
        public long? Period { get; set; }

        // 承诺金额 单位分
        [NameInMap("amount")]
        [Validation(Required=true)]
        public long? Amount { get; set; }

        // 每期应还的日期
        [NameInMap("promise_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string PromiseTime { get; set; }

    }

}
