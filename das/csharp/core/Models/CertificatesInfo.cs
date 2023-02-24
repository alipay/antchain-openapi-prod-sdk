// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    // 简历证书信息
    public class CertificatesInfo : TeaModel {
        // 证书名称
        [NameInMap("certificate_name")]
        [Validation(Required=false, MaxLength=128)]
        public string CertificateName { get; set; }

    }

}
