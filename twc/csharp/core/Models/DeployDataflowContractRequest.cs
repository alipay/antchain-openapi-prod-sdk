// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class DeployDataflowContractRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 信封密钥。存证方本地自行派生一堆非对称密钥，将公钥作为信封密钥。存证方用户后续读取链上信息（如存证密钥、存证数据原文）时，为避免链上明文信息泄漏，会使用该信封密钥对所有链上数据进行加密后再返回，保障数据安全。
        [NameInMap("pubkey")]
        [Validation(Required=true)]
        public string Pubkey { get; set; }

    }

}
