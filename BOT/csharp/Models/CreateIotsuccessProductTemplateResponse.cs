// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class CreateIotsuccessProductTemplateResponse : TeaModel {
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

        [NameInMap("language")]
        [Validation(Required=true)]
        public string Language { get; set; }

        [NameInMap("voice_id")]
        [Validation(Required=true)]
        public string VoiceId { get; set; }

        [NameInMap("role_prompt")]
        [Validation(Required=true)]
        public string RolePrompt { get; set; }

        [NameInMap("model_id")]
        [Validation(Required=true)]
        public string ModelId { get; set; }

        [NameInMap("voice_parameters")]
        [Validation(Required=true)]
        public OpenApiVoiceParameters VoiceParameters { get; set; }

        [NameInMap("template_id")]
        [Validation(Required=true)]
        public string TemplateId { get; set; }

        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        [NameInMap("default_template")]
        [Validation(Required=true)]
        public bool? DefaultTemplate { get; set; }

        [NameInMap("base_template_id")]
        [Validation(Required=false)]
        public string BaseTemplateId { get; set; }

    }

}
