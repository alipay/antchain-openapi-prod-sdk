// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 延迟信息
    public class DelayInfo : TeaModel {
        // 延迟时间
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

        // 值类型
        [NameInMap("value_type")]
        [Validation(Required=true)]
        public string ValueType { get; set; }

    }

}
