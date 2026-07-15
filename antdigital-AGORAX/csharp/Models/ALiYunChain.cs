// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 阿里云蚂蚁区块链信息
    public class ALiYunChain : TeaModel {
        // notary_blockchain
        /// <summary>
        /// <b>Example:</b>
        /// <para>notary_blockchain</para>
        /// </summary>
        [NameInMap("notary_blockchain")]
        [Validation(Required=false)]
        public ALiYunNotaryBlockchain NotaryBlockchain { get; set; }

        // contract_blockchain
        /// <summary>
        /// <b>Example:</b>
        /// <para>contract_blockchain</para>
        /// </summary>
        [NameInMap("contract_blockchain")]
        [Validation(Required=false)]
        public ALiYunContractBlockchain ContractBlockchain { get; set; }

        // old_contract_blockchain
        /// <summary>
        /// <b>Example:</b>
        /// <para>old_contract_blockchain</para>
        /// </summary>
        [NameInMap("old_contract_blockchain")]
        [Validation(Required=false)]
        public ALiYunOldContractBlockchain OldContractBlockchain { get; set; }

    }

}
