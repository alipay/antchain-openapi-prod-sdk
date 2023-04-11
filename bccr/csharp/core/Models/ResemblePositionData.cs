// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 相似位置信息
    public class ResemblePositionData : TeaModel {
        // 起始位置
        [NameInMap("start_position")]
        [Validation(Required=true)]
        public long? StartPosition { get; set; }

        // 结束位置
        [NameInMap("end_position")]
        [Validation(Required=true)]
        public long? EndPosition { get; set; }

    }

}
