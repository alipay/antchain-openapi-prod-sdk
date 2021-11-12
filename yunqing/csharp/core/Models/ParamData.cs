// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 参数对象
    public class ParamData : TeaModel {
        // 参数key
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // 参数值
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

        // 类型, 对应Data的paramGroup
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 安全级别，脱敏用
        [NameInMap("security_level")]
        [Validation(Required=false)]
        public string SecurityLevel { get; set; }

    }

}
