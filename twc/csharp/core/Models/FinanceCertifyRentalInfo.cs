// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 融资租赁人脸认证提前还款租期记录
    public class FinanceCertifyRentalInfo : TeaModel {
        // 租期
        [NameInMap("rent_term")]
        [Validation(Required=true)]
        public long? RentTerm { get; set; }

        // 本期扣款金额，123400表示12.34元
        [NameInMap("rental_money")]
        [Validation(Required=true)]
        public long? RentalMoney { get; set; }

        // 还款日期，格式为"2019-07-31 12:00:00"
        [NameInMap("rental_return_time")]
        [Validation(Required=true)]
        public string RentalReturnTime { get; set; }

    }

}
