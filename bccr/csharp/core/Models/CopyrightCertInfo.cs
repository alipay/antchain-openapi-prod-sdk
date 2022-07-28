// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 著作权人证件信息
    public class CopyrightCertInfo : TeaModel {
        // 证件号码
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 证件名称
        [NameInMap("cert_name")]
        [Validation(Required=true)]
        public string CertName { get; set; }

        // 证件类型
        [NameInMap("cert_type")]
        [Validation(Required=true)]
        public string CertType { get; set; }

    }

}
