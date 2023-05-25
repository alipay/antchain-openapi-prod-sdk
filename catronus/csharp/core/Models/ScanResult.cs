// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    // 扫描结果
    public class ScanResult : TeaModel {
        // 安全组件名
        [NameInMap("component")]
        [Validation(Required=true)]
        public string Component { get; set; }

        // 结果
        [NameInMap("result")]
        [Validation(Required=true)]
        public string Result { get; set; }

    }

}
