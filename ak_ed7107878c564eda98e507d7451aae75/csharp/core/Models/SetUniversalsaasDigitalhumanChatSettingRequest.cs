// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_ed7107878c564eda98e507d7451aae75.Models
{
    public class SetUniversalsaasDigitalhumanChatSettingRequest : TeaModel {
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

        // 交互配置ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 交互配置名
        [NameInMap("title")]
        [Validation(Required=false)]
        public string Title { get; set; }

        // 背景图片url
        [NameInMap("bg_img")]
        [Validation(Required=false)]
        public string BgImg { get; set; }

        // logo图片url
        [NameInMap("logo_img")]
        [Validation(Required=false)]
        public string LogoImg { get; set; }

        // 气泡配置
        [NameInMap("bubble_config")]
        [Validation(Required=false)]
        public List<AvatarBubbleInfo> BubbleConfig { get; set; }

        // 自定义组件配置
        [NameInMap("component_config")]
        [Validation(Required=false)]
        public List<AvatarComponentInfo> ComponentConfig { get; set; }

        // 关联大模型对话配置编码
        [NameInMap("llm_code")]
        [Validation(Required=false)]
        public string LlmCode { get; set; }

        // 关联知识库列表
        [NameInMap("library_ids")]
        [Validation(Required=false)]
        public List<long?> LibraryIds { get; set; }

        // 话术配置
        [NameInMap("script_config")]
        [Validation(Required=false)]
        public AvatarScriptConfigInfo ScriptConfig { get; set; }

    }

}
