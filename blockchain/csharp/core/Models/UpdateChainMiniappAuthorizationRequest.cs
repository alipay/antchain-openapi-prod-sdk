// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class UpdateChainMiniappAuthorizationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // ant_chain_id
        [NameInMap("ant_chain_id")]
        [Validation(Required=false)]
        public string AntChainId { get; set; }

        // q_r_code_type
        [NameInMap("q_r_code_type")]
        [Validation(Required=false)]
        public string QRCodeType { get; set; }

        // authorization_type
        [NameInMap("authorization_type")]
        [Validation(Required=false)]
        public string AuthorizationType { get; set; }

    }

}
