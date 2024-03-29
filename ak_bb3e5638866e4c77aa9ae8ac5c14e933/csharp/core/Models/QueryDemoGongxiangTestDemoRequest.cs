// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_bb3e5638866e4c77aa9ae8ac5c14e933.Models
{
    public class QueryDemoGongxiangTestDemoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 验证字符
        [NameInMap("character1")]
        [Validation(Required=true)]
        public string Character1 { get; set; }

    }

}
