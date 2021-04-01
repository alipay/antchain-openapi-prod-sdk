// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateChainAccountAntRequest : TeaModel {
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

        // account_pub_key
        [NameInMap("account_pub_key")]
        [Validation(Required=false)]
        public string AccountPubKey { get; set; }

        // account_recover_pub_key
        [NameInMap("account_recover_pub_key")]
        [Validation(Required=false)]
        public string AccountRecoverPubKey { get; set; }

        // ant_chain_id
        [NameInMap("ant_chain_id")]
        [Validation(Required=false)]
        public string AntChainId { get; set; }

    }

}
