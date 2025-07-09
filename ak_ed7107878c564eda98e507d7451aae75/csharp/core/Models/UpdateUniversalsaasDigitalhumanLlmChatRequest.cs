// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_ed7107878c564eda98e507d7451aae75.Models
{
    public class UpdateUniversalsaasDigitalhumanLlmChatRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户编码
        [NameInMap("tenant_code")]
        [Validation(Required=true)]
        public string TenantCode { get; set; }

        // 大模型对话配置编码
        [NameInMap("llm_chat_code")]
        [Validation(Required=true)]
        public string LlmChatCode { get; set; }

        // 大模型对话配置名称
        [NameInMap("llm_chat_name")]
        [Validation(Required=false)]
        public string LlmChatName { get; set; }

        // 模型配置id
        [NameInMap("model_id")]
        [Validation(Required=false)]
        public string ModelId { get; set; }

        // 大模型对话配置名称
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 大模型对话自定义配置明细
        [NameInMap("config")]
        [Validation(Required=false)]
        public string Config { get; set; }

    }

}
