// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.QQQ.Models
{
    public class QueryAntchainDemosdkTesxRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 12
        [NameInMap("test")]
        [Validation(Required=false)]
        public DemoClass Test { get; set; }

        // 12
        [NameInMap("test_new")]
        [Validation(Required=false)]
        public TestDemo TestNew { get; set; }

    }

}
