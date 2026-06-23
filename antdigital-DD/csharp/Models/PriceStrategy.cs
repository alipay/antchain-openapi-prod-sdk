// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 价格策略
    public class PriceStrategy : TeaModel {
        // 继承租户在商品下的价格，仅后付费商品生效
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088123412341234</para>
        /// </summary>
        [NameInMap("follow_tenant_id")]
        [Validation(Required=false)]
        public string FollowTenantId { get; set; }

    }

}
