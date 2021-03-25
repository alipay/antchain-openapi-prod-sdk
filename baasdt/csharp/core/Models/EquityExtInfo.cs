// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 权益附属信息
    public class EquityExtInfo : TeaModel {
        // 指定兑换日限制已使用
        [NameInMap("limit_per_day_used")]
        [Validation(Required=true)]
        public long? LimitPerDayUsed { get; set; }

        // 指定兑换月限制已使用
        [NameInMap("limit_per_month_used")]
        [Validation(Required=true)]
        public long? LimitPerMonthUsed { get; set; }

        // 权益开放的租户ID
        [NameInMap("open_to_tenant_id")]
        [Validation(Required=true)]
        public string OpenToTenantId { get; set; }

        // 指定日期
        [NameInMap("target_date")]
        [Validation(Required=true)]
        public string TargetDate { get; set; }

        // 权益对租户价格
        [NameInMap("tenant_price")]
        [Validation(Required=true)]
        public string TenantPrice { get; set; }

        // 授权给租户用户的价格
        [NameInMap("tenant_user_price")]
        [Validation(Required=true)]
        public UserPrice TenantUserPrice { get; set; }

        // 租户价格包括费率
        [NameInMap("tenant_price_with_commission")]
        [Validation(Required=true)]
        public string TenantPriceWithCommission { get; set; }

        // 费率
        [NameInMap("commission")]
        [Validation(Required=true)]
        public string Commission { get; set; }

    }

}
