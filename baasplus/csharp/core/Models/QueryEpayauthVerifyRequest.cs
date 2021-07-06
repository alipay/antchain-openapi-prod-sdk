// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASPLUS.Models
{
    public class QueryEpayauthVerifyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 打款金额，只支持两位小数点的正数，单位：元
        [NameInMap("amount")]
        [Validation(Required=true)]
        public string Amount { get; set; }

        // 支付币种
        [NameInMap("currency")]
        [Validation(Required=true)]
        public string Currency { get; set; }

        // 打款验证ID 打款验证受理后生成的一个唯一标识
        [NameInMap("verify_id")]
        [Validation(Required=true)]
        public string VerifyId { get; set; }

    }

}
