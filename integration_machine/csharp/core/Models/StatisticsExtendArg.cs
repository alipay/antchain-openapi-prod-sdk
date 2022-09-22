// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTEGRATION_MACHINE.Models
{
    // 统计附加额外字段
    public class StatisticsExtendArg : TeaModel {
        // 字段key
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // 数量
        [NameInMap("number")]
        [Validation(Required=true)]
        public long? Number { get; set; }

    }

}
