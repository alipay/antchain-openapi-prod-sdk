// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 租期信息
    public class RentBillItem : TeaModel {
        // 租约分期ID
        [NameInMap("bill_item_id")]
        [Validation(Required=true)]
        public string BillItemId { get; set; }

        // 租约分期名称
        [NameInMap("bill_item_name")]
        [Validation(Required=false)]
        public string BillItemName { get; set; }

        // 租期开始日期
        [NameInMap("bill_item_begin")]
        [Validation(Required=true)]
        public string BillItemBegin { get; set; }

        // 租期结束日期 
        [NameInMap("bill_item_end")]
        [Validation(Required=true)]
        public string BillItemEnd { get; set; }

        // 租约金额
        [NameInMap("bill_item_money")]
        [Validation(Required=true)]
        public string BillItemMoney { get; set; }

        // 租约支付状态
        [NameInMap("payment_state")]
        [Validation(Required=false)]
        public string PaymentState { get; set; }

    }

}
