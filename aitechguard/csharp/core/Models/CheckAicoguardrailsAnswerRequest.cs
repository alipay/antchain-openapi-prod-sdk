// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECHGUARD.Models
{
    public class CheckAicoguardrailsAnswerRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 会话ID，用于匹配多轮对话上下文
        [NameInMap("session_id")]
        [Validation(Required=true)]
        public string SessionId { get; set; }

        // 数据唯一标识，能够根据该值定位到该条数据
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 应用名，蚂蚁侧提供
        [NameInMap("app_code")]
        [Validation(Required=true)]
        public string AppCode { get; set; }

        // 场景code，走SOP流程申请
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

        // 当前提问内容，最大长度800个字符。
        [NameInMap("question")]
        [Validation(Required=true)]
        public string Question { get; set; }

        // 当前提问内容格式, 默认值:PLAINTEXT
        [NameInMap("question_format")]
        [Validation(Required=false)]
        public string QuestionFormat { get; set; }

        // 当前回答内容，最大长度800个字符。
        [NameInMap("answer")]
        [Validation(Required=true)]
        public string Answer { get; set; }

        // 当前回答内容格式, 默认取PLAINTEXT
        [NameInMap("answer_format")]
        [Validation(Required=false)]
        public string AnswerFormat { get; set; }

        // 用户ID，用于主体风险判断
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

    }

}
