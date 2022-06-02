// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    public class QueryApiAuthtemplatedefineRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // token
        [NameInMap("token")]
        [Validation(Required=true)]
        public string Token { get; set; }

        // message：短信
        // qrCode：二维码
        [NameInMap("action_type")]
        [Validation(Required=true)]
        public string ActionType { get; set; }

        // 依赖的数据值 比如身份证
        [NameInMap("depends_value")]
        [Validation(Required=true)]
        public string DependsValue { get; set; }

    }

}
