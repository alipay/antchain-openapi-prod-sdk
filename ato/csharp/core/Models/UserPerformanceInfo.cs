// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 用户履约信息
    public class UserPerformanceInfo : TeaModel {
        // 履约期数
        [NameInMap("period_num")]
        [Validation(Required=true)]
        public long? PeriodNum { get; set; }

        // 履约时间，格式 yyyy-MM-dd
        // 针对签收日作为起租日模式,未签收时：以签收日开始计算
        [NameInMap("pay_date")]
        [Validation(Required=true)]
        public string PayDate { get; set; }

        // 履约金额，单位为分
        [NameInMap("pay_money")]
        [Validation(Required=true)]
        public long? PayMoney { get; set; }

    }

}
