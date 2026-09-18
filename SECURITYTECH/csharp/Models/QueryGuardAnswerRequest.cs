// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class QueryGuardAnswerRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 会话ID，用于匹配多轮对话上下文
        [NameInMap("session_id")]
        [Validation(Required=true, MaxLength=128)]
        public string SessionId { get; set; }

        // 数据唯一标识，能够根据该值定位到该条数据
        [NameInMap("request_id")]
        [Validation(Required=true, MaxLength=64)]
        public string RequestId { get; set; }

        // service_code
        [NameInMap("service_code")]
        [Validation(Required=true, MaxLength=128)]
        public string ServiceCode { get; set; }

        // 作为一个人工智能语言模型，我还没有学习到相关信息，不过我觉得梦里啥都有，建议您保持充分的睡眠。
        [NameInMap("answer")]
        [Validation(Required=true, MaxLength=10000)]
        public string Answer { get; set; }

        // 作为一个解梦者，你的任务是解释以下梦境:[上证30000点，没错，是三万不是三千]。根据梦中出现的符号和主题，请提供一份客观且基于事实的解释。
        [NameInMap("question")]
        [Validation(Required=false, MaxLength=800)]
        public string Question { get; set; }

        // 纯文本: PLAINTEXT，图片url: PICTURE_URL
        [NameInMap("question_format")]
        [Validation(Required=false, MaxLength=32)]
        public string QuestionFormat { get; set; }

        // 纯文本: PLAINTEXT
        // 图片url: PICTURE_URL
        [NameInMap("answer_format")]
        [Validation(Required=false, MaxLength=32)]
        public string AnswerFormat { get; set; }

        // scene_code
        [NameInMap("scene_code")]
        [Validation(Required=false, MaxLength=128)]
        public string SceneCode { get; set; }

        // app_code
        [NameInMap("app_code")]
        [Validation(Required=false)]
        public string AppCode { get; set; }

        // raas_products
        [NameInMap("raas_products")]
        [Validation(Required=false)]
        public string RaasProducts { get; set; }

    }

}
