// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_5bb1b66c4aab4cc998c05a36078e45c1.Models
{
    public class CheckAntchainBbpVerifyResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 核身结果枚举：PASS-核身成功，INITIAL-初始化，PROCESS-处理中，FAIL-失败
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
