// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 存证证明信息
    public class EvidenceCertificateInfo : TeaModel {
        // 证书编号
        [NameInMap("certificate_no")]
        [Validation(Required=true)]
        public string CertificateNo { get; set; }

        // 上链时间
        [NameInMap("certificate_time")]
        [Validation(Required=true)]
        public string CertificateTime { get; set; }

        // 链上交易hash
        [NameInMap("certificate_hash")]
        [Validation(Required=true)]
        public string CertificateHash { get; set; }

        // 证书下载url（有效期3天）
        [NameInMap("certificate_url")]
        [Validation(Required=true)]
        public string CertificateUrl { get; set; }

    }

}
