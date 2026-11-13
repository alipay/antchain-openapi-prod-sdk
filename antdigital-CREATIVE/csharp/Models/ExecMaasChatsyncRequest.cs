// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVE.Models
{
    public class ExecMaasChatsyncRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 幂等标识，由客户端生成
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 文本模型编码
        [NameInMap("model")]
        [Validation(Required=true)]
        public string Model { get; set; }

        // 非空消息列表
        [NameInMap("messages")]
        [Validation(Required=true)]
        public List<ChatMessages> Messages { get; set; }

        // 模型参数 JSON 字符串
        [NameInMap("ext_params")]
        [Validation(Required=false)]
        public string ExtParams { get; set; }

    }

}
