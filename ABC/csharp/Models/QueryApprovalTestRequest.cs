// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ABC.Models
{
    public class QueryApprovalTestRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 入参
        [NameInMap("input")]
        [Validation(Required=true)]
        public string Input { get; set; }

        // 新增字段
        [NameInMap("delete")]
        [Validation(Required=true)]
        public string Delete { get; set; }

    }

}
