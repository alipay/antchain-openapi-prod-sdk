// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_122342269ba34053ab6e5304d82e7358.Models
{
    // 域名证书信息
    public class DomainCert : TeaModel {
        // 链域名
        // 
        [NameInMap("domain")]
        [Validation(Required=false)]
        public string Domain { get; set; }

        // 签发者公钥
        [NameInMap("issuer_public_key")]
        [Validation(Required=false)]
        public string IssuerPublicKey { get; set; }

        // 签发者签名
        [NameInMap("issuer_signature")]
        [Validation(Required=false)]
        public string IssuerSignature { get; set; }

        // 接受者公钥
        [NameInMap("subject_public_key")]
        [Validation(Required=false)]
        public string SubjectPublicKey { get; set; }

    }

}
