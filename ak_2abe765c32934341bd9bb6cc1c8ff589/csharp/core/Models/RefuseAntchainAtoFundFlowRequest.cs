// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_2abe765c32934341bd9bb6cc1c8ff589.Models
{
    public class RefuseAntchainAtoFundFlowRequest : TeaModel {
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

        // 签署合同单号
        [NameInMap("sign_no")]
        [Validation(Required=true)]
        public string SignNo { get; set; }

        // 填写拒绝落章原因，如果同意则不用填写
        [NameInMap("sign_reason")]
        [Validation(Required=false)]
        public string SignReason { get; set; }

    }

}
