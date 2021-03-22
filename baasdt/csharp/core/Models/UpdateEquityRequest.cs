// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class UpdateEquityRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 授权类型：0 Auto，1 Contract。不可修改，如需修改需重新发布商品
        [NameInMap("auth_type")]
        [Validation(Required=true)]
        public long? AuthType { get; set; }

        // 链ID
        [NameInMap("chain_id")]
        [Validation(Required=true)]
        public string ChainId { get; set; }

        // 货币类型。不可修改，如需修改需重新发布商品。
        [NameInMap("currency")]
        [Validation(Required=true)]
        public string Currency { get; set; }

        // 默认价格（单位：元）
        [NameInMap("default_price")]
        [Validation(Required=true)]
        public string DefaultPrice { get; set; }

        // 要代理的租户ID
        [NameInMap("delegated_tenant_id")]
        [Validation(Required=false)]
        public string DelegatedTenantId { get; set; }

        // 权益商品详细描述信息
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 描述图片信息(;分隔)
        [NameInMap("desc_images")]
        [Validation(Required=true)]
        public string DescImages { get; set; }

        // 权益商品ID
        [NameInMap("equity_id")]
        [Validation(Required=true)]
        public string EquityId { get; set; }

        // 权益商品名称
        [NameInMap("equity_name")]
        [Validation(Required=true)]
        public string EquityName { get; set; }

        // 权益商品类型：类型为整型（不大于：2147483647），需要进行细分，类型由三部分组成；aabbbbcccc。aa 为大类分类，bbbb 为细项分类（无细项分类时为0000），cccc 为数据格式分类（其中0000表示无格式要求）。请根据实际商品类型填写，具体类型和兑换时数据结构查看文档【https://tech.antfin.com/docs/2/163896】。不可修改，如需修改需重新发布商品
        [NameInMap("equity_type")]
        [Validation(Required=true)]
        public long? EquityType { get; set; }

        // 权益商品是否公开。不可修改，如需修改需重新发布商品
        [NameInMap("if_public")]
        [Validation(Required=true)]
        public bool? IfPublic { get; set; }

        // 主图片信息(;分隔)
        [NameInMap("images")]
        [Validation(Required=true)]
        public string Images { get; set; }

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
        [Validation(Required=false)]
        public string Memo { get; set; }

        // 交易ID
        [NameInMap("out_tx_id")]
        [Validation(Required=true)]
        public string OutTxId { get; set; }

        // 库存
        [NameInMap("total_count")]
        [Validation(Required=true)]
        public string TotalCount { get; set; }

        // 权益商品使用有效期结束时间（毫秒）
        [NameInMap("use_valid_not_after")]
        [Validation(Required=true)]
        public long? UseValidNotAfter { get; set; }

        // 权益商品使用有效期开始时间（毫秒）
        [NameInMap("use_valid_not_before")]
        [Validation(Required=true)]
        public long? UseValidNotBefore { get; set; }

        // 权益商品兑换有效期结束时间（毫秒）
        [NameInMap("valid_not_after")]
        [Validation(Required=true)]
        public long? ValidNotAfter { get; set; }

        // 权益商品兑换有效期开始时间（毫秒）
        [NameInMap("valid_not_before")]
        [Validation(Required=true)]
        public long? ValidNotBefore { get; set; }

        // 面值（单位：元）。不可修改，如需修改需重新发布商品
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
