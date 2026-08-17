// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.QMBRAIN.Models
{
    public class ExecOperationagentSsechatRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 模型类型
        [NameInMap("model")]
        [Validation(Required=true)]
        public string Model { get; set; }

        // 场景
        [NameInMap("scene")]
        [Validation(Required=false)]
        public string Scene { get; set; }

        // 请求内容
        [NameInMap("messages")]
        [Validation(Required=true)]
        public List<ChatMessage> Messages { get; set; }

    }

}
