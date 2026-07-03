// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class PushRpaasReportAnswerRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // chat trace id
        [NameInMap("chat_trace_id")]
        [Validation(Required=true)]
        public string ChatTraceId { get; set; }

        // 响应结果
        [NameInMap("answer")]
        [Validation(Required=true)]
        public string Answer { get; set; }

    }

}
