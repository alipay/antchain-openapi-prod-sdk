// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    public class ListBlockchainBotIotsuccessProductKnowledgebaseRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        [NameInMap("page_index")]
        [Validation(Required=false)]
        public long? PageIndex { get; set; }

        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

    }

}
