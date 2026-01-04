// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    // Agent详情 --> 隶属multi-agent的sub agents --> 坐标信息
    public class DraftPosition : TeaModel {
        // x 浮点类型
        [NameInMap("x")]
        [Validation(Required=true)]
        public string X { get; set; }

        // y 浮点类型
        [NameInMap("y")]
        [Validation(Required=true)]
        public string Y { get; set; }

    }

}
