// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class CreateIotsuccessProductTemplateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        [NameInMap("product_key")]
        [Validation(Required=true)]
        public string ProductKey { get; set; }

        // 支持的BCP47语言值，目录为准
        [NameInMap("language")]
        [Validation(Required=false)]
        public string Language { get; set; }

        [NameInMap("voice_id")]
        [Validation(Required=false)]
        public string VoiceId { get; set; }

        [NameInMap("role_prompt")]
        [Validation(Required=false)]
        public string RolePrompt { get; set; }

        [NameInMap("model_id")]
        [Validation(Required=false)]
        public string ModelId { get; set; }

        [NameInMap("voice_parameters")]
        [Validation(Required=false)]
        public OpenApiVoiceParameters VoiceParameters { get; set; }

        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        [NameInMap("base_template_id")]
        [Validation(Required=false)]
        public string BaseTemplateId { get; set; }

    }

}
