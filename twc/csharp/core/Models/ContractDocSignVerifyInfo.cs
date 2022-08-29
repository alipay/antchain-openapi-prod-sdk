// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 文件签署签署信息,包含证书与签名
    public class ContractDocSignVerifyInfo : TeaModel {
        // 证书信息
        [NameInMap("cert")]
        [Validation(Required=false)]
        public ContractDocSignVerifyCertInfo Cert { get; set; }

        // 签名信息
        [NameInMap("signature")]
        [Validation(Required=false)]
        public ContractDocSignVerifySignatureInfo Signature { get; set; }

        // 印章数据
        [NameInMap("seal_data")]
        [Validation(Required=false)]
        public string SealData { get; set; }

    }

}
