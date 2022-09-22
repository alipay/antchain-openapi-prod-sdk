// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // FederatedService
    public class FederatedService : TeaModel {
        // metadata
        [NameInMap("metadata")]
        [Validation(Required=false)]
        public ObjectMeta Metadata { get; set; }

        // status
        [NameInMap("status")]
        [Validation(Required=false)]
        public FederatedServiceStatus Status { get; set; }

    }

}
