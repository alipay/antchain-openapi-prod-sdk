// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 阿里云蚂蚁区块链信息
    public class ALiYunChain : TeaModel {
        // notary_blockchain
        [NameInMap("notary_blockchain")]
        [Validation(Required=false)]
        public ALiYunNotaryBlockchain NotaryBlockchain { get; set; }

        // contract_blockchain
        [NameInMap("contract_blockchain")]
        [Validation(Required=false)]
        public ALiYunContractBlockchain ContractBlockchain { get; set; }

        // old_contract_blockchain
        [NameInMap("old_contract_blockchain")]
        [Validation(Required=false)]
        public ALiYunOldContractBlockchain OldContractBlockchain { get; set; }

    }

}
