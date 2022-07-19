// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APPEX.Models
{
    public class BindMypocketKmsaccountRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用户的DID
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 区块链ID
        [NameInMap("chain_id")]
        [Validation(Required=true)]
        public string ChainId { get; set; }

        // 用户的链上账户
        [NameInMap("chain_account")]
        [Validation(Required=true)]
        public string ChainAccount { get; set; }

        // 该链账户在BaaS服务的KMS ID 
        [NameInMap("kms_id")]
        [Validation(Required=true)]
        public string KmsId { get; set; }

    }

}
