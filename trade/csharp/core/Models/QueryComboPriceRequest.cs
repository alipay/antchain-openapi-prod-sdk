// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TRADE.Models
{
    public class QueryComboPriceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 套餐编码
        [NameInMap("combo_code")]
        [Validation(Required=true)]
        public string ComboCode { get; set; }

        // 租户ID，和租户名二选一必填
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 8位租户名，和租户ID二选一必填
        [NameInMap("tenant_name")]
        [Validation(Required=false)]
        public string TenantName { get; set; }

        // 订单类型，新购：NEW，不填则默认NEW
        [NameInMap("order_type")]
        [Validation(Required=false)]
        public string OrderType { get; set; }

        // 优惠券ID
        [NameInMap("coupon_id")]
        [Validation(Required=false)]
        public string CouponId { get; set; }

    }

}
