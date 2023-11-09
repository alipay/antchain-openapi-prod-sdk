// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_2abe765c32934341bd9bb6cc1c8ff589.Models
{
    public class AuthAntchainAtoSignFlowRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 签署的电子合同ID
        [NameInMap("sign_no")]
        [Validation(Required=true, MaxLength=64)]
        public string SignNo { get; set; }

        // 签署区域的tag，和发起签署流程的机构的tag对应。
        [NameInMap("tag")]
        [Validation(Required=false, MaxLength=32)]
        public string Tag { get; set; }

        // 电子合同签署服务返回的biz_flow_id
        [NameInMap("biz_flow_id")]
        [Validation(Required=false, MaxLength=64)]
        public string BizFlowId { get; set; }

        // 电子合同签署服务的返回的account_id
        [NameInMap("account_id")]
        [Validation(Required=false, MaxLength=64)]
        public string AccountId { get; set; }

    }

}
