// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class CreateCertificateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=true)]
        public string WorkspaceId { get; set; }

        // zoneId
        [NameInMap("zone_id")]
        [Validation(Required=false)]
        public string ZoneId { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // paas_region_id
        [NameInMap("paas_region_id")]
        [Validation(Required=true)]
        public string PaasRegionId { get; set; }

        // certificate
        [NameInMap("certificate")]
        [Validation(Required=true)]
        public string Certificate { get; set; }

        // privateKey
        [NameInMap("private_key")]
        [Validation(Required=true)]
        public string PrivateKey { get; set; }

        // cert_type
        [NameInMap("cert_type")]
        [Validation(Required=false)]
        public long? CertType { get; set; }

    }

}
