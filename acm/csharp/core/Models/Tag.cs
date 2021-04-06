// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Acm.Models
{
    // 标签实体
    public class Tag : TeaModel {
        // 标签类型
        [NameInMap("tag_type")]
        [Validation(Required=true)]
        public string TagType { get; set; }

        // 标签值
        [NameInMap("tag_value")]
        [Validation(Required=true)]
        public string TagValue { get; set; }

    }

}
