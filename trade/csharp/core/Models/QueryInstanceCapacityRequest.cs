// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TRADE.Models
{
    public class QueryInstanceCapacityRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 租户ID，和租户名称二选一必填	
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 8位租户名，和租户ID二选一必填	
        [NameInMap("tenant_name")]
        [Validation(Required=false)]
        public string TenantName { get; set; }

        // 资源包状态，不传则默认查询有效；Valid：有效；Closed：已用完；Expired：已到期	
        // 
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 资源包商品码
        [NameInMap("commodity_code")]
        [Validation(Required=false)]
        public string CommodityCode { get; set; }

    }

}
