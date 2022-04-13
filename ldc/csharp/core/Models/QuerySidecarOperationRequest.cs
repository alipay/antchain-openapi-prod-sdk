// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class QuerySidecarOperationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 运维单号
        [NameInMap("operation_id")]
        [Validation(Required=true)]
        public string OperationId { get; set; }

        // 是否带运维单执行详情
        [NameInMap("with_detail")]
        [Validation(Required=false)]
        public bool? WithDetail { get; set; }

    }

}
