// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 批量查询输出模型分
    public class BatchQueryOutputModelInfo : TeaModel {
        // 变量名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 变量值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

        // 变量值类型
        [NameInMap("value_type")]
        [Validation(Required=true)]
        public string ValueType { get; set; }

    }

}
