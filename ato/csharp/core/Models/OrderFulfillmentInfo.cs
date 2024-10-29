// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 订单履约
    public class OrderFulfillmentInfo : TeaModel {
        // 租期编号
        [NameInMap("lease_term_index")]
        [Validation(Required=false)]
        public long? LeaseTermIndex { get; set; }

        // 租期归还状态
        [NameInMap("rental_return_state")]
        [Validation(Required=false)]
        public string RentalReturnState { get; set; }

        // 实际还款金额(分)
        [NameInMap("real_repay_money")]
        [Validation(Required=false)]
        public long? RealRepayMoney { get; set; }

        // 租金(分)
        [NameInMap("rental_money")]
        [Validation(Required=false)]
        public long? RentalMoney { get; set; }

        // 每期实付时间
        [NameInMap("return_time")]
        [Validation(Required=false)]
        public string ReturnTime { get; set; }

    }

}
