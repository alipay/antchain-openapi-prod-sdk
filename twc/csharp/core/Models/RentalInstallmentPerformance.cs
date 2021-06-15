// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 租赁分期履约信息
    public class RentalInstallmentPerformance : TeaModel {
        // 被申请人还款期数
        [NameInMap("repayment_period")]
        [Validation(Required=true)]
        public long? RepaymentPeriod { get; set; }

        // 被申请人第几期租金支付方式
        [NameInMap("rent_payment_type")]
        [Validation(Required=true)]
        public string RentPaymentType { get; set; }

        // 被申请人第几期还款时间
        [NameInMap("applied_repayment_time")]
        [Validation(Required=true)]
        public string AppliedRepaymentTime { get; set; }

        // 被申请人第几期还款金额
        [NameInMap("applied_repayment_amount")]
        [Validation(Required=true)]
        public string AppliedRepaymentAmount { get; set; }

    }

}
