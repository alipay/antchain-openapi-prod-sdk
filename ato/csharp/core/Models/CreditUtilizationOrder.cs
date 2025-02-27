// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 用信订单信息
    public class CreditUtilizationOrder : TeaModel {
        // 123
        [NameInMap("order_id")]
        [Validation(Required=true, MaxLength=50)]
        public string OrderId { get; set; }

        // 订单用信额度，单位为分
        [NameInMap("order_credit_line")]
        [Validation(Required=true)]
        public long? OrderCreditLine { get; set; }

        // 订单商户应还金额，单位为分
        [NameInMap("order_merchant_repayment_money")]
        [Validation(Required=true)]
        public long? OrderMerchantRepaymentMoney { get; set; }

    }

}
