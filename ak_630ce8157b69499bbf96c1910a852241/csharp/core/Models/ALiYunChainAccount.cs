// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_630ce8157b69499bbf96c1910a852241.Models
{
    // 阿里云蚂蚁区块链账户创建信息
    public class ALiYunChainAccount : TeaModel {
        // account
        [NameInMap("account")]
        [Validation(Required=false)]
        public string Account { get; set; }

        // account_private_key
        [NameInMap("account_private_key")]
        [Validation(Required=false)]
        public string AccountPrivateKey { get; set; }

        // account_public_key
        [NameInMap("account_public_key")]
        [Validation(Required=false)]
        public string AccountPublicKey { get; set; }

        // account_recover_private_key
        [NameInMap("account_recover_private_key")]
        [Validation(Required=false)]
        public string AccountRecoverPrivateKey { get; set; }

        // account_recover_public_key
        [NameInMap("account_recover_public_key")]
        [Validation(Required=false)]
        public string AccountRecoverPublicKey { get; set; }

        // ant_chain_id
        [NameInMap("ant_chain_id")]
        [Validation(Required=false)]
        public string AntChainId { get; set; }

    }

}
