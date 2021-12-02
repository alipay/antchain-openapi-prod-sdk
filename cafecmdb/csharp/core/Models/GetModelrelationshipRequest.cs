// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAFECMDB.Models
{
    public class GetModelrelationshipRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 要获取的模型关联的目标模型的唯一标识
        [NameInMap("destination_model_id")]
        [Validation(Required=true)]
        public string DestinationModelId { get; set; }

        // 要获取的模型关联的源模型的唯一标识
        [NameInMap("source_model_id")]
        [Validation(Required=true)]
        public string SourceModelId { get; set; }

    }

}
