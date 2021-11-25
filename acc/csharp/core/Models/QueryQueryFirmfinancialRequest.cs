// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    public class QueryQueryFirmfinancialRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 企业Id
        [NameInMap("firm_id")]
        [Validation(Required=true)]
        public long? FirmId { get; set; }

        // 租户信息
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 查询类型（1：查询状态，2：财报信息）
        [NameInMap("query_options")]
        [Validation(Required=true)]
        public string QueryOptions { get; set; }

    }

}
