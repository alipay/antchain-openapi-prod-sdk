// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class UpdateNotarizationOrderRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 公证订单ID
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 如果出证失败，需要给出失败原因
        [NameInMap("reason")]
        [Validation(Required=false)]
        public string Reason { get; set; }

        // 出证状态的枚举值
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

    }

}
