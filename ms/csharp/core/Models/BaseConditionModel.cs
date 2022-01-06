// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 判断条件
    public class BaseConditionModel : TeaModel {
        // 匹配字段
        [NameInMap("field")]
        [Validation(Required=false)]
        public string Field { get; set; }

        // 操作符
        [NameInMap("operation")]
        [Validation(Required=false)]
        public string Operation { get; set; }

        // SYSTEM、CUSTOM系统字段还是自定义字段
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 匹配值
        [NameInMap("value")]
        [Validation(Required=false)]
        public List<string> Value { get; set; }

    }

}
