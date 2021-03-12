// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryChainMiniappTransactionRequest : TeaModel {
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
        [Validation(Required=true)]
        public string AntChainId { get; set; }

        // transaction_hash
        [NameInMap("transaction_hash")]
        [Validation(Required=true)]
        public string TransactionHash { get; set; }

        // phone_hash
        [NameInMap("phone_hash")]
        [Validation(Required=true)]
        public string PhoneHash { get; set; }

    }

}
