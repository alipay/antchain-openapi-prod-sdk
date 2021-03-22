// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 消费卡商品信息
    public class GoodsResponse : TeaModel {
        // 商品归属的账户ID
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 商品名称
        [NameInMap("goods_name")]
        [Validation(Required=true)]
        public string GoodsName { get; set; }

        // 商品类型
        [NameInMap("goods_type")]
        [Validation(Required=true)]
        public string GoodsType { get; set; }

        // 商品描述信息
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 商品库存
        [NameInMap("total_count")]
        [Validation(Required=true)]
        public long? TotalCount { get; set; }

        // 显示价格
        [NameInMap("display_price")]
        [Validation(Required=true)]
        public string DisplayPrice { get; set; }

        // 默认价格
        [NameInMap("default_price")]
        [Validation(Required=true)]
        public string DefaultPrice { get; set; }

        // 是否公开商品
        [NameInMap("if_public")]
        [Validation(Required=true)]
        public bool? IfPublic { get; set; }

        // 商品主图片URL
        [NameInMap("images")]
        [Validation(Required=true)]
        public string Images { get; set; }

        // 商品描述图片，每个图片URL用:隔开
        [NameInMap("desc_images")]
        [Validation(Required=true)]
        public string DescImages { get; set; }

        // 商品状态 0可用，1下线
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

        // 商品开始时间
        [NameInMap("valid_not_before")]
        [Validation(Required=true)]
        public long? ValidNotBefore { get; set; }

        // 商品结束时间
        [NameInMap("valid_not_after")]
        [Validation(Required=true)]
        public long? ValidNotAfter { get; set; }

        // 商品每日上限
        [NameInMap("limit_per_user_and_day")]
        [Validation(Required=true)]
        public long? LimitPerUserAndDay { get; set; }

        // 商品每月上限
        [NameInMap("limit_per_user_and_month")]
        [Validation(Required=true)]
        public long? LimitPerUserAndMonth { get; set; }

        // 商品备注信息
        [NameInMap("memo")]
        [Validation(Required=true)]
        public string Memo { get; set; }

        // 授权类型
        [NameInMap("auth_type")]
        [Validation(Required=true)]
        public long? AuthType { get; set; }

        // 商品类型
        [NameInMap("category_id")]
        [Validation(Required=true)]
        public string CategoryId { get; set; }

        // 商品ID
        [NameInMap("goods_id")]
        [Validation(Required=true)]
        public string GoodsId { get; set; }

    }

}
