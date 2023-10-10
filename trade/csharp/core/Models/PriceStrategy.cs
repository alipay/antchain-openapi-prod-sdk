// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TRADE.Models
{
    // 价格策略
    public class PriceStrategy : TeaModel {
        // 继承租户在商品下的价格
        [NameInMap("follow_tenant_id")]
        [Validation(Required=false)]
        public string FollowTenantId { get; set; }

    }

}
