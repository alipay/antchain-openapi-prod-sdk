// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_63625f64df2048aca9ff5bea9e227854.Models
{
    public class CheckAntcloudAitechguardAicoguardrailsAskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 数据唯一标识，能够根据该值定位到该条数据
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 会话ID，用于匹配多轮对话上下文
        [NameInMap("session_id")]
        [Validation(Required=true)]
        public string SessionId { get; set; }

        // 应用名，蚂蚁侧提供
        [NameInMap("app_code")]
        [Validation(Required=true)]
        public string AppCode { get; set; }

        // 场景code，走SOP流程申请
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

        // 当前提问内容
        [NameInMap("question")]
        [Validation(Required=true)]
        public string Question { get; set; }

        // 当前提问格式，默认PLAINTEXT，详见3.2 questionFormat&answerFormat说明
        [NameInMap("question_format")]
        [Validation(Required=true)]
        public string QuestionFormat { get; set; }

        // 安全能力类型，0-知识库+天鉴兜底，1-纯知识库
        [NameInMap("type")]
        [Validation(Required=true)]
        public long? Type { get; set; }

        // 加密的uid，仅用于唯一标示调用方
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

    }

}
