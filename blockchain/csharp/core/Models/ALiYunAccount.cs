// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 阿里云账户信息
    public class ALiYunAccount : TeaModel {
        // ant_chain_id
        [NameInMap("ant_chain_id")]
        [Validation(Required=false)]
        public string AntChainId { get; set; }

        // account
        [NameInMap("account")]
        [Validation(Required=false)]
        public string Account { get; set; }

        // account_public_key
        [NameInMap("account_public_key")]
        [Validation(Required=false)]
        public string AccountPublicKey { get; set; }

        // account_recovery_key
        [NameInMap("account_recovery_key")]
        [Validation(Required=false)]
        public string AccountRecoveryKey { get; set; }

        // account_status
        [NameInMap("account_status")]
        [Validation(Required=false)]
        public string AccountStatus { get; set; }

    }

}
