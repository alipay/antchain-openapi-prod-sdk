// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUQING.Models
{
    public class CreateProjectRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 创建内容
        [NameInMap("create_param")]
        [Validation(Required=true)]
        public Project CreateParam { get; set; }

        // requestId
        [NameInMap("request_id")]
        [Validation(Required=false)]
        public string RequestId { get; set; }

    }

}
