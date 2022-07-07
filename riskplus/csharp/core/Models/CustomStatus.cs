// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 授信状态
    public class CustomStatus : TeaModel {
        // 是否进行过授信申请
        [NameInMap("apply_flag")]
        [Validation(Required=false)]
        public bool? ApplyFlag { get; set; }

        // 0:通过； 1:拒绝； 2:处理中；
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 拒绝原因
        [NameInMap("msg")]
        [Validation(Required=false)]
        public string Msg { get; set; }

    }

}
