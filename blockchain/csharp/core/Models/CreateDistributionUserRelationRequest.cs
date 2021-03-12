// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateDistributionUserRelationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 上级用户唯一标识
        [NameInMap("from_user_id")]
        [Validation(Required=false)]
        public string FromUserId { get; set; }

        // 商品唯一标识
        [NameInMap("item_id")]
        [Validation(Required=false)]
        public string ItemId { get; set; }

        // 商户唯一标识
        [NameInMap("shop_id")]
        [Validation(Required=true)]
        public string ShopId { get; set; }

        // 来源，微信朋友圈/微信小程序/支付宝小程序/H5/商户自有APP/其他
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 用户唯一标识
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

    }

}
