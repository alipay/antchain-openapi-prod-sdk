// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    public class StartOpenaiChatRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 参数内容为 ChatCompletionRequest 的 JSON 字符串
        [NameInMap("chat_completion_request")]
        [Validation(Required=true)]
        public string ChatCompletionRequest { get; set; }

    }

}
