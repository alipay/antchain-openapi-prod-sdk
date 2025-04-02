// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 删除参数
    public class OutParams : TeaModel {
        // 输出参数
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 参数描述
        [NameInMap("desc")]
        [Validation(Required=true)]
        public string Desc { get; set; }

        // 参数值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
