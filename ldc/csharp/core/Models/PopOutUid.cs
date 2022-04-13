// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 弹出 UID
    public class PopOutUid : TeaModel {
        // 弹出的 UID 值
        [NameInMap("value")]
        [Validation(Required=true)]
        public long? Value { get; set; }

        // 弹出的目标部署单元
        [NameInMap("cell")]
        [Validation(Required=true)]
        public string Cell { get; set; }

    }

}
