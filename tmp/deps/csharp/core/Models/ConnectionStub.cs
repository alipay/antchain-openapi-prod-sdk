// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // ConnectionStub
    public class ConnectionStub : TeaModel {
        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // cloud
        [NameInMap("cloud")]
        [Validation(Required=false)]
        public Cloud Cloud { get; set; }

        // StubType
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // tenantName
        [NameInMap("tenant_name")]
        [Validation(Required=false)]
        public string TenantName { get; set; }

        // tenantId
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

    }

}
