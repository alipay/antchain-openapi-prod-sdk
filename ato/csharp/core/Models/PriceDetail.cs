// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 智租风控-商品价格
    public class PriceDetail : TeaModel {
        // 商品租赁期数
        [NameInMap("period_num")]
        [Validation(Required=true)]
        public long? PeriodNum { get; set; }

        // 押金，单位：元。精度：分。
        [NameInMap("deposit_price")]
        [Validation(Required=true, MaxLength=10)]
        public string DepositPrice { get; set; }

        // 买断价格，单位：元，精度：分
        [NameInMap("buyout_price")]
        [Validation(Required=true, MaxLength=10)]
        public string BuyoutPrice { get; set; }

        // 首期租金，单位：元，精度：分
        [NameInMap("initial_rent_price")]
        [Validation(Required=true, MaxLength=10)]
        public string InitialRentPrice { get; set; }

    }

}
