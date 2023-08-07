// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASPLUS.Models
{
    public class QueryEnterpriseBaseinfoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 0 为按照企业信用编码查询 1为按照企业名称查询
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 需要查询的企业关联信息
        [NameInMap("data")]
        [Validation(Required=true)]
        public string Data { get; set; }

    }

}
