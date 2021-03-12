// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateDistributionProductItemRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 分销比例  10 表示 10%
        [NameInMap("distribution_rate")]
        [Validation(Required=true)]
        public string DistributionRate { get; set; }

        // 上架时间戳
        [NameInMap("enable_date")]
        [Validation(Required=true)]
        public string EnableDate { get; set; }

        // 划线价格
        [NameInMap("line_price")]
        [Validation(Required=true)]
        public string LinePrice { get; set; }

        // 商品id
        [NameInMap("product_id")]
        [Validation(Required=true)]
        public string ProductId { get; set; }

        // 商品封面图片url
        [NameInMap("product_img")]
        [Validation(Required=true)]
        public string ProductImg { get; set; }

        // 商品信息
        [NameInMap("product_info")]
        [Validation(Required=true)]
        public string ProductInfo { get; set; }

        // 商品名称
        [NameInMap("product_name")]
        [Validation(Required=true)]
        public string ProductName { get; set; }

        // 商品价格
        [NameInMap("product_price")]
        [Validation(Required=true)]
        public string ProductPrice { get; set; }

        // 商品类型
        [NameInMap("product_type")]
        [Validation(Required=true)]
        public string ProductType { get; set; }

        // 商户id
        [NameInMap("shop_id")]
        [Validation(Required=true)]
        public string ShopId { get; set; }

    }

}
