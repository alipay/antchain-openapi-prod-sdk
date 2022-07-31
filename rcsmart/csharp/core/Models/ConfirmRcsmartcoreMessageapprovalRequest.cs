// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RCSMART.Models
{
    public class ConfirmRcsmartcoreMessageapprovalRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 请求ID
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 商户ID
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

        // 规格code
        [NameInMap("spec_code")]
        [Validation(Required=true)]
        public string SpecCode { get; set; }

        // 审核场景
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // xxxx
        [NameInMap("message_data")]
        [Validation(Required=true)]
        public MessageDataVO MessageData { get; set; }

    }

}
