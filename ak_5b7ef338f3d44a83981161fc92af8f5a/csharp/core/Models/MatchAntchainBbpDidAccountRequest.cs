// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_5b7ef338f3d44a83981161fc92af8f5a.Models
{
    public class MatchAntchainBbpDidAccountRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景码(YYX)
        [NameInMap("biz_code")]
        [Validation(Required=true)]
        public string BizCode { get; set; }

        // 支付宝uid
        [NameInMap("uid")]
        [Validation(Required=true)]
        public string Uid { get; set; }

        // 分布式id ，双向check
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 链id
        [NameInMap("chain_id")]
        [Validation(Required=false)]
        public string ChainId { get; set; }

        // 链账户
        [NameInMap("chain_account")]
        [Validation(Required=true)]
        public string ChainAccount { get; set; }

        // 托管情况下包含
        [NameInMap("kms_key_id")]
        [Validation(Required=false)]
        public string KmsKeyId { get; set; }

    }

}
