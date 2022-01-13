// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 销售抽用单独设置的授权品类和保底金信息
    public class IPCommissionSeparateSetInfo : TeaModel {
        // 授权品类
        [NameInMap("category")]
        [Validation(Required=false)]
        public string Category { get; set; }

        // 佣金比例
        [NameInMap("commission_weight")]
        [Validation(Required=false)]
        public string CommissionWeight { get; set; }

        // 保底商品销售金额
        [NameInMap("guarantee_sale_number")]
        [Validation(Required=false)]
        public string GuaranteeSaleNumber { get; set; }

    }

}
