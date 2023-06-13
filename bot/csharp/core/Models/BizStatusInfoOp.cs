// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 业务状态信息
    public class BizStatusInfoOp : TeaModel {
        // 业务状态类型
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 业务状态
        [NameInMap("biz_status")]
        [Validation(Required=true)]
        public string BizStatus { get; set; }

        // 时间
        [NameInMap("op_time")]
        [Validation(Required=true)]
        public string OpTime { get; set; }

    }

}
