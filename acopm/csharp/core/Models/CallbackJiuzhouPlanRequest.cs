// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACOPM.Models
{
    public class CallbackJiuzhouPlanRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 请求标识
        [NameInMap("exec_id")]
        [Validation(Required=true)]
        public string ExecId { get; set; }

        // 回调数据
        [NameInMap("call_back_data")]
        [Validation(Required=true)]
        public string CallBackData { get; set; }

    }

}
