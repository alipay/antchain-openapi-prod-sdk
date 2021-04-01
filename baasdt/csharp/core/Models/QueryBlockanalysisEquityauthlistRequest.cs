// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class QueryBlockanalysisEquityauthlistRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 链ID
        [NameInMap("chain_id")]
        [Validation(Required=true)]
        public string ChainId { get; set; }

        // 分页查询每页数量
        [NameInMap("count")]
        [Validation(Required=true)]
        public long? Count { get; set; }

        // 商品ID
        [NameInMap("equity_id")]
        [Validation(Required=true)]
        public string EquityId { get; set; }

        // 分页查询页码
        [NameInMap("page")]
        [Validation(Required=true)]
        public long? Page { get; set; }

        // 代理租户ID
        [NameInMap("delegated_tenant_id")]
        [Validation(Required=true)]
        public string DelegatedTenantId { get; set; }

    }

}
