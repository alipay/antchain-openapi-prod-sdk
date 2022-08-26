// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_122342269ba34053ab6e5304d82e7358.Models
{
    // 区块链合约信息
    public class BlockchainContractInfo : TeaModel {
        // mychain上系统合约“am合约”的地址
        [NameInMap("am_contract_address")]
        [Validation(Required=false)]
        public string AmContractAddress { get; set; }

        // 区块链id
        [NameInMap("blockchain_id")]
        [Validation(Required=false)]
        public string BlockchainId { get; set; }

        // fabric合约
        [NameInMap("chain_code")]
        [Validation(Required=false)]
        public string ChainCode { get; set; }

        // mychain系统合约“oracle合约”地址
        // 
        [NameInMap("oracle_contract_address")]
        [Validation(Required=false)]
        public string OracleContractAddress { get; set; }

        // mychain链上系统合约“p2p合约”地址
        // 
        [NameInMap("p2p_contract_address")]
        [Validation(Required=false)]
        public string P2pContractAddress { get; set; }

        // mychain上wasm版系统合约“am合约”的链上地址
        [NameInMap("wasm_am_contract_address")]
        [Validation(Required=false)]
        public string WasmAmContractAddress { get; set; }

        // mychain wasm版系统合约“orcale合约”地址
        [NameInMap("wasm_oracle_contract_address")]
        [Validation(Required=false)]
        public string WasmOracleContractAddress { get; set; }

        // mychain上wasm版系统合约“p2p合约”链上地址
        [NameInMap("wasm_p2p_contract_address")]
        [Validation(Required=false)]
        public string WasmP2pContractAddress { get; set; }

    }

}
