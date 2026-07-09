// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class SyncRentRentpaymentRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租金缴纳账单ID
        [NameInMap("lease_bill_id")]
        [Validation(Required=true)]
        public string LeaseBillId { get; set; }

        // 租约分期ID
        [NameInMap("bill_item_id")]
        [Validation(Required=true)]
        public string BillItemId { get; set; }

        // 租约支付状态
        [NameInMap("payment_state")]
        [Validation(Required=true)]
        public string PaymentState { get; set; }

        // 支付操作日期，已支付或支付失败需要有值
        [NameInMap("payment_date")]
        [Validation(Required=false)]
        public string PaymentDate { get; set; }

    }

}
