// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class UpdateDistributionFundPromoterRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 可提现余额
        [NameInMap("balance")]
        [Validation(Required=true)]
        public string Balance { get; set; }

        // 推广人id
        [NameInMap("promoter_id")]
        [Validation(Required=true)]
        public string PromoterId { get; set; }

        // 待结算
        [NameInMap("settle_quota")]
        [Validation(Required=true)]
        public string SettleQuota { get; set; }

        // 商户id
        [NameInMap("shop_id")]
        [Validation(Required=true)]
        public string ShopId { get; set; }

    }

}
