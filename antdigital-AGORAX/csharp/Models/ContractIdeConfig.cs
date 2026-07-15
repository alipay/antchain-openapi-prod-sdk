// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 合约链配置信息结果
    public class ContractIdeConfig : TeaModel {
        // 合约链的一个已创建的测试账户
        /// <summary>
        /// <b>Example:</b>
        /// <para>Tester001</para>
        /// </summary>
        [NameInMap("account_name")]
        [Validation(Required=true)]
        public string AccountName { get; set; }

        // 区块链唯一标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>0001bcde</para>
        /// </summary>
        [NameInMap("bizid")]
        [Validation(Required=true)]
        public string Bizid { get; set; }

        // 合约链的名字
        /// <summary>
        /// <b>Example:</b>
        /// <para>合约体验链</para>
        /// </summary>
        [NameInMap("chain_name")]
        [Validation(Required=true)]
        public string ChainName { get; set; }

        // 目标合约链的host地址
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://127.0.0.1">https://127.0.0.1</a></para>
        /// </summary>
        [NameInMap("host")]
        [Validation(Required=true)]
        public string Host { get; set; }

        // 说明是否开启wasm合约功能
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("is_wasm")]
        [Validation(Required=false)]
        public bool? IsWasm { get; set; }

        // 目标合约链服务公开的端口号
        /// <summary>
        /// <b>Example:</b>
        /// <para>18131</para>
        /// </summary>
        [NameInMap("port")]
        [Validation(Required=true)]
        public string Port { get; set; }

        // 合约链已创建的测试账户的密钥
        /// <summary>
        /// <b>Example:</b>
        /// <para>c8d6079a1ea7e5dba407998fecd89ac0783295c7e1a84d44e304b5314c765e73</para>
        /// </summary>
        [NameInMap("private_key")]
        [Validation(Required=true)]
        public string PrivateKey { get; set; }

        // 如果是TEE硬件隐私合约链，会包含此字段内容
        /// <summary>
        /// <b>Example:</b>
        /// <para>-----BEGIN PUBLIC KEY----- &lt;RSA公钥&gt; -----END PUBLIC KEY-----</para>
        /// </summary>
        [NameInMap("rsa_public_key")]
        [Validation(Required=false)]
        public string RsaPublicKey { get; set; }

        // 合约链的版本说明
        /// <summary>
        /// <b>Example:</b>
        /// <para>2.7</para>
        /// </summary>
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

    }

}
