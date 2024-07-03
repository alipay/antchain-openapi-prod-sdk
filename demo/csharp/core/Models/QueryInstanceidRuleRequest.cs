// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    public class QueryInstanceidRuleRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 数字
        [NameInMap("count")]
        [Validation(Required=true)]
        public string Count { get; set; }

        // 姓名
        [NameInMap("oprator")]
        [Validation(Required=true)]
        public string Oprator { get; set; }

        // 结构体
        [NameInMap("struct")]
        [Validation(Required=true)]
        public TestA Struct { get; set; }

    }

}
