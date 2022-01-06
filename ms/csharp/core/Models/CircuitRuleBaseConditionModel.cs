// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 熔断生效模型
    public class CircuitRuleBaseConditionModel : TeaModel {
        // 生效域
        [NameInMap("field")]
        [Validation(Required=true)]
        public string Field { get; set; }

        // 生效条件
        [NameInMap("operation")]
        [Validation(Required=true)]
        public string Operation { get; set; }

        // 类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 值
        [NameInMap("value")]
        [Validation(Required=true)]
        public List<string> Value { get; set; }

    }

}
