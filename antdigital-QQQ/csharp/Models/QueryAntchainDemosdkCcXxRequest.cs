// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.QQQ.Models
{
    public class QueryAntchainDemosdkCcXxRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // aa
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 测试
        [NameInMap("msg")]
        [Validation(Required=true)]
        public ResultTest Msg { get; set; }

    }

}
