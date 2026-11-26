// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class ListIotsuccessProductRequest : TeaModel {
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

        [NameInMap("external_id")]
        [Validation(Required=false)]
        public string ExternalId { get; set; }

        // 枚举:LICENSE,INSTANCE
        [NameInMap("authorization_mode")]
        [Validation(Required=false)]
        public string AuthorizationMode { get; set; }

        [NameInMap("from")]
        [Validation(Required=false)]
        public string From { get; set; }

        [NameInMap("to")]
        [Validation(Required=false)]
        public string To { get; set; }

    }

}
