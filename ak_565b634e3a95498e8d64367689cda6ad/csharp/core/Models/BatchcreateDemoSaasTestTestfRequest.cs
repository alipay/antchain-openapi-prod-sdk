// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_565b634e3a95498e8d64367689cda6ad.Models
{
    public class BatchcreateDemoSaasTestTestfRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // test
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

    }

}
