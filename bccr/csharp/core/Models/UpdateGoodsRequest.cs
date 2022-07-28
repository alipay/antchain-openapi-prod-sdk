// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class UpdateGoodsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 商品id
        [NameInMap("goods_id")]
        [Validation(Required=true)]
        public string GoodsId { get; set; }

        // 商品价格（分）
        [NameInMap("standard_price_in_cent")]
        [Validation(Required=false)]
        public long? StandardPriceInCent { get; set; }

        // 商品状态:上架，下架
        [NameInMap("goods_status")]
        [Validation(Required=false)]
        public string GoodsStatus { get; set; }

    }

}
