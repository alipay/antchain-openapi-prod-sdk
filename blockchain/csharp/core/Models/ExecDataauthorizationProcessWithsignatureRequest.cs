// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class ExecDataauthorizationProcessWithsignatureRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 区块链ID
        [NameInMap("blockchain_id")]
        [Validation(Required=true)]
        public string BlockchainId { get; set; }

        // 带签名的参数信息
        [NameInMap("parameters")]
        [Validation(Required=true)]
        public string Parameters { get; set; }

    }

}
