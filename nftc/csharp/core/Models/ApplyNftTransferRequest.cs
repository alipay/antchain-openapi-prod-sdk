// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTC.Models
{
    public class ApplyNftTransferRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 藏品标识sku
        [NameInMap("sku_id")]
        [Validation(Required=true)]
        public long? SkuId { get; set; }

        // 被转入用户的支付宝uid和手机号
        [NameInMap("to_id_no")]
        [Validation(Required=true)]
        public string ToIdNo { get; set; }

        // 参照idType枚举
        [NameInMap("to_id_type")]
        [Validation(Required=true)]
        public string ToIdType { get; set; }

        // 用户购买价格，可以为0，单位分
        [NameInMap("price_cent")]
        [Validation(Required=true)]
        public long? PriceCent { get; set; }

        // 用户在商户购买的订单号
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 调用方渠道租户，传租户id即可
        [NameInMap("channel_tenant")]
        [Validation(Required=true)]
        public string ChannelTenant { get; set; }

    }

}
