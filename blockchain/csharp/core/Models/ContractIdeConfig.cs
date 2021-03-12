// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 合约链配置信息结果
    public class ContractIdeConfig : TeaModel {
        // 合约链的一个已创建的测试账户
        [NameInMap("account_name")]
        [Validation(Required=true)]
        public string AccountName { get; set; }

        // 区块链唯一标识
        [NameInMap("bizid")]
        [Validation(Required=true)]
        public string Bizid { get; set; }

        // 合约链的名字
        [NameInMap("chain_name")]
        [Validation(Required=true)]
        public string ChainName { get; set; }

        // 目标合约链的host地址
        [NameInMap("host")]
        [Validation(Required=true)]
        public string Host { get; set; }

        // 说明是否开启wasm合约功能
        [NameInMap("is_wasm")]
        [Validation(Required=false)]
        public bool? IsWasm { get; set; }

        // 目标合约链服务公开的端口号
        [NameInMap("port")]
        [Validation(Required=true)]
        public string Port { get; set; }

        // 合约链已创建的测试账户的密钥
        [NameInMap("private_key")]
        [Validation(Required=true)]
        public string PrivateKey { get; set; }

        // 如果是TEE硬件隐私合约链，会包含此字段内容
        [NameInMap("rsa_public_key")]
        [Validation(Required=false)]
        public string RsaPublicKey { get; set; }

        // 合约链的版本说明
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

    }

}
