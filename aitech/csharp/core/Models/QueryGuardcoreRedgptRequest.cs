// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    public class QueryGuardcoreRedgptRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 唯一请求ID
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 多轮对话会话ID
        [NameInMap("session_id")]
        [Validation(Required=true)]
        public string SessionId { get; set; }

        // 场景code
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

        // 调用方AppCode
        [NameInMap("app_code")]
        [Validation(Required=true)]
        public string AppCode { get; set; }

        // 提问内容
        [NameInMap("question")]
        [Validation(Required=true)]
        public string Question { get; set; }

        // 提问内容格式,当前仅支持PLAINTEXT
        [NameInMap("question_format")]
        [Validation(Required=true)]
        public string QuestionFormat { get; set; }

        // 加密的调用方业务UserId
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 是否流式输出
        [NameInMap("stream")]
        [Validation(Required=true)]
        public bool? Stream { get; set; }

    }

}
