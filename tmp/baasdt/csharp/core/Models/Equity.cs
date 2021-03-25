// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 权益
    public class Equity : TeaModel {
        // 权益管理员ID
        [NameInMap("admin_id")]
        [Validation(Required=true)]
        public string AdminId { get; set; }

        // 权益授权类型
        [NameInMap("auth_type")]
        [Validation(Required=true)]
        public long? AuthType { get; set; }

        // 权益锚定币种
        [NameInMap("currency")]
        [Validation(Required=true)]
        public string Currency { get; set; }

        // 权益默认价格
        [NameInMap("default_price")]
        [Validation(Required=true)]
        public string DefaultPrice { get; set; }

        // 权益描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 权益描述图片OSS地址 分号分隔
        [NameInMap("desc_images")]
        [Validation(Required=true)]
        public string DescImages { get; set; }

        // 权益附属信息
        [NameInMap("equity_ext_info")]
        [Validation(Required=true)]
        public EquityExtInfo EquityExtInfo { get; set; }

        // 权益ID
        [NameInMap("equity_id")]
        [Validation(Required=true)]
        public string EquityId { get; set; }

        // 权益名称
        [NameInMap("equity_name")]
        [Validation(Required=true)]
        public string EquityName { get; set; }

        // 商品类型，详见数字商品公约https://tech.antfin.com/docs/2/163896
        [NameInMap("equity_type")]
        [Validation(Required=true)]
        public string EquityType { get; set; }

        // 权益主图片OSS地址 分号;分隔
        [NameInMap("images")]
        [Validation(Required=true)]
        public string Images { get; set; }

        // 是否为公开权益
        [NameInMap("is_public")]
        [Validation(Required=true)]
        public bool? IsPublic { get; set; }

        // 商户每日兑换上限
        [NameInMap("limit_per_merchant_and_day")]
        [Validation(Required=true)]
        public long? LimitPerMerchantAndDay { get; set; }

        // 商户每月兑换上限
        [NameInMap("limit_per_merchant_and_month")]
        [Validation(Required=true)]
        public long? LimitPerMerchantAndMonth { get; set; }

        // 用户每日兑换上限
        [NameInMap("limit_per_user_and_day")]
        [Validation(Required=true)]
        public long? LimitPerUserAndDay { get; set; }

        // 用户每月兑换上限
        [NameInMap("limit_per_user_and_month")]
        [Validation(Required=true)]
        public long? LimitPerUserAndMonth { get; set; }

        // 附言
        [NameInMap("memo")]
        [Validation(Required=true)]
        public string Memo { get; set; }

        // 权益状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

        // 租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 权益库存
        [NameInMap("total_count")]
        [Validation(Required=true)]
        public string TotalCount { get; set; }

        // 权益使用有效期右闭区间
        [NameInMap("use_valid_not_after")]
        [Validation(Required=true)]
        public long? UseValidNotAfter { get; set; }

        // 权益使用有效期左闭区间
        [NameInMap("use_valid_not_before")]
        [Validation(Required=true)]
        public long? UseValidNotBefore { get; set; }

        // 权益兑换有效期右闭区间
        [NameInMap("valid_not_after")]
        [Validation(Required=true)]
        public long? ValidNotAfter { get; set; }

        // 权益兑换有效期左闭区间
        [NameInMap("valid_not_before")]
        [Validation(Required=true)]
        public long? ValidNotBefore { get; set; }

        // 权益面值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

        // 是否计算手续费（0: 更新手续费版本前不在合约计算手续费，1: 在合约计算手续费）
        [NameInMap("commission_accepted")]
        [Validation(Required=true)]
        public long? CommissionAccepted { get; set; }

    }

}
