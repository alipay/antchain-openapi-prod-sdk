// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PCC.Models
{
    // 返回高精度12位价格,其他精度可使用工具类处理
    public class InquiryPriceResponse : TeaModel {
        // 高精度12位价格
        [NameInMap("price")]
        [Validation(Required=false)]
        public string Price { get; set; }

        // 币种
        [NameInMap("currency")]
        [Validation(Required=false)]
        public string Currency { get; set; }

        // BD销售价格(高精度12位)
        [NameInMap("bd_price")]
        [Validation(Required=false)]
        public string BdPrice { get; set; }

        // 最低成本价(高精度12位)
        [NameInMap("cost_price")]
        [Validation(Required=false)]
        public string CostPrice { get; set; }

        // 收费项结果明细列表
        [NameInMap("price_object_fee_list")]
        [Validation(Required=false)]
        public List<PriceObjectFee> PriceObjectFeeList { get; set; }

    }

}
