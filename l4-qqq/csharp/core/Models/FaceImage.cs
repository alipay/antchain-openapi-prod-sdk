// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMOSDK.Models
{
    // 模拟大安全类型
    public class FaceImage : TeaModel {
        // 1123
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // 123
        [NameInMap("rect")]
        [Validation(Required=true)]
        public string Rect { get; set; }

    }

}
