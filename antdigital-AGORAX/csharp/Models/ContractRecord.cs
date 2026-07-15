// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 合约部署记录
    public class ContractRecord : TeaModel {
        // abi对应oss key
        /// <summary>
        /// <b>Example:</b>
        /// <para>abi-oss-key</para>
        /// </summary>
        [NameInMap("abi_oss_key")]
        [Validation(Required=true)]
        public string AbiOssKey { get; set; }

        // abi oss 地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>abi-oss-url</para>
        /// </summary>
        [NameInMap("abi_oss_url")]
        [Validation(Required=false)]
        public string AbiOssUrl { get; set; }

        // 区块链唯一标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>0001bcde</para>
        /// </summary>
        [NameInMap("bizid")]
        [Validation(Required=true)]
        public string Bizid { get; set; }

        // 区块链名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>合约体验链</para>
        /// </summary>
        [NameInMap("blockchain_name")]
        [Validation(Required=true)]
        public string BlockchainName { get; set; }

        // bytecode对应oss key
        /// <summary>
        /// <b>Example:</b>
        /// <para>bytecode-oss-key</para>
        /// </summary>
        [NameInMap("bytecode_oss_key")]
        [Validation(Required=true)]
        public string BytecodeOssKey { get; set; }

        // bytecode oss 地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>bytecode-oss-url</para>
        /// </summary>
        [NameInMap("bytecode_oss_url")]
        [Validation(Required=false)]
        public string BytecodeOssUrl { get; set; }

        // 16进制表示的合约identity
        /// <summary>
        /// <b>Example:</b>
        /// <para>e7d3e769f3f593dadcb8634cc5b09fc90dd3a61c4a06a79cb0923662fe6fae6b</para>
        /// </summary>
        [NameInMap("identity")]
        [Validation(Required=true)]
        public string Identity { get; set; }

        // 合约代码中定义的合约实例名，比如solidity的contract 关键字后面的命名
        /// <summary>
        /// <b>Example:</b>
        /// <para>instance-name</para>
        /// </summary>
        [NameInMap("instance_name")]
        [Validation(Required=true)]
        public string InstanceName { get; set; }

        // 合约名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>contract-name</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 发布状态，1未发布，3已发布
        /// <summary>
        /// <b>Example:</b>
        /// <para>3</para>
        /// </summary>
        [NameInMap("publish")]
        [Validation(Required=true)]
        public long? Publish { get; set; }

        // 交易hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>e93372533f323b2f12783aa3a586135cf421486439c2cdcde47411b78f9839ec</para>
        /// </summary>
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

        // solidity|cpp|go
        /// <summary>
        /// <b>Example:</b>
        /// <para>solidity</para>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
