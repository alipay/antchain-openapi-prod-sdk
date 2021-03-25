// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 设置过自定义价格的权益信息
    public class UserPriceEquity : TeaModel {
        // 权益提供商商户ID
        [NameInMap("admin_id")]
        [Validation(Required=true)]
        public string AdminId { get; set; }

        // 授权类型
        [NameInMap("auth_type")]
        [Validation(Required=true)]
        public long? AuthType { get; set; }

        // 币种
        [NameInMap("currency")]
        [Validation(Required=true)]
        public string Currency { get; set; }

        // 默认价格
        [NameInMap("default_price")]
        [Validation(Required=true)]
        public string DefaultPrice { get; set; }

        // 权益描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 权益描述图片
        [NameInMap("desc_images")]
        [Validation(Required=true)]
        public string DescImages { get; set; }

        // 权益ID
        [NameInMap("equity_d")]
        [Validation(Required=true)]
        public string EquityD { get; set; }

        // 权益名称
        [NameInMap("equity_name")]
        [Validation(Required=true)]
        public string EquityName { get; set; }

        // 权益类型
        [NameInMap("equity_type")]
        [Validation(Required=true)]
        public long? EquityType { get; set; }

        // 权益主图片
        [NameInMap("images")]
        [Validation(Required=true)]
        public string Images { get; set; }

        // 是否公开权益
        [NameInMap("is_public")]
        [Validation(Required=true)]
        public bool? IsPublic { get; set; }

        // 商户每日兑换上线
        [NameInMap("limit_per_merchant_and_day")]
        [Validation(Required=true)]
        public long? LimitPerMerchantAndDay { get; set; }

        // 商户每月兑换上线
        [NameInMap("limit_per_merchant_and_month")]
        [Validation(Required=true)]
        public long? LimitPerMerchantAndMonth { get; set; }

        // 用户每日兑换上线
        [NameInMap("limit_per_user_and_day")]
        [Validation(Required=true)]
        public long? LimitPerUserAndDay { get; set; }

        // 用户每月兑换上限
        [NameInMap("limit_per_user_and_month")]
        [Validation(Required=true)]
        public long? LimitPerUserAndMonth { get; set; }

        // 权益附言信息
        [NameInMap("memo")]
        [Validation(Required=true)]
        public string Memo { get; set; }

        // 授权的租户ID
        [NameInMap("open_to_tenant_id")]
        [Validation(Required=true)]
        public string OpenToTenantId { get; set; }

        // 用户价格
        [NameInMap("price")]
        [Validation(Required=true)]
        public string Price { get; set; }

        // 用户价格比例
        [NameInMap("ratio")]
        [Validation(Required=true)]
        public string Ratio { get; set; }

        // 快照租户价格
        [NameInMap("snapshot_tenant_price")]
        [Validation(Required=true)]
        public string SnapshotTenantPrice { get; set; }

        // 权益状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

        // 权益提供商租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 权益库存
        [NameInMap("total_count")]
        [Validation(Required=true)]
        public string TotalCount { get; set; }

        // 用户价格类型
        [NameInMap("user_price_type")]
        [Validation(Required=true)]
        public long? UserPriceType { get; set; }

        // 可用右区间
        [NameInMap("use_valid_not_after")]
        [Validation(Required=true)]
        public long? UseValidNotAfter { get; set; }

        // 可用左区间
        [NameInMap("use_valid_not_before")]
        [Validation(Required=true)]
        public long? UseValidNotBefore { get; set; }

        // 有效右区间
        [NameInMap("valid_not_after")]
        [Validation(Required=true)]
        public long? ValidNotAfter { get; set; }

        // 有效左区间
        [NameInMap("valid_not_before")]
        [Validation(Required=true)]
        public long? ValidNotBefore { get; set; }

        // 价值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
