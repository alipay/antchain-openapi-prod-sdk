// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class NotifyWaasBusinessOrderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务合作方id
        [NameInMap("business_id")]
        [Validation(Required=true)]
        public string BusinessId { get; set; }

        // 转账用户的did
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 业务转账订单id
        [NameInMap("business_order_id")]
        [Validation(Required=true)]
        public string BusinessOrderId { get; set; }

        // 订单结果
        [NameInMap("result")]
        [Validation(Required=true)]
        public string Result { get; set; }

        // 结果描述
        [NameInMap("result_message")]
        [Validation(Required=false)]
        public string ResultMessage { get; set; }

    }

}
