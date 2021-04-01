// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class CreateConsumecardGoodsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 商品授权类型
        [NameInMap("auth_type")]
        [Validation(Required=true)]
        public long? AuthType { get; set; }

        // 请求参数
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequest BaseRequest { get; set; }

        // 默认价格(单位:元,精确到分)
        [NameInMap("default_price")]
        [Validation(Required=true)]
        public string DefaultPrice { get; set; }

        // 代理操作的链上ID
        [NameInMap("delegate_account_id")]
        [Validation(Required=true)]
        public string DelegateAccountId { get; set; }

        // 商品描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 商品描述图片url，多个图片间用;隔开
        [NameInMap("desc_images")]
        [Validation(Required=true)]
        public string DescImages { get; set; }

        // 商品标价
        [NameInMap("display_price")]
        [Validation(Required=true)]
        public string DisplayPrice { get; set; }

        // 商品名称
        [NameInMap("goods_name")]
        [Validation(Required=true)]
        public string GoodsName { get; set; }

        // 商品类型
        [NameInMap("goods_type")]
        [Validation(Required=true)]
        public string GoodsType { get; set; }

        // 是否公开
        [NameInMap("if_public")]
        [Validation(Required=true)]
        public bool? IfPublic { get; set; }

        // 商品主图片url
        [NameInMap("image")]
        [Validation(Required=true)]
        public string Image { get; set; }

        // 商品每日上限
        [NameInMap("limit_per_user_and_day")]
        [Validation(Required=true)]
        public long? LimitPerUserAndDay { get; set; }

        // 商品每月上限
        [NameInMap("limit_per_user_and_month")]
        [Validation(Required=true)]
        public long? LimitPerUserAndMonth { get; set; }

        // 商品库存
        [NameInMap("total_count")]
        [Validation(Required=true)]
        public long? TotalCount { get; set; }

        // 商品有效结束时间(UNIX毫秒时间戳)
        [NameInMap("valid_not_after")]
        [Validation(Required=true)]
        public long? ValidNotAfter { get; set; }

        // 商品有效开始时间(UNIX毫秒时间戳)
        [NameInMap("valid_not_before")]
        [Validation(Required=true)]
        public long? ValidNotBefore { get; set; }

        // 备注信息
        [NameInMap("memo")]
        [Validation(Required=false)]
        public string Memo { get; set; }

    }

}
