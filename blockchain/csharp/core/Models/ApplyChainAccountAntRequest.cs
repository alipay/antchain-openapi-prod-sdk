// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class ApplyChainAccountAntRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // account
        [NameInMap("account")]
        [Validation(Required=false)]
        public string Account { get; set; }

        // ant_chain_id
        [NameInMap("ant_chain_id")]
        [Validation(Required=false)]
        public string AntChainId { get; set; }

        // password
        [NameInMap("password")]
        [Validation(Required=false)]
        public string Password { get; set; }

        // recover_password
        [NameInMap("recover_password")]
        [Validation(Required=false)]
        public string RecoverPassword { get; set; }

    }

}
