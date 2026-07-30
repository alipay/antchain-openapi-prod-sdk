// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class InitOnetimeActivepayRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 单号
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 支付渠道
        [NameInMap("pay_channel")]
        [Validation(Required=true)]
        public string PayChannel { get; set; }

        // 回跳地址
        [NameInMap("return_url")]
        [Validation(Required=false)]
        public string ReturnUrl { get; set; }

    }

}
