// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAFECMDB.Models
{
    public class QueryModelrelationshipRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 目标模型的唯一标识
        [NameInMap("destination_model_id")]
        [Validation(Required=false)]
        public string DestinationModelId { get; set; }

    }

}
