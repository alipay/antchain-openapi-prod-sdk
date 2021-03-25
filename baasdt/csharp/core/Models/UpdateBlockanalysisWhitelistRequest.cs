// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class UpdateBlockanalysisWhitelistRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 链ID
        [NameInMap("chain_id")]
        [Validation(Required=true)]
        public string ChainId { get; set; }

        // 租户ID
        [NameInMap("opt_tenant_id")]
        [Validation(Required=true)]
        public string OptTenantId { get; set; }

        // 操作类型
        [NameInMap("opt_type")]
        [Validation(Required=true)]
        public string OptType { get; set; }

    }

}
