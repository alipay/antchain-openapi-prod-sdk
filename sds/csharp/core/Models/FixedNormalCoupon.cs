// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SDS.Models
{
    // 【固定面额批次特定信息】 固定面额发券或消费金批次特定信息。
    public class FixedNormalCoupon : TeaModel {
        // 【面额】 面额，单位：分。
        [NameInMap("coupon_amount")]
        [Validation(Required=true)]
        public long? CouponAmount { get; set; }

        // 【门槛】 使用券金额门槛，单位：分。
        [NameInMap("transaction_minimum")]
        [Validation(Required=true)]
        public long? TransactionMinimum { get; set; }

    }

}
