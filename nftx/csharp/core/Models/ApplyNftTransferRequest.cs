// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTX.Models
{
    public class ApplyNftTransferRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // NFT发行成功的商品id
        [NameInMap("sku_id")]
        [Validation(Required=true)]
        public long? SkuId { get; set; }

        // C端用户的支付宝uid
        [NameInMap("to_id_no")]
        [Validation(Required=true)]
        public string ToIdNo { get; set; }

        // 仅支持 支付宝账号类型
        [NameInMap("to_id_type")]
        [Validation(Required=true)]
        public string ToIdType { get; set; }

        // 用户在商户购买的订单号，用作幂等字段
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 用户购买订单的价格，单位为分，可以为0；
        [NameInMap("price_cent")]
        [Validation(Required=false)]
        public long? PriceCent { get; set; }

        // 渠道租户
        [NameInMap("channel_tenant")]
        [Validation(Required=true)]
        public string ChannelTenant { get; set; }

    }

}
