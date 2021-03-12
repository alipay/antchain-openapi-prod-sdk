// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 合约部署记录
    public class ContractRecord : TeaModel {
        // abi对应oss key
        [NameInMap("abi_oss_key")]
        [Validation(Required=true)]
        public string AbiOssKey { get; set; }

        // abi oss 地址
        [NameInMap("abi_oss_url")]
        [Validation(Required=false)]
        public string AbiOssUrl { get; set; }

        // 区块链唯一标识
        [NameInMap("bizid")]
        [Validation(Required=true)]
        public string Bizid { get; set; }

        // 区块链名称
        [NameInMap("blockchain_name")]
        [Validation(Required=true)]
        public string BlockchainName { get; set; }

        // bytecode对应oss key
        [NameInMap("bytecode_oss_key")]
        [Validation(Required=true)]
        public string BytecodeOssKey { get; set; }

        // bytecode oss 地址
        [NameInMap("bytecode_oss_url")]
        [Validation(Required=false)]
        public string BytecodeOssUrl { get; set; }

        // 16进制表示的合约identity
        [NameInMap("identity")]
        [Validation(Required=true)]
        public string Identity { get; set; }

        // 合约代码中定义的合约实例名，比如solidity的contract 关键字后面的命名
        [NameInMap("instance_name")]
        [Validation(Required=true)]
        public string InstanceName { get; set; }

        // 合约名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 发布状态，1未发布，3已发布
        [NameInMap("publish")]
        [Validation(Required=true)]
        public long? Publish { get; set; }

        // 交易hash
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

        // solidity|cpp|go
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
