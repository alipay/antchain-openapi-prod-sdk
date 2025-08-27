// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 订单还款策略
    public class OrderRepayStrategy : TeaModel {
        // 还款期数
        [NameInMap("term_index")]
        [Validation(Required=false)]
        public long? TermIndex { get; set; }

        // 每期应还租金(分)
        [NameInMap("rental_money")]
        [Validation(Required=false)]
        public long? RentalMoney { get; set; }

        // 每期应付时间
        [NameInMap("pay_day")]
        [Validation(Required=false)]
        public string PayDay { get; set; }

        // 付款项目列表
        [NameInMap("payment_item_list")]
        [Validation(Required=false)]
        public List<PaymentItem> PaymentItemList { get; set; }

    }

}
