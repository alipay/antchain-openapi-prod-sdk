// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 手续费分级
    public class CommissionLayer : TeaModel {
        // 阶梯起始值，无结束值
        [NameInMap("start_num")]
        [Validation(Required=true)]
        public string StartNum { get; set; }

        // 手续费费率
        [NameInMap("deduct_ratio")]
        [Validation(Required=true)]
        public string DeductRatio { get; set; }

        // 固定的商品费率值
        [NameInMap("deduct_token")]
        [Validation(Required=true)]
        public string DeductToken { get; set; }

    }

}
