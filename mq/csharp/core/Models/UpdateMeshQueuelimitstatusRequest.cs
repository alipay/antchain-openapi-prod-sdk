// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class UpdateMeshQueuelimitstatusRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 限流规则id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

    }

}
