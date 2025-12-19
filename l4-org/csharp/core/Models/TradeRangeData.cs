// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ORG.Models
{
    // 交易区间数据
    public class TradeRangeData : TeaModel {
        // 区间开始
        [NameInMap("start")]
        [Validation(Required=true)]
        public string Start { get; set; }

        // 区间结束
        [NameInMap("end")]
        [Validation(Required=true)]
        public string End { get; set; }

        // 区间内统计值
        [NameInMap("value")]
        [Validation(Required=true)]
        public long? Value { get; set; }

        // 百分比
        [NameInMap("rate")]
        [Validation(Required=true)]
        public string Rate { get; set; }

    }

}
