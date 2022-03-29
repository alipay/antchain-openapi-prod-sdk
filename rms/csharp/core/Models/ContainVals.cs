// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 计算配置包含值对象
    public class ContainVals : TeaModel {
        // 包含值列表
        [NameInMap("vals")]
        [Validation(Required=false)]
        public List<string> Vals { get; set; }

    }

}
