// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 商户还款策略
    public class MerchantOrderRepayStrategy : TeaModel {
        // 分账期数(关联商户履约)
        [NameInMap("term_index")]
        [Validation(Required=false)]
        public long? TermIndex { get; set; }

        // 还款期数(关联用户还款承诺)
        [NameInMap("lease_term_index")]
        [Validation(Required=false)]
        public long? LeaseTermIndex { get; set; }

        // 分账金额
        [NameInMap("pay_money")]
        [Validation(Required=false)]
        public long? PayMoney { get; set; }

        // 转代偿时间，yyyy-MM-dd
        [NameInMap("to_compensate_date")]
        [Validation(Required=false)]
        public string ToCompensateDate { get; set; }

    }

}
