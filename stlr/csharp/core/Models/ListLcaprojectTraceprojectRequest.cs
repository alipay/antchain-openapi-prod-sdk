// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class ListLcaprojectTraceprojectRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 产品规格
        [NameInMap("specification")]
        [Validation(Required=true)]
        public string Specification { get; set; }

        // 列表数量
        [NameInMap("limit")]
        [Validation(Required=false)]
        public long? Limit { get; set; }

    }

}
