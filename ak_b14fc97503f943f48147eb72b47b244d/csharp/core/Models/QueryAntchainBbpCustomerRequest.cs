// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_b14fc97503f943f48147eb72b47b244d.Models
{
    public class QueryAntchainBbpCustomerRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 查询内容
        [NameInMap("condition_map")]
        [Validation(Required=true)]
        public List<QueryMap> ConditionMap { get; set; }

    }

}
