// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_d3c4f09125a14cd587057c405561809a.Models
{
    public class QueryAntdigitalWebtrwatradeDistributorCrosschainaccountRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 对侧链用户地址
        [NameInMap("target_user_address")]
        [Validation(Required=true)]
        public string TargetUserAddress { get; set; }

        // 目标链
        [NameInMap("taget_chain_type")]
        [Validation(Required=true)]
        public string TagetChainType { get; set; }

    }

}
