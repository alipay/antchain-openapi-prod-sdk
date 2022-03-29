// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 时间点 - 告警统计信息 KeySet
    public class AlarmCountInfoKeySet : TeaModel {
        // 键值 (时间戳字符串)
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // 某一时刻对应的告警统计信息
        [NameInMap("value")]
        [Validation(Required=true)]
        public AlarmCountInfo Value { get; set; }

    }

}
