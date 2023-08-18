// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 承诺详情
    public class BclCreatePromiseDetailInfo : TeaModel {
        // 承诺期数，最小值：1
        [NameInMap("period")]
        [Validation(Required=true)]
        public long? Period { get; set; }

        // 承诺金额，单位：分
        // 最小值：1，正整数
        [NameInMap("amount")]
        [Validation(Required=true)]
        public long? Amount { get; set; }

        // 每期应还的日期
        // 示例：格式 2023-06-27T10:50:23+08:00
        [NameInMap("promise_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string PromiseTime { get; set; }

    }

}
