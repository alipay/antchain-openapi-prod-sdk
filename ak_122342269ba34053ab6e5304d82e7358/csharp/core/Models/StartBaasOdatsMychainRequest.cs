// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_122342269ba34053ab6e5304d82e7358.Models
{
    public class StartBaasOdatsMychainRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 锚定块高
        [NameInMap("anchored_block_height")]
        [Validation(Required=false)]
        public long? AnchoredBlockHeight { get; set; }

        // 链id
        [NameInMap("bizid")]
        [Validation(Required=false)]
        public string Bizid { get; set; }

        // 详细描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 链域名
        [NameInMap("domain")]
        [Validation(Required=true)]
        public string Domain { get; set; }

        // {"mychainInfo":{"caCert":" mychain对应的cacert ","consensusNodeInfo":[{"ip":"","port":""},{"ip":"","port":""}]},"mychainAccount":{"account":"使用的链上账户","privateKey":"","privateKeyPwd":"","publicKey":"","recoveryPrivateKey":"","recoveryPrivateKeyPwd":"","recoveryPublicKey":""},"mychainTlsCert":{"cert":"链接链的证书","privateKey":"","privateKeyPwd":""}}
        [NameInMap("mychain_info")]
        [Validation(Required=true)]
        public string MychainInfo { get; set; }

    }

}
