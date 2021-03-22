// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 统计数据
    public class CounterData : TeaModel {
        // 成交总额
        [NameInMap("gmv")]
        [Validation(Required=true)]
        public string Gmv { get; set; }

        // 公认标准收入
        [NameInMap("gaap")]
        [Validation(Required=true)]
        public string Gaap { get; set; }

        // 笔数
        [NameInMap("counter")]
        [Validation(Required=true)]
        public string Counter { get; set; }

    }

}
