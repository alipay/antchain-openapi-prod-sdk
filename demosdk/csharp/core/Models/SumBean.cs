// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMOSDK.Models
{
    // 测试实体
    public class SumBean : TeaModel {
        // 元素名称
        [NameInMap("e_name")]
        [Validation(Required=false)]
        public string EName { get; set; }

        // 数量
        [NameInMap("num")]
        [Validation(Required=false)]
        public long? Num { get; set; }

    }

}
