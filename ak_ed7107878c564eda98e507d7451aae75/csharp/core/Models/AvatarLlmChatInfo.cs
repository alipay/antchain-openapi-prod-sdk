// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_ed7107878c564eda98e507d7451aae75.Models
{
    // 数字人平台--大模型对话配置信息
    public class AvatarLlmChatInfo : TeaModel {
        // 大模型对话配置编码
        [NameInMap("llm_chat_code")]
        [Validation(Required=true)]
        public string LlmChatCode { get; set; }

        // 大模型对话配置名
        [NameInMap("llm_chat_name")]
        [Validation(Required=true)]
        public string LlmChatName { get; set; }

        // 描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 模型配置名
        [NameInMap("model_name")]
        [Validation(Required=true)]
        public string ModelName { get; set; }

        // 模型配置编码
        [NameInMap("model_code")]
        [Validation(Required=true)]
        public string ModelCode { get; set; }

        // 模型配置id
        [NameInMap("model_id")]
        [Validation(Required=true)]
        public string ModelId { get; set; }

        // 大模型对话自定义配置信息
        [NameInMap("config")]
        [Validation(Required=false)]
        public string Config { get; set; }

    }

}
