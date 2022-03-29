// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 四元组，包括 key，value, display，visible
    public class UIKeyVauleTemplate : TeaModel {
        // 中文，描述这个UI元素的key
        [NameInMap("display")]
        [Validation(Required=true)]
        public string Display { get; set; }

        // 对应ui元素的key
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // 对应UI元素的值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

        // 该配置是否对 用户 可见。
        [NameInMap("visible")]
        [Validation(Required=true)]
        public bool? Visible { get; set; }

    }

}
