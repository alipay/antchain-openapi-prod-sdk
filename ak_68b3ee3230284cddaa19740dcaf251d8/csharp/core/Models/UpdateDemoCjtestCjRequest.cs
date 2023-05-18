// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_68b3ee3230284cddaa19740dcaf251d8.Models
{
    public class UpdateDemoCjtestCjRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 测试参数
        [NameInMap("var1")]
        [Validation(Required=true)]
        public string Var1 { get; set; }

        // 测试参数2
        [NameInMap("var2")]
        [Validation(Required=true)]
        public string Var2 { get; set; }

        // 被授权机构did
        [NameInMap("subject")]
        [Validation(Required=false)]
        public string Subject { get; set; }

    }

}
