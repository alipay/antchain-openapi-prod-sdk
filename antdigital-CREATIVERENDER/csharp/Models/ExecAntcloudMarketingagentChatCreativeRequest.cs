// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVERENDER.Models
{
    public class ExecAntcloudMarketingagentChatCreativeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 会话ID，如需支持多轮对话，需要传入之前的会话ID
        [NameInMap("session_id")]
        [Validation(Required=false)]
        public string SessionId { get; set; }

        // 服务类型（默认IMAGE_RENDER）
        [NameInMap("entry_type")]
        [Validation(Required=false)]
        public string EntryType { get; set; }

        // 表达用户意图
        [NameInMap("prompt")]
        [Validation(Required=true)]
        public string Prompt { get; set; }

        // 参考样式
        [NameInMap("reference_style")]
        [Validation(Required=false)]
        public CreativeAssetRef ReferenceStyle { get; set; }

        // 输入元素
        [NameInMap("input_elements")]
        [Validation(Required=false)]
        public List<CreativeAssetRef> InputElements { get; set; }

        // 使用场景
        [NameInMap("scene")]
        [Validation(Required=false)]
        public string Scene { get; set; }

        // 生图宽度
        [NameInMap("width")]
        [Validation(Required=false)]
        public long? Width { get; set; }

        // 生图高度
        [NameInMap("height")]
        [Validation(Required=false)]
        public long? Height { get; set; }

    }

}
