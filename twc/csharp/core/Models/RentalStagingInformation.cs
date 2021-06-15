// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 租赁分期信息
    public class RentalStagingInformation : TeaModel {
        // 分期期数
        [NameInMap("installments_number")]
        [Validation(Required=true)]
        public long? InstallmentsNumber { get; set; }

        // 租金每期应还款时间
        [NameInMap("payment_time_each_cycle")]
        [Validation(Required=true)]
        public string PaymentTimeEachCycle { get; set; }

        // 租金每期应还款额
        [NameInMap("payment_each_cycle")]
        [Validation(Required=true)]
        public string PaymentEachCycle { get; set; }

    }

}
