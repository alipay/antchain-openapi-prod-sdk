// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryDistributionProductItemRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 商品id
        [NameInMap("product_id")]
        [Validation(Required=false)]
        public string ProductId { get; set; }

        // 商户id
        [NameInMap("shop_id")]
        [Validation(Required=true)]
        public string ShopId { get; set; }

    }

}
