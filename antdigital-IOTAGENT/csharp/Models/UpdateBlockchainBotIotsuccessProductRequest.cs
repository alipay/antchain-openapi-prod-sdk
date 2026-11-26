// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    public class UpdateBlockchainBotIotsuccessProductRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        [NameInMap("product_key")]
        [Validation(Required=true)]
        public string ProductKey { get; set; }

        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        [NameInMap("external_id")]
        [Validation(Required=false)]
        public string ExternalId { get; set; }

        [NameInMap("long_memory_enabled")]
        [Validation(Required=false)]
        public bool? LongMemoryEnabled { get; set; }

    }

}
