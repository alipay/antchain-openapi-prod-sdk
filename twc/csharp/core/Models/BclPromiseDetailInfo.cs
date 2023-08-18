// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 承诺详情
    public class BclPromiseDetailInfo : TeaModel {
        // 承诺期数
        [NameInMap("period")]
        [Validation(Required=true)]
        public long? Period { get; set; }

        // 承诺金额 单位分
        [NameInMap("amount")]
        [Validation(Required=true)]
        public long? Amount { get; set; }

        // 本期还款状态
        // 1.已还款：PAID 
        // 2.部分还款：PART_PAID 
        // 3.未还款：UN_PAID
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 每期约定还款时间
        // 示例：2023-06-7T10:50:23+08:00
        [NameInMap("promise_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string PromiseTime { get; set; }

        // 每期应还日期
        // 示例：2023-06-27T10:50:23+08:00
        [NameInMap("pay_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string PayTime { get; set; }

        // 归还方式
        // 1.租赁代扣： PROXY_WITHHOLDING
        // 2.主动还款：ACTIVE_REPAYMENT  
        // 3.网商委托代扣：MY_BANK_DIRECT_PAYMENT
        // 4.预授权代扣：PRE_AUTHORIZATION_WITHHOLDING
        [NameInMap("way")]
        [Validation(Required=true, MaxLength=32)]
        public string Way { get; set; }

    }

}
