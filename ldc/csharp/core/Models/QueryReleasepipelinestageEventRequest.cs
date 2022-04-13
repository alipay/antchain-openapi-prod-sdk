// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class QueryReleasepipelinestageEventRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 发布单发布分组的id，对应ReleasePipeline中的stage
        [NameInMap("stage_id")]
        [Validation(Required=true)]
        public string StageId { get; set; }

    }

}
