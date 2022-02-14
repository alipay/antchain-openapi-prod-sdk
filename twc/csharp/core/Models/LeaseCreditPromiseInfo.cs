// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 融资租赁资方承诺
    public class LeaseCreditPromiseInfo : TeaModel {
        // 租期index
        [NameInMap("term")]
        [Validation(Required=true)]
        public long? Term { get; set; }

        // 应还金额
        [NameInMap("pay_money")]
        [Validation(Required=true)]
        public long? PayMoney { get; set; }

        // 应还款时间
        [NameInMap("pay_date")]
        [Validation(Required=true)]
        public string PayDate { get; set; }

        // 垫付日
        [NameInMap("pay_in_advance_time")]
        [Validation(Required=true)]
        public string PayInAdvanceTime { get; set; }

        // 垫付金额
        [NameInMap("pay_in_advance_money")]
        [Validation(Required=true)]
        public long? PayInAdvanceMoney { get; set; }

    }

}
