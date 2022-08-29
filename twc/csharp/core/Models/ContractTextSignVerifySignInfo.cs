// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 文本签信息, 包含证书与签名
    public class ContractTextSignVerifySignInfo : TeaModel {
        // 签名信息
        [NameInMap("signature")]
        [Validation(Required=false)]
        public ContractTextSignVerifySignatureInfo Signature { get; set; }

        // 证书信息
        [NameInMap("cert")]
        [Validation(Required=false)]
        public ContractTextSignVerifyCertInfo Cert { get; set; }

    }

}
