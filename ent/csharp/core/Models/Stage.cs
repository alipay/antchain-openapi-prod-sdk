// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENT.Models
{
    // 发放区间信息
    public class Stage : TeaModel {
        // 票数区间上限
        [NameInMap("upper_limit")]
        [Validation(Required=true)]
        public long? UpperLimit { get; set; }

        // 票数区间下限
        [NameInMap("lower_limit")]
        [Validation(Required=true)]
        public long? LowerLimit { get; set; }

        // 当前区间粉丝粒数量，单位分个
        [NameInMap("token_amount")]
        [Validation(Required=true)]
        public long? TokenAmount { get; set; }

        // 当前区间粉丝粒价格，单位分
        [NameInMap("token_price")]
        [Validation(Required=true)]
        public long? TokenPrice { get; set; }

    }

}
