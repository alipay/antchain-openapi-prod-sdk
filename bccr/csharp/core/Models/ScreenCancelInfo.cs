// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 放弃取证信息
    public class ScreenCancelInfo : TeaModel {
        // 允许放弃时长（分钟）
        [NameInMap("cancel_in_min")]
        [Validation(Required=true)]
        public long? CancelInMin { get; set; }

        // 可用放弃次数
        [NameInMap("cancel_attempt_left")]
        [Validation(Required=true)]
        public long? CancelAttemptLeft { get; set; }

    }

}
