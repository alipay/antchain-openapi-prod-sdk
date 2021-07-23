// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 自动进件履约信息
    public class LeasePerformanceInfo : TeaModel {
        // 支付租金总额
        [NameInMap("rent_pay_total")]
        [Validation(Required=true)]
        public string RentPayTotal { get; set; }

        // 买断金额
        [NameInMap("buyout_amount")]
        [Validation(Required=false)]
        public string BuyoutAmount { get; set; }

        // 租赁分期履约信息
        [NameInMap("rental_installment_performance")]
        [Validation(Required=true)]
        public List<RentalInstallmentPerformance> RentalInstallmentPerformance { get; set; }

    }

}
