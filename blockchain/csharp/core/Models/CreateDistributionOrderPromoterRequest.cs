// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateDistributionOrderPromoterRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 购买用户id
        [NameInMap("buyer_id")]
        [Validation(Required=true)]
        public string BuyerId { get; set; }

        // 佣金
        [NameInMap("commission")]
        [Validation(Required=true)]
        public string Commission { get; set; }

        // 佣金比例 10表示10%
        [NameInMap("commission_rate")]
        [Validation(Required=true)]
        public string CommissionRate { get; set; }

        // 推广订单id
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 订单金额
        [NameInMap("order_price")]
        [Validation(Required=true)]
        public string OrderPrice { get; set; }

        // 推广人上级ID
        [NameInMap("prev_promoter_id")]
        [Validation(Required=true)]
        public string PrevPromoterId { get; set; }

        // 推广人上级分佣金额
        [NameInMap("prev_promoter_price")]
        [Validation(Required=true)]
        public string PrevPromoterPrice { get; set; }

        // 商品id
        [NameInMap("product_id")]
        [Validation(Required=true)]
        public string ProductId { get; set; }

        // 推广人id
        [NameInMap("promoter_id")]
        [Validation(Required=true)]
        public string PromoterId { get; set; }

    }

}
