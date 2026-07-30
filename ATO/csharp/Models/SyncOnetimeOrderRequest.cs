// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class SyncOnetimeOrderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单id 长度大于6，小于50
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 订单所属商户的社会信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

        // 订单所属商户的名字
        [NameInMap("merchant_name")]
        [Validation(Required=true)]
        public string MerchantName { get; set; }

        // OneTimeOrderfoRequest请求参数
        [NameInMap("order_info")]
        [Validation(Required=true)]
        public string OrderInfo { get; set; }

    }

}
