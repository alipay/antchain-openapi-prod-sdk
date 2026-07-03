// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryRbbObtsZsearchRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 索引名称
        [NameInMap("index")]
        [Validation(Required=true)]
        public string Index { get; set; }

        // 类型名称
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 操作方法
        [NameInMap("operation_method")]
        [Validation(Required=false)]
        public string OperationMethod { get; set; }

        // 查询语句
        [NameInMap("entity_string")]
        [Validation(Required=false)]
        public string EntityString { get; set; }

    }

}
