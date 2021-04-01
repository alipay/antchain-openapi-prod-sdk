// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateContractRecordRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // abi对应oss key
        [NameInMap("abi_oss_key")]
        [Validation(Required=true)]
        public string AbiOssKey { get; set; }

        // 区块链唯一标识
        [NameInMap("bizid")]
        [Validation(Required=true)]
        public string Bizid { get; set; }

        // bytecode对应oss key
        [NameInMap("bytecode_oss_key")]
        [Validation(Required=true)]
        public string BytecodeOssKey { get; set; }

        // 16进制表示的合约identity
        [NameInMap("identity")]
        [Validation(Required=true, MaxLength=64)]
        public string Identity { get; set; }

        // 合约代码中定义的合约实例名，比如solidity的contract 关键字后面的命名
        [NameInMap("instance_name")]
        [Validation(Required=true)]
        public string InstanceName { get; set; }

        // 合约名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 交易hash
        [NameInMap("tx_hash")]
        [Validation(Required=true, MaxLength=64)]
        public string TxHash { get; set; }

        // solidity|cpp|go
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
