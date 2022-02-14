// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 用户端承诺信息
    public class LeasePromiseInfo : TeaModel {
        // 租期index
        [NameInMap("term")]
        [Validation(Required=true)]
        public long? Term { get; set; }

        // 应还款金额
        [NameInMap("pay_money")]
        [Validation(Required=true)]
        public long? PayMoney { get; set; }

        // 应还款时间
        [NameInMap("pay_date")]
        [Validation(Required=true)]
        public string PayDate { get; set; }

    }

}
