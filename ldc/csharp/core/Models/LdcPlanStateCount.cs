// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 发布(运维)单状态汇总数据
    public class LdcPlanStateCount : TeaModel {
        // 发布单状态类型
        [NameInMap("state")]
        [Validation(Required=true)]
        public string State { get; set; }

        // 数量
        [NameInMap("count")]
        [Validation(Required=true)]
        public long? Count { get; set; }

    }

}
