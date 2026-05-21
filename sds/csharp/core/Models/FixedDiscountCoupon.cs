// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SDS.Models
{
    // 【固定折扣特定信息】 
    public class FixedDiscountCoupon : TeaModel {
        // 【最高折扣金额】 最高折扣金额，单位分
        [NameInMap("discount_amount_max")]
        [Validation(Required=true)]
        public long? DiscountAmountMax { get; set; }

        // 【折扣百分比】 折扣百分比，例如88-八八折
        [NameInMap("discount_percent")]
        [Validation(Required=true)]
        public long? DiscountPercent { get; set; }

        // 【门槛】 使用券金额门槛，单位分
        [NameInMap("transaction_minimum")]
        [Validation(Required=false)]
        public long? TransactionMinimum { get; set; }

    }

}
