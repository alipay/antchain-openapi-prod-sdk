// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_2a208836e8ae421bb0fbcdbd0dab8d14.Models
{
    public class ImportDemoSaasTestTestbRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 李四
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 18
        [NameInMap("age")]
        [Validation(Required=true)]
        public long? Age { get; set; }

    }

}
