// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class SyncTradePlatformorderauditRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 商家id
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

        // 平台订单id
        [NameInMap("platform_order_id")]
        [Validation(Required=true)]
        public string PlatformOrderId { get; set; }

        // APPROVED同意REJECTED拒绝
        [NameInMap("operation")]
        [Validation(Required=true)]
        public string Operation { get; set; }

    }

}
