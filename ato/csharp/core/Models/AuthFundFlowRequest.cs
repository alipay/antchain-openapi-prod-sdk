// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class AuthFundFlowRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单所属商户的统一社会信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

        // 商户的订单号
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 签署的电子合同ID
        [NameInMap("sign_no")]
        [Validation(Required=true)]
        public string SignNo { get; set; }

        // 签署区域的tag，和发起签署流程的机构的tag对应
        [NameInMap("tag")]
        [Validation(Required=true)]
        public string Tag { get; set; }

    }

}
