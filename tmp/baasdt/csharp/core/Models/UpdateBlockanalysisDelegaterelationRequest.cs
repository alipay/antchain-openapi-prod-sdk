// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class UpdateBlockanalysisDelegaterelationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 被代理的租户ID
        [NameInMap("delegated_tenant_id")]
        [Validation(Required=true)]
        public string DelegatedTenantId { get; set; }

        // 代理租户ID
        [NameInMap("opt_tenant_id")]
        [Validation(Required=true)]
        public string OptTenantId { get; set; }

        // 操作类型，ADD表示添加，SUB表示撤销
        [NameInMap("opt_type")]
        [Validation(Required=true)]
        public string OptType { get; set; }

    }

}
