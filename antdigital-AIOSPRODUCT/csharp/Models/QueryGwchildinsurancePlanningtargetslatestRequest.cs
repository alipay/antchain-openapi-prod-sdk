// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AIOSPRODUCT.Models
{
    public class QueryGwchildinsurancePlanningtargetslatestRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户标识，沿用已发布 Profile API 的租户校验。
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // JSON 字符串形式的业务请求；必须是单层 JSON 字符串，不能再次序列化成二层 JSON 字符串。
        [NameInMap("request_data")]
        [Validation(Required=true)]
        public string RequestData { get; set; }

    }

}
