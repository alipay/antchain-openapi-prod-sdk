// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // BasicCertificate
    public class BasicCertificate : TeaModel {
        // serverCertificateId
        [NameInMap("server_certificate_id")]
        [Validation(Required=true)]
        public string ServerCertificateId { get; set; }

        // serverCertificateName
        [NameInMap("server_certificate_name")]
        [Validation(Required=true)]
        public string ServerCertificateName { get; set; }

        // fingerprint
        [NameInMap("fingerprint")]
        [Validation(Required=false)]
        public string Fingerprint { get; set; }

        // cert_type
        [NameInMap("cert_type")]
        [Validation(Required=true)]
        public long? CertType { get; set; }

    }

}
