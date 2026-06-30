// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TESTJZQ.Models
{
    public class QuerySsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 测试用
        [NameInMap("name")]
        [Validation(Required=false)]
        public DemoClass Name { get; set; }

        // 1
        [NameInMap("test")]
        [Validation(Required=false)]
        public string Test { get; set; }

        // 12
        [NameInMap("test_new")]
        [Validation(Required=false)]
        public TestNew TestNew { get; set; }

    }

}
