// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class QueryBlockanalysisWhitelistRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 查询该租户的白名单信息
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 查询链的白名单信息
        [NameInMap("chain_id")]
        [Validation(Required=false)]
        public string ChainId { get; set; }

    }

}
