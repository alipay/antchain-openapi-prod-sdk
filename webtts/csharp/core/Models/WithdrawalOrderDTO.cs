// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTTS.Models
{
    // WithdrawalOrderDTO
    public class WithdrawalOrderDTO : TeaModel {
        // orderId
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // orderDesc
        [NameInMap("order_desc")]
        [Validation(Required=true)]
        public string OrderDesc { get; set; }

        // orderType
        [NameInMap("order_type")]
        [Validation(Required=true)]
        public string OrderType { get; set; }

        // orderStatus:INIT PENDING_CONFIRMATION PENDING_DEPOSIT RUNNING SUCCESS FAILED EXPIRED_CLOSED REFUND REJECTED
        [NameInMap("order_status")]
        [Validation(Required=true)]
        public string OrderStatus { get; set; }

        // withdrawal Amount
        [NameInMap("withdrawal_amount")]
        [Validation(Required=true)]
        public string WithdrawalAmount { get; set; }

    }

}
