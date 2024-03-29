// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class DeleteCertificateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=true)]
        public string WorkspaceId { get; set; }

        // zone_id
        [NameInMap("zone_id")]
        [Validation(Required=true)]
        public string ZoneId { get; set; }

        // 多provider时选填
        [NameInMap("provider_id")]
        [Validation(Required=false)]
        public string ProviderId { get; set; }

    }

}
