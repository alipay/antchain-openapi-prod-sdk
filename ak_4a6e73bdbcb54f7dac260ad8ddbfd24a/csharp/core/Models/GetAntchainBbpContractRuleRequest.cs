// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_4a6e73bdbcb54f7dac260ad8ddbfd24a.Models
{
    public class GetAntchainBbpContractRuleRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 服务商code
        [NameInMap("sup_code")]
        [Validation(Required=true)]
        public string SupCode { get; set; }

    }

}
