// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    public class QueryReportAppRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 报表类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 查询条件 JSON 序列化字符串，JSON 格式由type决定
        [NameInMap("query_json")]
        [Validation(Required=true)]
        public string QueryJson { get; set; }

    }

}
