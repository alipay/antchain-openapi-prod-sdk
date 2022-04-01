// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PCC.Models
{
    // 客户价价值法信息
    public class CustomerValueDetail : TeaModel {
        // 名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 友商价格
        [NameInMap("profit")]
        [Validation(Required=false)]
        public string Profit { get; set; }

        // 蚂蚁收益
        [NameInMap("ant_divide")]
        [Validation(Required=false)]
        public string AntDivide { get; set; }

        // BD权限价预估
        [NameInMap("bd_price_predict")]
        [Validation(Required=false)]
        public string BdPricePredict { get; set; }

    }

}
