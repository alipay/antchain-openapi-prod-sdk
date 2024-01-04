// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_195dff03d395462ea294bafdba69df3f.Models
{
    public class CancelAntchainAtoFundPlanRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单id 长度不可超过50
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 订单所属商户的社会信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

        // 取消原因 
        // ACTIVE_REDEEM:自主赎回
        // RENTING_OUT_REDEEM:退租赎回
        // RENTING_AND_RESALE_REDEEM:租转售赎回
        [NameInMap("cancel_reason")]
        [Validation(Required=true)]
        public string CancelReason { get; set; }

    }

}
