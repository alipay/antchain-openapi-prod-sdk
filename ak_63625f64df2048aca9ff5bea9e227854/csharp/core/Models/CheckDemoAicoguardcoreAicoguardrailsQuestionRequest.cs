// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_63625f64df2048aca9ff5bea9e227854.Models
{
    public class CheckDemoAicoguardcoreAicoguardrailsQuestionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 当前提问内容
        [NameInMap("question")]
        [Validation(Required=true)]
        public string Question { get; set; }

        // 当前提问格式
        [NameInMap("question_format")]
        [Validation(Required=false)]
        public string QuestionFormat { get; set; }

        // 应用名
        [NameInMap("app_code")]
        [Validation(Required=true)]
        public string AppCode { get; set; }

        // 会话ID
        [NameInMap("session_id")]
        [Validation(Required=true)]
        public string SessionId { get; set; }

        // 唯一定位一个问答对
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 场景code，走SOP流程申请
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

        // 当前固定填入：TJ_QUESTION_BASIC
        [NameInMap("service_code")]
        [Validation(Required=true)]
        public string ServiceCode { get; set; }

        // Agent标识
        [NameInMap("agent_code")]
        [Validation(Required=true)]
        public string AgentCode { get; set; }

        // 大模型Code，区分大模型类型和版本，比如bailing_10b_0229、bailing_65b_0315
        [NameInMap("model_code")]
        [Validation(Required=false)]
        public string ModelCode { get; set; }

        // 用户ID，用于主体风险判断
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 扩展信息，会透传到业务属性中
        [NameInMap("business_properties")]
        [Validation(Required=false)]
        public Map BusinessProperties { get; set; }

    }

}
